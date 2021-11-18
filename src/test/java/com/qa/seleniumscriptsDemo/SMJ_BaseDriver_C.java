package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SMJ_BaseDriver_C {

	public static WebDriver driver;
	public static void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
