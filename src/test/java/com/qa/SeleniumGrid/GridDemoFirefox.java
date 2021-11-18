package com.qa.SeleniumGrid; 
import java.net.MalformedURLException; 
import java.net.URL; 
import org.openqa.selenium.Platform; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.remote.DesiredCapabilities; 
import org.openqa.selenium.remote.RemoteWebDriver; 

 public class GridDemoFirefox { 
 
 	public static void main(String[] args) throws InterruptedException, MalformedURLException { 
 		// TODO Auto-generated method stub 
	 
 		DesiredCapabilities cap= new DesiredCapabilities().firefox(); 
		// we are providing 2 capabilties to the server using object cap 
 	 
 		cap.setBrowserName("firefox"); 
 		cap.setPlatform(Platform.WINDOWS); 
 
 		String huburl="http://192.168.1.14:4545/wd/hub"; 
 		 
 	 	WebDriver driver= new RemoteWebDriver(new URL(huburl), cap); 
 		 
 		driver.get("https://www.amazon.com/"); 
 	 
 		Thread.sleep(3000); 
 		 
 		System.out.println(driver.getTitle()); 
 		 
 		driver.quit(); 
 	} 
 

 } 
