package com.qa.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap= new DesiredCapabilities(); 
		 		// we are providing 2 cappabilties to the server using object cap 
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome"); 
		 
		ChromeOptions options = new ChromeOptions(); 
		options.merge(cap);  
		String huburl=" http://192.168.1.9:4545/wd/hub"; 
		 		 
		 		//WebDriver driver= new RemoteWebDriver(new URL(huburl), options); 
		 		 
		WebDriver driver= new RemoteWebDriver(new URL(huburl), cap); 
		driver.get("https://www.amazon.com/"); 
		Thread.sleep(3000); 
		System.out.println(driver.getTitle()); 
		Thread.sleep(3000); 

		driver.quit(); 
		
				 	} 
	}


