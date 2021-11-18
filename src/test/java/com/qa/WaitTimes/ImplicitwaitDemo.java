//First take POSITIVE TC : elements available and wait for 5 secs
//Second take Negative TC : link elements not available and wait for 5 secs and throws exception element not found

package com.qa.WaitTimes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitwaitDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Thread.sleep(2000); //static wait time
System.out.println("print after wait");

//Implicit wait - 5 sec

WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.ebay.com/");

//Tc-1:
//wait for 5 sec when an element is not visible. even after that it is not visible it
//throws element not found exception
    //This will execute bec element is visible
String text1=driver.findElement(By.linkText("Motors")).getText();
System.out.println(text1);

String text2=driver.findElement(By.linkText("Electronics")).getText();
System.out.println(text2);


//Tc-2
//giving exception bec Motors1234 link element is not there	
String etext1=driver.findElement(By.linkText("Motors1234")).getText();
System.out.println(etext1);

String etext2=driver.findElement(By.linkText("Electronics")).getText();
System.out.println(etext2);
	
	
	}

}
