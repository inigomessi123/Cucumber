package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver;
	@Given("user is on facebook page on chrome browser")
	public void user_is_on_facebook_page_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		WebElement textUserName = driver.findElement(By.id("email"));
		textUserName.sendKeys("inigo");
		
		WebElement textPassWord = driver.findElement(By.id("pass"));
		textPassWord.sendKeys("98765");
	   	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement buttonLogin = driver.findElement(By.name("login"));
		buttonLogin.click();
	  
	}

	@Then("used should verify homepage is displayed or not")
	public void used_should_verify_homepage_is_displayed_or_not() {
		System.out.println("Invalidusername");
	 	}




}
