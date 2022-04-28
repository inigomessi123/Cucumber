package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CucumberReports {
	public static void genrateJVMReport(String json) {
		
	File file=new File ("C:\\Users\\inigo\\eclipse-workspace\\TestingCucumper\\target");
	Configuration configuration=new Configuration(file,"facebook");
	
	configuration.addClassifications("Browser Name", "Chrome");
	configuration.addClassifications("Sprint No", "38");
	configuration.addClassifications("Platform", "Win-11");
	configuration.addClassifications("Environment", "VAT");

	List<String> li =new ArrayList<String>();
	li.add(json);
	ReportBuilder builder=new ReportBuilder(li,configuration);
	builder.generateReports();
	
	
	}
	

}
