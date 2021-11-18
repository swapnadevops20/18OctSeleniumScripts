// 2 test cases
		// 1. enter an invalid email     2.  donot enter email


package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SMJ_ErrorTextDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1635298385&rver=7.0.6738.0&wp=MBI_SSL&wreply=https%3A%2F%2Faccount.microsoft.com%2Fauth%2Fcomplete-signin%3Fru%3Dhttps%253A%252F%252Faccount.microsoft.com%252F%253Frefd%253Daccount.microsoft.com%2526refp%253Dsignedout-index&lc=1033&id=292666&lw=1&fl=easi2&ru=https%3A%2F%2Faccount.microsoft.com%2Faccount%2Foutlook");
		
		WebElement e1 = driver.findElement(By.xpath("//input[@type='email']"));
		
		WebElement e2 =  driver.findElement(By.xpath("//input[@type='submit']"));
		
		//TestCase 1
		//  enter an invalid email
		
		e1.sendKeys("sonal042343553");
		//e1.sendKeys("swapna");

		Thread.sleep(2000);
		
		e2.click();
		
		Thread.sleep(2000);
		
		WebElement error = driver.findElement(By.id("usernameError"));
		
		String text = error.getText();
		
		System.out.println("the error text is :" + text);
		
		if(text.contains("account doesn't exist"))
		{
			System.out.println(" error text correct");
		}
		else
			System.out.println(" error text is not correct");
		
//		System.out.println(error.getText());


		
		//TestCase 2
		/*
		//donot enter email
		e2.click();
		
		Thread.sleep(2000);
		
		WebElement error = driver.findElement(By.id("usernameError"));
		
		String text = error.getText();
		
		System.out.println("the error text is :" + text);
		
		if(text.contains("account doesn't exist"))
		{
			System.out.println(" error text correct");
		}
		else
			System.out.println(" error text is not correct");
		
//		System.out.println(error.getText());
*/
	}

}
