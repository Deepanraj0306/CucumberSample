package org.test;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Login.feature")
public class TestRunner3 {

	@AfterClass
	public static void reports() {

	}
}
