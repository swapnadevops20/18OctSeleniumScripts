
	
	package com.qa.TestNGParameters;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class Seleniumdemoparameter {
		
		@Parameters({"input"})
		@Test
		public void wikipage(String input) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.wikipedia.org/");
			// pass the value of input string when the method is run
			driver.findElement(By.id("searchInput")).sendKeys(input);
			Thread.sleep(5000);
			driver.close();
			
		}

	}


