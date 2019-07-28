package com.maliha.stepdef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;

import com.maliha.common.NewToursBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class flightReservation extends NewToursBase{
	
	//WebDriver driver;

	@When("^I enter my username and password$")
	public void i_enter_my_username_and_password() throws IOException {
	
	//	driver = new ChromeDriver();
	//	driver.get("http://newtours.demoaut.com");
	driver = getDriver();
	//driver.get("http://newtours.demoaut.com");

	String title = driver.getTitle();
	System.out.println(title);
	//UserFlight u = new UserFlight(driver);
	driver.findElement(By.name("userName")).sendKeys("guest");
	//driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("guest");
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("guest");
		
	}

	@When("^I click on the Sign-in button$")
	public void i_click_on_the_Sign_in_button() {
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		driver.findElement(By.xpath("//input[@name='login']")).click();

	}

	@When("^I select tripType, passengers, departing from, on, arriving in, returning, class, airline$")
	public void i_select_tripType_passengers_departing_from_on_arriving_in_returning_class_airline() throws InterruptedException{
		
	driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
	//driver.findElement(By.name("passCount")).click();
		
		Select pass= new Select(driver.findElement(By.name("passCount")));
		pass.selectByVisibleText("2");
	//	pass_dd.selectByIndex(2);
		
		Select port= new Select(driver.findElement(By.name("fromPort")));
		port.selectByVisibleText("New York");
		Thread.sleep(1000);
		
		Select month= new Select(driver.findElement(By.name("fromMonth")));
		month.selectByVisibleText("October");
		
		Select day= new Select(driver.findElement(By.name("fromDay")));
		day.selectByVisibleText("26");
		
		Select to_port= new Select(driver.findElement(By.name("toPort")));
		to_port.selectByVisibleText("San Francisco");
		
		Select to_month= new Select(driver.findElement(By.name("toMonth")));
		to_month.selectByVisibleText("April");
		
		Select to_day= new Select(driver.findElement(By.name("toDay")));
		to_day.selectByVisibleText("23");
	
		Select air= new Select(driver.findElement(By.name("airline")));
		air.selectByVisibleText("Blue Skies Airlines");
		
		driver.findElement(By.xpath("//input[@value='First']")).click();
		
	}
	
	@Then("^I click continue$")
	public void i_click_continue() {

	driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	
/*
	 //When I book my departing and return flight
	driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']")).click();
	
	driver.findElement(By.xpath("//input[@value='Unified Airlines$633$303$18:44']")).click();
	
	driver.findElement(By.name("reserveFlights")).click();
	
	//And I enter my passenger names
	
	driver.findElement(By.name("passFirst0")).sendKeys("Maliha");
	driver.findElement(By.name("passLast0")).sendKeys("Mowla");
	
	Select mealFirst = new Select(driver.findElement(By.name("pass.0.meal")));
	mealFirst.selectByVisibleText("Muslim");
	
	driver.findElement(By.name("passFirst1")).sendKeys("Ishrat");
	driver.findElement(By.name("passLast1")).sendKeys("Mowla");
	
	Select mealSecond = new Select(driver.findElement(By.name("pass.1.meal")));
	mealSecond.selectByValue("LCML"); 
	
	//Select Credit information
	
	Select visa = new Select(driver.findElement(By.name("creditCard")));
	visa.selectByValue("BA");
	
	driver.findElement(By.name("creditnumber")).sendKeys("123456789");
	
	Select exp = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
	exp.selectByVisibleText("10");
	Select year = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
	year.selectByVisibleText("2010");
	
	driver.findElement(By.name("cc_frst_name")).sendKeys("Muktader");
	driver.findElement(By.name("cc_last_name")).sendKeys("Mowla");
	
	//Enter Billing address


Select country = new Select(driver.findElement(By.name("billCountry")));
country.selectByVisibleText("BAHAMAS");


Select country1 = new Select(driver.findElement(By.name("delCountry")));
country1.selectByVisibleText("ARGENTINA");

driver.

//driver.findElement(By.name("buyFlights")).click();

driver.findElement(By.xpath("//input[@name='buyFlights']")).click();

	*/

	}
}
