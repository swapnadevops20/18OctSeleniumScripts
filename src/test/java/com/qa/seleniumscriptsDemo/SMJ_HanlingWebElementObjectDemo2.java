package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SMJ_HanlingWebElementObjectDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// test username ----
		
		//element is displayed or not 
		driver.findElement(By.id("login1")).isDisplayed(); // return an output true or false	
		
		// element is enabled or not,
		
		driver.findElement(By.id("login1")).isEnabled(); // return true or false
		
	//>  , enter data
		
	//	driver.findElement(By.id("login1")).sendKeys("sonal04");
		
		// Store locator value of an element
		
		  /*      int a=10;
		double s = 1.23;         */
		
		WebElement e1 =driver.findElement(By.id("login1"));
		
	boolean b1=	e1.isDisplayed();
	
	System.out.println(b1);
		
	boolean b2=	e1.isEnabled();
		
		if(b2==true)
		
		e1.sendKeys("sonal04");
		

	}

}
