package com.qa.actionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDropDemo {

	@Test
	public void DragDropDemo()
	{
		WebDriver driver = new ChromeDriver();
		  driver.get("https://jqueryui.com/droppable/");
		  driver.manage().window().maximize();
		  
		  driver.switchTo().frame(0);
		  
		  WebElement e1= driver.findElement(By.id("draggable"));
		  WebElement e2=driver.findElement(By.id("droppable"));
		  
		  Actions a = new Actions(driver);
		  
		 // a.dragAndDrop(e1, e2).perform();        //drag and drop
		  
		  a.clickAndHold(e1).moveToElement(e2).release().perform();

	}
}
