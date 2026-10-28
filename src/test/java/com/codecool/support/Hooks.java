package com.codecool.support;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Hooks {

    public static final String FRONTEND_URL = "http://127.0.0.1:5173";

    private static Process frontendProcess;
    public static WebDriver driver;

    @BeforeAll
    public static void startFrontend() throws IOException, InterruptedException {
        boolean windows = System.getProperty("os.name").toLowerCase().contains("win");
        File logFile = new File("target/frontend-dev-server.log");
        logFile.getParentFile().mkdirs();
        ProcessBuilder processBuilder = new ProcessBuilder(
                windows ? "npm.cmd" : "npm", "run", "dev", "--", "--host", "127.0.0.1", "--port", "5173", "--strictPort")
                .directory(new File("frontend"))
                .redirectErrorStream(true)
                .redirectOutput(logFile);
        frontendProcess = processBuilder.start();
        waitUntilReady(FRONTEND_URL, Duration.ofSeconds(60));
    }

    @AfterAll
    public static void stopFrontend() {
        if (frontendProcess != null) {
            // frontendProcess is the npm.cmd wrapper; destroying only it leaves
            // the actual node/vite child process (and the port) orphaned.
            frontendProcess.descendants().forEach(ProcessHandle::destroy);
            frontendProcess.destroy();
        }
    }

    @Before
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        driver = new ChromeDriver(options);
    }

    @After
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    private static void waitUntilReady(String url, Duration timeout) throws InterruptedException {
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        long deadline = System.currentTimeMillis() + timeout.toMillis();
        while (System.currentTimeMillis() < deadline) {
            try {
                HttpResponse<Void> response = client.send(
                        HttpRequest.newBuilder(URI.create(url)).GET().build(),
                        HttpResponse.BodyHandlers.discarding());
                if (response.statusCode() == 200) {
                    return;
                }
            } catch (IOException ignored) {
                // not up yet, keep polling
            }
            Thread.sleep(500);
        }
        throw new IllegalStateException("Frontend dev server did not become ready at " + url);
    }
}
