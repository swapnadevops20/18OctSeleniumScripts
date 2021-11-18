

package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {
	// Alert box is not a seperate window
	
		// WebDriver cannot click on any element on the alertbox
		
		// On alert box following actions can be tested
		
		// press ok  --> accept() or press on cancel  dismiss()
		// send data , sendkeys()


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();       //delete all cookies

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement e1=driver.findElement(By.xpath("//input[@name='proceed']"));
		e1.click();
		Thread.sleep(3000);
		
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		
		a.dismiss();    //close the alert
	}

}
