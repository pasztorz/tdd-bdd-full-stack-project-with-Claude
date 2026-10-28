package com.codecool;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectDirectories;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectDirectories("features")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "com.codecool")
public class RunCucumberTest {
}
