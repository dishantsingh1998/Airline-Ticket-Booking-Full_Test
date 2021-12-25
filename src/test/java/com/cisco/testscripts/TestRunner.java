package com.cisco.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Feature",
		glue="com.cisco.testscripts")

public class TestRunner extends AbstractTestNGCucumberTests{
												
}

