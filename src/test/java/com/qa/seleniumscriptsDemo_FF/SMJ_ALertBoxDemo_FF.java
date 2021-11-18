package com.qa.seleniumscriptsDemo_FF;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SMJ_ALertBoxDemo_FF {

	// Alert box is not a seperate window
	
			// WebDriver cannot click on any element on the alertbox
			
			// On alert box following actions can be tested
			
			// press ok  --> accept() or press on cancel  dismiss()
			// send data , sendkeys()

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement e1=driver.findElement(By.xpath("//input[@name='proceed']"));
		Thread.sleep(2000);
		e1.click();
		Thread.sleep(3000);
		
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		
		a.dismiss();    //close the alert

	}

}
