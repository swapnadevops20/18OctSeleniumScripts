//ExplicitWait  : time to wait and condition
//wait for 10 sec OR wait until the element is Visible
//5 sec completed
//element : checkbox is visible
//start execution of the next step
//after 10 sec completed : the element is not visible then it will throw error
//TC1  -- positive  ,TC-2 ---negative

package com.qa.WaitTimes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo {
	
	@Test
	public void waitTimeDemo() throws InterruptedException
	{
		Thread.sleep(2000);
	//static wait time
	System.out.println("print after wait");

	//Implicit wait - 5 sec

	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");

	//Tc-1:
	//wait for 5 sec when an element is not visible. even after that it is not visible it
	//throws element not found exception
	    //This will execute bec element is visible
	WebElement e1=driver.findElement(By.linkText("Motors"));
	WebDriverWait pwait=new WebDriverWait(driver,15);
	pwait.until(ExpectedConditions.visibilityOf(e1));
	
	String ptext1=e1.getText();
	System.out.println(ptext1);

	String text2=driver.findElement(By.linkText("Electronics")).getText();
	System.out.println(text2);


	/*
	//Tc-2
	//giving exception bec Motors1234 link element is not there	
	
	String etext2=driver.findElement(By.linkText("Electronics")).getText();
	System.out.println(etext2);
	
	WebElement e2=driver.findElement(By.linkText("Motors1234"));
	WebDriverWait nwait=new WebDriverWait(driver,15);
	nwait.until(ExpectedConditions.visibilityOf(e2));
	
	String ntext1=e2.getText();
	System.out.println(ntext1);
	*/

	

		
		
		}


}
