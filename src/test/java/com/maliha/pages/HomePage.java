package com.maliha.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
WebDriver driver;
	
	public HomePage(WebDriver driver) {	
		this.driver = driver;
		PageFactory.initElements(driver, this);			
	}
	
	
	//driver.findElement(By.linkText("REGISTER")).click();
	
	@FindBy(linkText="REGISTER")
WebElement lnk_Registration;
	
	public WebElement link_Registration() {
		return lnk_Registration;
	}
	
	
	

}
