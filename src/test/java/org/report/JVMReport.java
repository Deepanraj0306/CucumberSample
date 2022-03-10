package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class JVMReport {
	
	public  static void cucumberReport(String json) {
		File f=new File("C:\\Users\\PRITHA R\\eclipse-workspace\\CucumberPractice\\target");
		
		Configuration config=new Configuration(f,"CucumberPractice");
		
		config.addClassifications("SprintNumber","2");
		config.addClassifications("Functionality","Login");
		config.addClassifications("Windows","11");
		config.addClassifications("Browser","GC");
		config.addClassifications("BrowserVersion","98");
		
		List<String> l=new ArrayList<>();
		l.add(json);
		
		ReportBuilder r=new ReportBuilder(l, config);
		
		Reportable generateReports = r.generateReports();
		
		System.out.println(generateReports);
		
	}

}
