package com.qa.seleniumscriptsDemo;


public class SMJ_NavigationMethods_C extends SMJ_BaseDriver_C{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openBrowser();
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
	}

}
