package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Adacitin10.feature",glue="adacitin10stepdef",
monochrome=true,dryRun=false,plugin= {"pretty",
"html:C:\\Users\\inigo\\eclipse-workspace\\TestingCucumper\\target",
"json:C:\\Users\\inigo\\eclipse-workspace\\TestingCucumper\\target\\adacitin10.json",
"junit:C:\\Users\\inigo\\eclipse-workspace\\TestingCucumper\\target\\adacitin10.xml"})
public class Adacitin10Runner {

}
