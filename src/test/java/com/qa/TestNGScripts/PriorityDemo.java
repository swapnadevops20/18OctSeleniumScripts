package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityDemo {
  // to execute tc in sequence use priority
	//description about our TC
	@Test (priority='1')
	public void radiobuttonTest() throws InterruptedException
	{   //radio button on mozilla
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]"));
		e1.click();
		Thread.sleep(3000);
		driver.close();
	}
	@Test  (priority='2')
	public void CheckBoxTest() throws InterruptedException
	{   // checkbox on Red
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		WebElement e2=driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[2]"));
		e2.click();
		Thread.sleep(3000);
		driver.close();
	}
}
