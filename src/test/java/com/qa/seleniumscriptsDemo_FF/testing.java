package com.qa.seleniumscriptsDemo_FF;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testing {
	
	public void clearExistingText(String newText){
		textBox.clear();
		textBox.sendKeys(newText);
		}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");  //opening URL in Chrome
		WebElement e3=driver.findElement(By.xpath("//*[starts-with(@name,'name')]"));
		boolean disp=e3.isDisplayed();
		System.out.println(disp);
		boolean ena=e3.isEnabled();
		System.out.println(ena);
		
		e3.sendKeys("MC.SAI"); //Entering Fullname with negative TestCase
		Thread.sleep(3000);

		e3.sendKeys("\n");
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		Thread.sleep(1000);  
		a.accept();
		Thread.sleep(1000);
		e3.clear();
		Thread.sleep(1000);
        e3.sendKeys("M C SAI");
        driver.findElement(By.xpath("//*[starts-with(@name,'login')]")).sendKeys("MSREDDY"); //Choose Rediff ID
      	Thread.sleep(3000);
      	/*	
      //working with terms and conditions
      	
      	driver.findElement(By.xpath("(//*[contains(@href,'terms')])")).click();		
      	Set <String> windows = driver.getWindowHandles();
       // String mainwindow = driver.getWindowHandle();
        
        
       for (String handle: windows)
      {
        driver.switchTo().window(handle);
      System.out.println("switched to "+driver.getTitle()+"  Window");
     String pagetitle = driver.getTitle(); 
     System.out.println(pagetitle);
       }  
        driver.findElement(By.xpath("(//*[starts-with(@type,'butto')])[1]")).click();  //1st way to close
       // driver.findElement(By.xpath("(//*[starts-with(@type,'butto')])[1]")).click();  //2nd way  to close
      // driver.close();  // 3rd way to close
       * 
       */
        
        //TC-2 fetching all the values from the dropdown list
        //Button
    	driver.findElement(By.xpath("//*[starts-with(@name,'btnchkavail')]")).click(); //check availability button
    	Thread.sleep(3000);
    	
        //WebElement e1=driver.findElement(By.xpath("(//*[starts-with(@id,'radio_login')])"));
		
        WebElement e1=driver.findElement(By.xpath("(//*[starts-with(@id,'radio_login')])[2]"));
        e1.click();
        
      // boolean esel= e1.isSelected();
		System.out.println(e1.isSelected());
		System.out.println(e1.isDisplayed());

       
       //Select is the class in selenium that has methods to  select itemsin the  dropdown
       //e1.click();
       
       
       //System.out.println("e1.getText()" +e1.getText(e1.click()));
        
		/*Select dd=new Select(e1);   // dropdown
		
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
		
		*/
   
		/*
//element for +91 or code in mobile  don't use select for this ,use list
		   List<WebElement> mcode=driver.findElement(By.xpath("//div[@id='country_id']/descendant::*"));
		//print the size of calendar list
				System.out.println("the size of Flipkart Search list is:"+ mcode.size());
				for(int i=0;i<mcode.size();i++)
				{
				String mcodetext= mcode.get(i).getText();
				System.out.println(mcodetext);
				if(mcodetext.contains("United Kingdom"))
				{
				mcode.get(i).click();
				break;
				}
				}

		
       */
	}

}
