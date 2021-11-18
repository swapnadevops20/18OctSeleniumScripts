package com.qa.seleniumscriptsDemo_FF;

import java.awt.AWTException;



//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathsFunctions_FF {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");  //opening URL in Chrome
		
		/*  driver.findElement(By.xpath("//*[starts-with(text(),'terms and')]")).click();
		 WebElement eok=driver.findElement(By.xpath("//*[starts-with(@type,'button')][1]"));
		eok.click();
		driver.switchTo().defaultContent();*/
		
		driver.findElement(By.xpath("//*[starts-with(text(),'terms and')]")).click();
		 driver.switchTo().alert();
		driver.findElement(By.xpath("(//*[starts-with(@type,'butto')])[2]")).click();


		/*
		 * Alert a = driver.switchTo().alert();
		 
		//String text=a.getText();
		//System.out.println(text);
		Thread.sleep(3000);
		a.accept();
        //a.dismiss();    //close the alert  
		*/
		/*Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_SPACE);
	    robot.keyRelease(KeyEvent.VK_SPACE);
	    Thread.sleep(2000);
	    */
    

	}

}
