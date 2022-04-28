package org.adachinstepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdachinStepDef {
	WebDriver driver;
	@Given("user is on adachin page on chrome browser")
	public void user_is_on_adachin_page_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com//");
		
	   
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		WebElement textUserName = driver.findElement(By.id("username"));
		textUserName.sendKeys("INIGOMESSI");
		
		WebElement textPassWord = driver.findElement(By.id("password"));
		textPassWord.sendKeys("raja@92");
	  	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement buttonLogin = driver.findElement(By.name("login"));
		buttonLogin.click();
		
	   	}
	@When("user should select the location")
	public void user_should_select_the_location() {
		WebElement location = driver.findElement(By.id("location"));
		Select s=new Select(location);
		s.selectByIndex(6);

	   }

	@When("user should select the hotels")
	public void user_should_select_the_hotels() {
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotels);
		s1.selectByVisibleText("Hotel Sunshine");
	   	}

	@When("user should choose the room type")
	public void user_should_choose_the_room_type() {
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s2=new Select(roomType);
		s2.selectByValue("Double");
	   
	}

	@When("user sholud choose number of rooms")
	public void user_sholud_choose_number_of_rooms() {

		WebElement numberOfRooms = driver.findElement(By.id("room_nos"));
		Select s3=new Select(numberOfRooms);
		s3.selectByValue("2");
	   	}

	@When("user should choose checkindate")
	public void user_should_choose_checkindate() {
		WebElement checkInDate = driver.findElement(By.id("datepick_in"));
		checkInDate.sendKeys("22/04/2022");
	  
	}

	@When("user should choose checkoutdate")
	public void user_should_choose_checkoutdate() {
		WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
		checkOutDate.sendKeys("23/04/2022");
	   
	}

	@When("user should mention adultsperroom")
	public void user_should_mention_adultsperroom() {
		WebElement adultsPerRoom = driver.findElement(By.id("adult_room"));
		Select s4=new Select(adultsPerRoom);
		s4.selectByValue("2");
	  	}

	@When("user should mention childrensperroom")
	public void user_should_mention_childrensperroom() {
		WebElement childrenPerRoom = driver.findElement(By.id("child_room"));
		Select s5=new Select(childrenPerRoom);
		s5.selectByValue("2");
	    	}

	@When("user should submit the details")
	public void user_should_submit_the_details() {

		 driver.findElement(By.name("Submit")).click();
	   	}

	@When("user should give the persional details")
	public void user_should_give_the_persional_details() {
		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.name("continue")).click();

		WebElement firstName= driver.findElement(By.name("first_name"));
		firstName.sendKeys("INIGO");
		
		WebElement lastName= driver.findElement(By.name("last_name"));
		lastName.sendKeys("RAJA");
				
		WebElement billingAddress= driver.findElement(By.id("address"));
		billingAddress.sendKeys("8/144,East street,HrKOTTAI.DGL");
		

	 	}

	@When("user should give credit card details")
	public void user_should_give_credit_card_details() {
		WebElement creditCardNo= driver.findElement(By.id("cc_num"));
		creditCardNo.sendKeys("6381162847958504");
		
		WebElement creditCardType = driver.findElement(By.id("cc_type"));
		Select s6=new Select(creditCardType);
		s6.selectByValue("VISA");
				 
		 WebElement month = driver.findElement(By.id("cc_exp_month"));
		 Select s7=new Select(month);
		 s7.selectByValue("7");
		 		   
		  WebElement year = driver.findElement(By.id("cc_exp_year"));
		  Select s8=new Select(year);
		  s8.selectByValue("2022");
		   
		  WebElement cvvNumber= driver.findElement(By.id("cc_cvv"));
		  cvvNumber.sendKeys("786");
		 	   
	}

	@When("user should booknow the room")
	public void user_should_booknow_the_room() {
		 driver.findElement(By.name("book_now")).click();
	  
	}
	@When("user print order Id to console")
	public void user_print_order_Id_to_console() throws InterruptedException {
		Thread.sleep(5000);
		WebElement T = driver.findElement(By.id("order_no"));
		String attribute = T.getAttribute("value");
		System.out.println(attribute);
		
		
	}
	
	@Then("used should verify homepage is displayed or not")
	public void used_should_verify_homepage_is_displayed_or_not() {
		System.out.println("Invalidusername");
	   
	}
}
