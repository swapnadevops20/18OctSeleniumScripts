package com.qa.seleniumscriptsDemo_FF;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SMJ_BaseDriver_FF {

	public static WebDriver driver;
	public static void openBrowser()
	{
		   driver = new FirefoxDriver();

		
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
