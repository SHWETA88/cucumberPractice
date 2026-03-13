package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/com/featurefiles/login.feature",
		glue={"com.step_defination","com.hooks"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-report.html"},
		tags = "@smoke"
		)
public class LoginRunner {
	
}
