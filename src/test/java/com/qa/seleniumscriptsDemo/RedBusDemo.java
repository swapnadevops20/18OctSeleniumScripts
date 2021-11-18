package com.qa.seleniumscriptsDemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/bus-tickets");  //opening URL in Chrome
		driver.findElement(By.xpath("(//*[@class='D120_search_widget']/descendant::input[1])")).sendKeys("Mumbai");
		Thread.sleep(7000);
		
		//capturingaWebElemententire list of Element
		List<WebElement> From=driver.findElements(By.xpath("(//*[@id='C120_suggestion-wrap'])[1]/child::*"));

		System.out.println("The number of elements in the list are :" +From.size());
		//Store it in an Object of List<WebElement>
		//start a for each loop that can scan your list of items
		for(int i=1;i<From.size();i++)
		{
			String Fromtext=From.get(i).getText();
			System.out.println(Fromtext);
			if(Fromtext.contains("Vashi"))
			{
				From.get(i).click();
				break;
				
			}
		}
		
		driver.findElement(By.xpath("//*[@class='D120_search_widget']/descendant::input[3]")).sendKeys("Pune");
		Thread.sleep(7000);

        List<WebElement> To=driver.findElements(By.xpath("//*[@id='C120_suggestion-wrap']/child::*"));
		System.out.println("the size of To list is:"+ To.size());
		for(int i=0;i<To.size();i++)
		{
		String Totext= To.get(i).getText();
		if(Totext.contains("Shivaji"))
		{
		To.get(i).click();
		break;
		}
		}
		
		//displaying calendar of nov 5th
		 //finding the webelement locator
		
		driver.findElement(By.xpath("//*[@class='D120_search_widget']/descendant::input[5]")).click();
		Thread.sleep(7000);
		//select all the childrens
		List<WebElement> cal=driver.findElements(By.xpath("(//*[@class='rb-calendar-days'])[2]/child::*"));
		//print the size of calendar list
		System.out.println("the size of To list is:"+ cal.size());
		for(int i=0;i<cal.size();i++)
		{
		String caltext= cal.get(i).getText();
		if(caltext.contains("5"))
		{
		cal.get(i).click();
		break;
		}
		}

	}

}
