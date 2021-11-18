//This is Handling WebElements program

package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SMJ_HandlingWebElementObjectDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.manage().deleteAllCookies();       //delete all cookies
//opening signin microsoft browser
driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1635323472&rver=7.0.6738.0&wp=MBI_SSL&wreply=https:%2F%2Faccount.microsoft.com%2Fauth%2Fcomplete-signin%3Fru%3Dhttps%253A%252F%252Faccount.microsoft.com%252F%253Frefp%253Dsignedout-index%2526refd%253Dwww.google.com&lc=1033&id=292666&lw=1&fl=easi2");


WebElement email=driver.findElement(By.xpath("//input[@type='email']"));               //WebElement is an interface store the location of the email element
WebElement nextbtn=driver.findElement(By.xpath("//input[@type='submit']"));
boolean dis1=email.isDisplayed();
System.out.println(dis1);     // displayed the element is there or not.  > This also return true or not
boolean ena1=email.isEnabled();               //whether the element is enabled or not.   >return true or false  
System.out.println(ena1); 
email.sendKeys("selenium123");     // entering the data in the Emailbox element
Thread.sleep(3000);

nextbtn.isDisplayed();
System.out.println("Button is Enabled or not  :" +nextbtn.isEnabled());
nextbtn.click( );

	}
	

}
