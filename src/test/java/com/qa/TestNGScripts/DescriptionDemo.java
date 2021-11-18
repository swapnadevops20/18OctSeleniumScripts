package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class DescriptionDemo {

	@Test(description="Testing Wiki Page")
	public void HomePageTest() throws InterruptedException   //test method
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.id("searchInput")).sendKeys("Selenium Automation"); //Entering data
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click(); //click the search btn
		Thread.sleep(3000);
		driver.close();
	}
}
