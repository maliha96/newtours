package com.maliha.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	
	WebDriver driver;
	
	public Registration(WebDriver driver) {	
		this.driver = driver;
		PageFactory.initElements(driver, this);			
	}
	
	//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Maliha");
	
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement edt_firstName;
	
	public WebElement firstName() {
		return edt_firstName;
	}
	
	
	//driver.findElement(By.name("lastName")).sendKeys("Mowla");
	
	@FindBy(name="lastName")
	WebElement edt_lastName;
	
	public WebElement lastName() {
		return edt_lastName;
	}
	
	
	
	//driver.findElement(By.cssSelector("#email")).sendKeys("Maliha");
	
	@FindBy(css="#email")
	WebElement edt_userName;
	
	public WebElement userName() {
		return edt_userName;
		
	}
	
	
	//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password");
	
	@FindBy(xpath="//input[@type='password']")
	WebElement edt_password;
	
	public WebElement password() {
		return edt_password;
		
	}
	
	//driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Password");
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	WebElement edt_confirmPassword;
	
	public WebElement confirmPassword() {
		return edt_confirmPassword;
		
	}
	
	
	

}
