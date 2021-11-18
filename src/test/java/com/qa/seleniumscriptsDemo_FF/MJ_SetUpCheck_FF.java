package com.qa.seleniumscriptsDemo_FF;


public class MJ_SetUpCheck_FF extends SMJ_BaseDriver_FF{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	// System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//for geckodriver
	
  		openBrowser();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}   // to wait for millisec ie 2 secs
		//Load URL Webpage to be opened in current window
				driver.get("https://www.wikipedia.org/");

				String currUrl1=driver.getCurrentUrl();
				System.out.println("Current Url of page1 : "+currUrl1);
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		//navigate to the given URL
				driver.navigate().to("https://www.selenium.dev/downloads/");
				String currUrl2=driver.getCurrentUrl();
				System.out.println("Current Url of page2 : "+currUrl2);
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.navigate().back();  //going back to the previous web page
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.navigate().forward();  //navigate forward
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.close();
				
		
        

	}

}
