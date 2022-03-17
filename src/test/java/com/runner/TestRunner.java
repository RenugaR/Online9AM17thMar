package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Regression\\FacebookPage.feature", 
glue = "com.stepdef", monochrome = true, tags = {
		"~@TC02" }, dryRun = false, strict = true, 
				snippets = SnippetType.CAMELCASE, 
				plugin = {"pretty","json:target//cucumber.json","junit:target\\data.xml","html:target"})
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport("C:\\Users\\god\\eclipse-workspace\\Online9AM3rdMarchCucumber\\target\\cucumber.json");
	}
}
