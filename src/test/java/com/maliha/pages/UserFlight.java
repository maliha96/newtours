package com.maliha.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UserFlight {

	WebDriver driver;
	public UserFlight(WebDriver driver) {	
		this.driver = driver;
		PageFactory.initElements(driver, this);			
	}
	
	
}
