package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt1=new ChromeOptions();
		//opt1.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		//opt1.addArguments("Strat maximized");
		//opt1.setExperimentalOption("elcludeSwithches", Collections.singletonList("enable-automation"));
		//opt1.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver=new ChromeDriver(opt1);
		driver.get("https://www.google.com/");


	}

}
