package com.qa.seleniumscriptsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearchPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");  //opening URL in Chrome
		driver.findElement(By.xpath("//*[@class='nav-searchbar nav-progressive-attribute']/descendant::input[1]")).sendKeys("mobile");
		Thread.sleep(7000);    //to list all the elements please give sleep time more than 5 or 7 secs
		//capturing WebElement entire list of Element
		
		//List<WebElement> Fse1=driver.findElements(By.xpath("(//*[@class='s-suggestion-container'])[4]/child::*"));
		List<WebElement> Fse1=driver.findElements(By.xpath("(//*[@class='s-suggestion-container'])/child::*"));
		//print the size of calendar list
				System.out.println("the size of Flipkart Search list is:"+ Fse1.size());
				for(int i=0;i<Fse1.size();i++)
				{
				String Fse1text= Fse1.get(i).getText();
				if(Fse1text.contains("tripod"))
				{
				Fse1.get(i).click();
				break;
				}
				}

	}

}
