package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		
		//find the radio button on the page ie mozilla
		WebElement e1=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/blockquote[2]/form/input[2]"));
		WebElement e2=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/blockquote[2]/form/input[3]"));
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//creating obj for JavascriptExecutor
		//scroll and scrollIntoView
		js.executeScript("arguments[0].scrollIntoView(true)", e1,e2);
		Thread.sleep(3000);
		
		e1.click();
		
		// select selecting another radio opera
		
				//scroll and scrollIntoView
				js.executeScript("arguments[0].scrollIntoView(true)", e1,e2);
				Thread.sleep(3000);
				
				e2.click();
				
		
		/* driver.getTitle();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//creating obj for JavascriptExecutor
		js.executeScript("scroll(0,1500)");
		Thread.sleep(3000);
		js.executeScript("scroll(0,-1200)");  */
	}

}
