package com.qa.TestNGParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
	}
	@Test
	public void createaccount() {
		driver.findElement(By.xpath("//input[starts-with(@name ,'name')]")).clear();
		
	}
	

}
