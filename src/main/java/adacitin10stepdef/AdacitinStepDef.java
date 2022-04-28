package adacitin10stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdacitinStepDef {
	WebDriver driver;
	@Given("user is on Adacitin hotel app on chrome browser")
	public void user_is_on_Adacitin_hotel_app_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com//");
	   
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		WebElement textUserName = driver.findElement(By.id("username"));
		textUserName.sendKeys(string);
		
		WebElement textPassWord = driver.findElement(By.id("password"));
		textPassWord.sendKeys(string2);
		
	   	}

	@When("user should click on login buton")
	public void user_should_click_on_login_buton() {
		WebElement buttonLogin = driver.findElement(By.name("login"));
		buttonLogin.click();
		
	   }

	@When("user select {string}, {string} {string}, {string}, {string}, {string}, {string}, {string} And click continue button")
	public void user_select_And_click_continue_button(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		WebElement location = driver.findElement(By.id("location"));
		Select s=new Select(location);
		s.selectByValue(string);
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotels);
		s1.selectByVisibleText(string2);
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s2=new Select(roomType);
		s2.selectByValue(string3);
		
		WebElement numberOfRooms = driver.findElement(By.id("room_nos"));
		Select s3=new Select(numberOfRooms);
		s3.selectByValue(string4);
		
		WebElement checkInDate = driver.findElement(By.id("datepick_in"));
		checkInDate.sendKeys(string5);
		
		WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
		checkOutDate.sendKeys(string6);

		WebElement adultsPerRoom = driver.findElement(By.id("adult_room"));
		Select s4=new Select(adultsPerRoom);
		s4.selectByValue(string7);
		
		WebElement childrenPerRoom = driver.findElement(By.id("child_room"));
		Select s5=new Select(childrenPerRoom);
		s5.selectByValue(string8);
		
		
		}

	@When("user select the hotel and click continue for booking")
	public void user_select_the_hotel_and_click_continue_for_booking() {
		
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.name("continue")).click();

	}

	@When("user enter{string}, {string}, {string}, {string}, {string}, {string}, {string}and {string}")
	public void user_enter_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	
		WebElement firstName= driver.findElement(By.name("first_name"));
		firstName.sendKeys(string);
		
		WebElement lastName= driver.findElement(By.name("last_name"));
		lastName.sendKeys(string2);
				
		WebElement billingAddress= driver.findElement(By.id("address"));
		billingAddress.sendKeys(string3);
		
		WebElement creditCardNo= driver.findElement(By.id("cc_num"));
		creditCardNo.sendKeys(string4);
		
		WebElement creditCardType = driver.findElement(By.id("cc_type"));
		Select s6=new Select(creditCardType);
		s6.selectByValue(string5);
				 
		 WebElement month = driver.findElement(By.id("cc_exp_month"));
		 Select s7=new Select(month);
		 s7.selectByValue(string6);
		 		   
		  WebElement year = driver.findElement(By.id("cc_exp_year"));
		  Select s8=new Select(year);
		  s8.selectByValue(string7);
		   
		  WebElement cvvNumber= driver.findElement(By.id("cc_cvv"));
		  cvvNumber.sendKeys(string8);
		 	   
	}

	@When("user click on continue for genrating order id")
	public void user_click_on_continue_for_genrating_order_id() {
		
		driver.findElement(By.name("book_now")).click();

	  	}

	@When("user print order Id to console")
	public void user_print_order_Id_to_console() throws InterruptedException {
		Thread.sleep(5000);
		WebElement searchTextBox = driver.findElement(By.id("order_no"));
		
		String value=searchTextBox.getAttribute("value");
		System.out.println("Booking id is : "+value);
		}

	@Then("user should verify home paga is present or not")
	public void user_should_verify_home_paga_is_present_or_not() {
	   System.out.println("Invaliuserid");
	  
	}
	 

}
