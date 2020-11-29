package com.examples.MyRunner;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import io.cucumber.testng.PickleWrapper;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= {"src/test/java/Features/Login.feature"},
		glue= {"StepDefinitions"},
dryRun = false
 )

public class TestRunner
{

 
}
