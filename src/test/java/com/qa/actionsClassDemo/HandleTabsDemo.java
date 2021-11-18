package com.qa.actionsClassDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTabsDemo {
	 public static void main(String[] args) throws AWTException, InterruptedException {
		  // TODO Auto-generated method stub
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.wikipedia.org/");
		 
		  Robot r = new Robot();
		  
		 
		  r.keyPress(KeyEvent.VK_CONTROL);      //Virtual Key - VK
		  r.keyPress(KeyEvent.VK_T);
		  Thread.sleep(2000);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.keyRelease(KeyEvent.VK_T);
		  
		  
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_T);
		  Thread.sleep(2000);  
		  
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.keyRelease(KeyEvent.VK_T);
		  
		  //window handle  --  gets all the windows opened
		  
		  ArrayList<String> tabs=new ArrayList<String> (driver.getWindowHandles());
		  
		  //String tabs=driver.getWindowHandle();
		  
		  System.out.println(tabs);
		  
		  driver.switchTo().window(tabs.get(1));
		  
		  driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		  Thread.sleep(3000);
		  driver.switchTo().window(tabs.get(0));
		  driver.get("https://www.amazon.com/");
		 // driver.quit();
		  
		  
	 }
}
