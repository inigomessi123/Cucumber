package org.runner;

import org.base.CucumberReports;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Fb10login.feature",
glue="org.fb10loginstepdef",monochrome=true,dryRun=false,
plugin= {"pretty","html:C:\\Users\\inigo\\eclipse-workspace\\TestingCucumper\\target",
"json:C:\\Users\\inigo\\eclipse-workspace\\TestingCucumper\\target\\fb10.json",
"junit:C:\\Users\\inigo\\eclipse-workspace\\TestingCucumper\\target\\fb10.xml"},
snippets=SnippetType.CAMELCASE,
strict=true,tags="@sample")

public class FbLogin10 {
	
	@AfterClass
	public static void afterclass() {
		CucumberReports.genrateJVMReport("C:\\Users\\\\inigo\\eclipse-workspace\\TestingCucumper\\target\\fb10.json");
		
	}

}
