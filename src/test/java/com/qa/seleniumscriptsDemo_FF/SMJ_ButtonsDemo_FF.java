//Scenario/TestCase
//1.It enters  the data   2.click on the button


package com.qa.seleniumscriptsDemo_FF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SMJ_ButtonsDemo_FF {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();    
		driver.manage().window().maximize();      //maximize
		
		driver.manage().deleteAllCookies();       //delete all cookies
		//opening signin microsoft browser
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1635323472&rver=7.0.6738.0&wp=MBI_SSL&wreply=https:%2F%2Faccount.microsoft.com%2Fauth%2Fcomplete-signin%3Fru%3Dhttps%253A%252F%252Faccount.microsoft.com%252F%253Frefp%253Dsignedout-index%2526refd%253Dwww.google.com&lc=1033&id=292666&lw=1&fl=easi2");
		
		//Inspect the button using xpath locator
		//xpath : //tagname[@attribute='value']
		
		//1st we r checking on email/phone textbox element
		boolean display=driver.findElement(By.xpath("//input[@type='email']")).isDisplayed() ;   //check if email box is displayed or not
		System.out.println("the element is displayed :" +display);
		//same element check it is enabled
		boolean enable=driver.findElement(By.xpath("//input[@type='email']")).isEnabled() ;   //check if email box is displayed or not
		System.out.println("the element is enabled "+enable);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dsreddy1234554321");
		Thread.sleep(3000);
		
		//2nd v r checking on Next button
		//driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();   //is the element displayed or not
		boolean enable1=driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();  // is the element enabled or not
		if(enable1==true)
		{
			driver.findElement(By.xpath("//input[@type='submit']")).click();;   //click on the element
		}


	}

}
