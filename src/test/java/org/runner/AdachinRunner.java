package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Adachin.feature",glue="org.adachinstepdef", monochrome=true,
dryRun=false,plugin = {"pretty","html:C:\\Users\\inigo\\eclipse-workspace\\TestingCucumper\\target",
"json:C:\\Users\\inigo\\eclipse-workspace\\TestingCucumper\\target\\adachinsample.json",
"junit:C:\\Users\\inigo\\eclipse-workspace\\TestingCucumper\\target\\adachinsample.xml"})

public class AdachinRunner {

}
