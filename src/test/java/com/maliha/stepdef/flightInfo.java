package com.maliha.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.maliha.common.NewToursBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class flightInfo extends NewToursBase {
	
	@Given("^I am on the fight information page$")
	public void i_am_on_the_fight_information_page() throws IOException {

		driver = getDriver();
		login();
	}
	

	@When("^I enter my flight information$")
	public void i_enter_my_flight_information() {
		driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']")).click();
		
		driver.findElement(By.xpath("//input[@value='Unified Airlines$633$303$18:44']")).click();
		
		driver.findElement(By.name("reserveFlights")).click();
		
	}

	@When("^I type first name and last name for passengers$")
	public void i_type_first_name_and_last_name_for_passengers() {
		driver.findElement(By.name("passFirst0")).sendKeys("Maliha");
		driver.findElement(By.name("passLast0")).sendKeys("Mowla");
		
		Select mealFirst = new Select(driver.findElement(By.name("pass.0.meal")));
		mealFirst.selectByVisibleText("Muslim");
		
		driver.findElement(By.name("passFirst1")).sendKeys("Ishrat");
		driver.findElement(By.name("passLast1")).sendKeys("Mowla");
		
		Select mealSecond = new Select(driver.findElement(By.name("pass.1.meal")));
		mealSecond.selectByValue("LCML");
		
	}

	@When("^I enter the credit card information$")
	public void i_enter_the_credit_card_information() {
		Select visa = new Select(driver.findElement(By.name("creditCard")));
		visa.selectByValue("BA");
		
		driver.findElement(By.name("creditnumber")).sendKeys("123456789");
		
		Select exp = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		exp.selectByVisibleText("10");
		Select year = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		year.selectByVisibleText("2010");
		
		driver.findElement(By.name("cc_frst_name")).sendKeys("Muktader");
		driver.findElement(By.name("cc_last_name")).sendKeys("Mowla");
		
	}

	@Then("^I click secure purchase$")
	public void i_click_secure_purchase() {

	driver.findElement(By.xpath("//input[@name='buyFlights']")).click(); 
	}


}
