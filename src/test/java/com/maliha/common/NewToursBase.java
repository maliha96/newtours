package com.maliha.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursBase {

	public WebDriver driver;
	
	public WebDriver getDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\13479\\eclipse-workspace\\newTours\\src\\test\\resources\\data.properties");
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		
		System.out.println(browser);
		
		if (browser.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\13479\\eclipse-workspace\\newTours\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", ".Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		}	
		else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Firefox driver");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\13479\\eclipse-workspace\\newTours\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else {
			System.out.println("wrong browser");
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public void login() {
		
		driver.findElement(By.name("userName")).sendKeys("guest");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("guest");
		driver.findElement(By.xpath("//input[@name='login']")).click();	
	}
	
	
	
}
