package com.codecool.steps;

import com.codecool.support.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePageSteps {

    private WebDriverWait webDriverWait() {
        return new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
    }

    @Given("I open the carpenter website")
    public void i_open_the_carpenter_website() {
        Hooks.driver.get(Hooks.FRONTEND_URL);
    }

    @Then("I should see the home page")
    public void i_should_see_the_home_page() {
        webDriverWait().until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
    }

    @Then("I should see the business name and a short description of its offerings")
    public void i_should_see_the_business_name_and_description() {
        assertThat(Hooks.driver.findElement(By.tagName("h1")).getText()).isNotBlank();
        assertThat(Hooks.driver.findElement(By.cssSelector("p.lead")).getText()).isNotBlank();
    }

    @Then("I should see navigation to the other sections of the site")
    public void i_should_see_navigation() {
        assertThat(Hooks.driver.findElements(By.cssSelector("nav .nav-item"))).hasSizeGreaterThanOrEqualTo(3);
    }

    @When("I navigate to {string}")
    public void i_navigate_to(String sectionLabel) {
        Hooks.driver.findElement(By.xpath("//nav//button[contains(., '" + sectionLabel + "')]")).click();
    }

    @Then("I should see the {string} section")
    public void i_should_see_the_section(String sectionName) {
        webDriverWait().until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h1"), sectionName));
    }

    @When("I start a custom order request from the Contact section")
    public void i_start_a_custom_order_request() {
        Hooks.driver.findElement(By.xpath("//button[contains(., 'Start a custom order request')]")).click();
    }
}
