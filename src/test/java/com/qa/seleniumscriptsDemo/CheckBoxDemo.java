package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//  <input type="checkbox" name="color" value="red">   there are so many so i will search
		//*[@value='Red']           ------ we will get only i ie unique
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		
		//finding all the elements which have name as color(or same attributes)
		//driver.findElements(By.name("color"));
		
		//by using xpath
		driver.findElements(By.xpath("//input[@type='checkbox']"))   //fetch list of elements
		.get(0)     //get the item from list ie index 0
		.click();   // click on it
		Thread.sleep(3000);
		
		//it is selected before the click
		boolean beforeclick=driver.findElements(By.xpath("//*[@type='checkbox']")).get(1).isSelected();
		System.out.println(beforeclick);
		
		driver.findElements(By.xpath("//*[@type='checkbox']")).get(1).click();   //* --- select all tags
		Thread.sleep(3000);
		driver.findElements(By.xpath("//*[@type='checkbox']")).get(4).click();
		//Thread.sleep(3000);
		
		//to check if the checkbox is selected or not v have isSelected()  method
		//it is selected after the click

		boolean afterclick=driver.findElements(By.xpath("//*[@type='checkbox']")).get(4).isSelected();
		System.out.println(afterclick);
		
	
	}

}
