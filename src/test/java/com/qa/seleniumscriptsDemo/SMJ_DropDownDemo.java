package com.qa.seleniumscriptsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SMJ_DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		
		//locate the entire select box
		//store the location in e1
		
		WebElement e1=driver.findElement(By.xpath("//select[@name='coffee']"));
				
		//Select is the class in selenium that has methods to  select itemsin the  dropdown
		Select dd=new Select(e1);   // dropdown
		
		//1st way
		dd.selectByValue("regular");
		Thread.sleep(3000);
		dd.selectByValue("crisp");
		Thread.sleep(3000);
		
		//2nd way
		//select the option by Index
		dd.selectByIndex(2);
		
		//3rd way  --- select by visibletext    > value and visible Text are different
		Thread.sleep(3000);
		dd.selectByVisibleText("With sugar");
		
		
		
		//Testcase 2 : to fetch all items from dropdown selct box
		//List : can store multiple values of any type
		//each option/value in the list will be stored at a index in a sequence(0,1,2,3,-----
		//List keeps increasing/drcreasing length dynamically
		//Array is a fixed length
		 
		//h many options/webelements ?
		
		List<WebElement> li=dd.getOptions();  //it fetch all lists of webelements in the select box
		//li = {Black,with cream,with sugar,with cream and sugar,crisp}
		System.out.println(li.size());    //size()  : number of WebElements in the select box
		
		//print all the items in the dropdown in my console
		//for each loop to repeat a task again and again
		//goto every index of the list and fetch the text and print it
		
		for(WebElement e:li)     //1.creating an object e for WebElement & points to list 2.automatically increaments by 1
		{
			System.out.println(e.getText());
		}
		
		
	}

}
