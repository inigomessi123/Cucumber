package org.fb10loginstepdef;

import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb10LoginStepDef {
	WebDriver driver;
	@Given("user is on fb application on chrome browser")
	public void user_is_on_fb_application_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	   
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		WebElement textUserName = driver.findElement(By.id("email"));
		textUserName.sendKeys(string);
		
		WebElement textPassWord = driver.findElement(By.id("pass"));
		 textPassWord.sendKeys("string2");
	    	}

	@When("user should click login button")
	public void user_should_click_login_button() {
	WebElement buttonLogin = driver.findElement(By.name("login"));
	
	Assert.assertTrue(false);
	
	 buttonLogin.click();
    	}

	@Then("user should verify home paga is present or not")
	public void user_should_verify_home_paga_is_present_or_not() {
		System.out.println("Invalidusername");
	   	}



}
