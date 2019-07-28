package com.maliha.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "Features",
		glue = "com.maliha.stepdef",
		tags = "@flightInfo"
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
