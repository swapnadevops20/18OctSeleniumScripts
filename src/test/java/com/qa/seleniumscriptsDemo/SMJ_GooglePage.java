package com.qa.seleniumscriptsDemo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class SMJ_GooglePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();      //maximize
		
		driver.manage().deleteAllCookies();       //delete all cookies
		//opening signin microsoft browser
		driver.get("https://search.yahoo.com/;_ylt=Awr9CKorUGVh1FEA409XNyoA?fr=mcafee");
		driver.findElement(By.xpath("/input[@type='text']")).sendKeys("Simplelearn");
		Thread.sleep(7000);
	/*	WebElement l1=*/
		driver.findElement(By.xpath("/ul[@role='listbox']/child::li"));
		Thread.sleep(3000);
		/*
		System.out.println("Total list of values are : "+l1.size());
		for(int i=0;i<l1.size();i++)
		{
			String text=l1.get(i).getText();
			if(text.contains("download"))
			{
				l1.get(i).click();
				break;
				
			}
			
		}
		*/
		

	}

}
