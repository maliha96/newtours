package com.maliha.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.maliha.common.NewToursBase;
import com.maliha.pages.HomePage;
import com.maliha.pages.Registration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegistration extends NewToursBase {
	
	
	
	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() throws IOException {
		
		driver = getDriver();
		driver.get("http://newtours.demoaut.com");
		
	}

	@When("^I click on Register link$")
	public void i_click_on_Register_link() {
		
		HomePage hp = new HomePage(driver);
		hp.link_Registration().click();

	}

	@When("^I enter first name, last name, user name, password, and confirm password$")
	public void i_enter_first_name_last_name_user_name_password_and_confirm_password() {
		
		//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Maliha");
		Registration r = new Registration(driver);
		r.firstName().sendKeys("Maliha");
		//driver.findElement(By.name("lastName")).sendKeys("Mowla");
		r.lastName().sendKeys("Mowla");
		//driver.findElement(By.cssSelector("#email")).sendKeys("Maliha");
		r.userName().sendKeys("Maliha");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password");
		r.password().sendKeys("Password");
		//driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Password");
		r.confirmPassword().sendKeys("Password");
		
	}

	@When("^i click on submit button$")
	public void i_click_on_submit_button() {
	driver.findElement(By.xpath("//input[@name='register']")).click();
	

	}

	@Then("^I receive sucessful user creation message$")
	public void i_receive_sucessful_user_creation_message() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Register: Mercury Tours");
		driver.close();

	}

}
