package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Authorization {
	
	@Test
	public void LoginInApplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://dev2-app.simplicapital.ai/actuals/receivables");
		driver.manage().window().maximize();
		System.out.println("Login Success");
		driver.quit();
	}
	@Test
	public void AddUser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://dev2-app.simplicapital.ai/actuals/receivables");
		driver.manage().window().maximize();
		System.out.println("User added");
		driver.quit();
		
	}
		
	}
	


