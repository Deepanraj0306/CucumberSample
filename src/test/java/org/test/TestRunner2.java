package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Facebook.feature",glue="org.step2",
monochrome=true,dryRun=false,plugin="junit:src\\test\\resources\\New\\Facebook.xml")
public class TestRunner2 {
	

}
