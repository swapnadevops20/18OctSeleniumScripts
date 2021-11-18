package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeandAfterMethod {
	
WebDriver driver;
		
	// @BeforeMethod
	// that before I execute a test case/method, i want to execute open browser method
	
	@BeforeMethod // this method will get executed before every test method
	public void OpenBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		System.out.println("beforeMethod is executed");
	}
	
	@Test(priority='1')
	public void radiobuttonTest()         //these are TC/TMethods
	{
		// locate radio button and click on it
		WebElement e1 =driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]"));
		e1.click();
		System.out.println("radiobutton Test method is executed");
	}
	
	@Test(priority='2')
	public void checkboxTest()      //these are TC/TMethods
	{
		WebElement e2=	driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]"));
		e2.click();
		System.out.println("checkbox Test method  is executed");
	}

	// @AfterMethod

	@AfterMethod
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
		System.out.println("After Method is executed");
	}
	
}
