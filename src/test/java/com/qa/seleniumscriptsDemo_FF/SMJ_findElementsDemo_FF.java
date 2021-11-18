//This is finding the elements in firefox by using locators
//This webpage has static elements which values cannot change wen u refresh the webpage

package com.qa.seleniumscriptsDemo_FF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SMJ_findElementsDemo_FF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open firefox browser
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//It will open the wikipedia webpage in Firefox
		//In this webpage it has static elements
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Create");
		
		/*
		//1st way finding element and entering data by using locator id
		//find Username and enter the data
		driver.findElement(By.id("wpName2")).clear();  //   clear the text
		driver.findElement(By.id("wpName2")).sendKeys("admin");     // enter the data again   */

		/*
		//2nd way finding element and entering data by using locator name
		//find Username and enter the data
		driver.findElement(By.name("wpName")).clear(); //   clear the text
		driver.findElement(By.name("wpName")).sendKeys("admin");     // enter the data again   */
		
		/*
		//3rd way finding element and entering data by using locator xpath
		//find Username and enter the data
		driver.findElement(By.xpath("//*[@id=\"wpName2\"]")).clear(); //  clear the text 
		driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("admin");     // enter the data again   */
		//      //*[@id="wpName2"]
		
		 //4th way finding element and entering data by using locator CssSelector
		 //find Username and enter the data
		//
		driver.findElement(By.cssSelector("#wpName2")).clear(); //  clear the text 
		driver.findElement(By.cssSelector("input#wpName2")).sendKeys("admin");     // enter the data again 
		
		
				

		


	}

}
