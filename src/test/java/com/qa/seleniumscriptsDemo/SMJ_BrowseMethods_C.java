package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SMJ_BrowseMethods_C {

	public static void main(String[] args) {
		// TODO Auto
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		//Load URL Webpage to be opened in current window
		driver.get("https://www.wikipedia.org/");
		//-generated method stub
		//start chrome browser
		
		//getting ie fetch title of webpage
		String actTitle=driver.getTitle();
		System.out.println("Actual Title is :" +actTitle);  //selenium from webpage


		//compare actual and expected title
		String expectedTitle="Wikipedia";
		if (actTitle.equals(expectedTitle))
		{
			System.out.println("Title is correct");
		}
		else
			System.out.println("Title is not correct");

		
		

	}

}
