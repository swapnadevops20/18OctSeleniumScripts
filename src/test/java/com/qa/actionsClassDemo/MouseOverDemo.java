package com.qa.actionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverDemo {
	
	@Test
	public void MouseOverActionDemo() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		  driver.manage().window().maximize();
		  WebElement e1=driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		  Actions a = new Actions(driver);
		a.moveToElement(e1).perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[5]/span")).click();
		  
		  
	}

}
