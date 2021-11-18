package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.By;

public class SMJ_FindElementDemo_C extends SMJ_BaseDriver_C{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openBrowser();       //calling ChromeDriver and WebDriver 
		
		//driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		//find the element 
		//driver.findElement(By.name(null)).sendKeys("admin");
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
		// find Username and enter data
		  
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


		/* driver.findElement(By.xpath("//*[@id=\"wpName2\"]")).clear();
           driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("admin");  */
		 
		 //3rd way
		 //by using cssSelector
		 driver.findElement(By.cssSelector("#wpName2")).clear();
		 driver.findElement(By.cssSelector("input#wpName2")).sendKeys("admin"); 

		

	}

}
