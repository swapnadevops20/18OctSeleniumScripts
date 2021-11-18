package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MJ_SetUpCheck {

  public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	  //call a Inbuilt method
	  //Objectname.methodna()
	  //if we have interface and its implementing class,h can u call method
	  //WebDriver is an interface
	  //driver is an object
	  //ChromeDriver is class in selenium
      // this is for chromedriver to open Chrome Browser
	  
	  //Location of ChromeDriver
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //opening chromebrowser
		
		// maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(2000);   // to wait for millisec ie 2 secs
		//Load URL Webpage to be opened in current window
		driver.get("https://www.wikipedia.org/");

		String currUrl1=driver.getCurrentUrl();
		System.out.println("Current Url of page1 : "+currUrl1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//navigate to the given URL
		driver.navigate().to("https://www.selenium.dev/downloads/");
		String currUrl2=driver.getCurrentUrl();
		System.out.println("Current Url of page2 : "+currUrl2);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();  //going back to the previous web page
		driver.navigate().forward();  //navigate forward
		driver.close();
		
		//close the browser
		driver.close();
	}

}
