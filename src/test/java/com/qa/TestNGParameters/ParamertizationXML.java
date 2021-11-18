package com.qa.TestNGParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamertizationXML {
	
	@Parameters({"username","password"})
	@Test
	public void userNameTest(String username, String password) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1635298385&rver=7.0.6738.0&wp=MBI_SSL&wreply=https%3A%2F%2Faccount.microsoft.com%2Fauth%2Fcomplete-signin%3Fru%3Dhttps%253A%252F%252Faccount.microsoft.com%252F%253Frefd%253Daccount.microsoft.com%2526refp%253Dsignedout-index&lc=1033&id=292666&lw=1&fl=easi2&ru=https%3A%2F%2Faccount.microsoft.com%2Faccount%2Foutlook");
		
		WebElement e1 = driver.findElement(By.xpath("//input[@type='email']"));
		e1.clear();
		e1.sendKeys(username);
		Thread.sleep(2000);
		System.out.println("the password is : " + password);
	     driver.close();
		
	}

}