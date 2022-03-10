package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Login.feature",glue="org.step4",
monochrome=true,dryRun=false,plugin="json:C:\\Users\\PRITHA R\\eclipse-workspace\\CucumberPractice\\src\\test\\resources\\New\\Facebook.json")
public class TestRunner4 {
	
	@AfterClass
	public static void reports() {
		JVMReport.cucumberReport("C:\\Users\\PRITHA R\\eclipse-workspace\\CucumberPractice\\src\\test\\resources\\New\\Facebook.json");

	}

}
