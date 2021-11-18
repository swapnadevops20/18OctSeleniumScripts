// h to manage/handle this error

package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SMJ_AlertBoxDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
         
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
 		
 		driver.findElement(By.id("confirmBox")).click();
 	
 			Thread.sleep(3000);
 		
 		Alert a = driver.switchTo().alert();    //Alert is a interface
 		
 		// dismiss() : click on cancel button on alert and close the alert box
 		
 		a.accept();
 		
 		/*
 		driver.findElement(By.id("promptBox")).click();
 		Alert a1 = driver.switchTo().alert();    //Alert is a interface
 		Thread.sleep(3000);
 		a1.sendKeys("QTP");
 		a1.accept();
 		
 		*/
	}

}
