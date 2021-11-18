package com.qa.seleniumscriptsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class YahooPage2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://in.search.yahoo.com/web?fr=sfp");  //opening URL in Chrome
		driver.findElement(By.xpath("//*[@class='sbx voice-search']/descendant::input[1]")).sendKeys("Appium");
		Thread.sleep(5000);
		
		//capturing WebElement entire list of Element
		List<WebElement> list1=driver.findElements(By.xpath("//*[@role='listbox']/descendant::li"));        //   or
		System.out.println("The number of elements in the list are :" +list1.size());
		//Store it in an Object of List<WebElement>
		//start a for each loop that can scan your list of items
		for(int i=1;i<list1.size();i++)
		{
			String text1=list1.get(i).getText();
			//System.out.println(text1);       //this will prints wenever the loop continues until matching text
			// to select 1 of the text
			//give a if condition to click on ur matching text
			if(text1.contains("java"))
			{
				list1.get(i).click();
				break;           //comeout of the loop ,not to continue wen it matches
			}
		}
		 


	}

}
