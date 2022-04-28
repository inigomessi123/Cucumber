package org.fb10loginstepdef;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClass extends BaseClass {
	
	
@Before
public void beforeScenario() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
}
@After
public void afterScenario(Scenario s) {
	if (s.isFailed()) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[]ScreenshotAs=ts.getScreenshotAs(OutputType.BYTES);
		s.embed(ScreenshotAs,"s.png");
		
		
		driver.quit();
		
	}
	

}
}
