package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(3000);
		
		//TestCase 1 : frame names
		//links - linktext locator
		//frames names on the web page   : packageListFrame,packageFrame,classFrame
		driver.switchTo().frame("packageListFrame");   //switch to other window
		driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();  //click on it 
		Thread.sleep(3000);
		
		//v cannot switch frame to another frame directly
		//v had to use SwitchTo  parent frame
		driver.switchTo().parentFrame();
		driver.switchTo().frame("classFrame");   //switch to other window
		driver.findElement(By.linkText("org.openqa.selenium.chromium")).click();
		Thread.sleep(3000);

		// TestCase 2  : if frame name is not there then switchto  frame index 
		driver.switchTo().parentFrame();  
		driver.switchTo().frame(1);
		  driver.findElement(By.linkText("AddHasCdp")).click();  //click on it 
		Thread.sleep(3000);
		
		
		 /*
		  *  //TestCase 3 : default or parent v can use
		  
		 //driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		driver.switchTo().frame("classFrame");   //switch to other window
		driver.findElement(By.linkText("org.openqa.selenium.chromium")).click();
		Thread.sleep(3000);
		*/

	}

}
