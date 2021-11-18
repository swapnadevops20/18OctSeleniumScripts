//This is XPaths Functions Selenium Program
//TC-1 : finding the elements by using XPATH functions using text(),starts-with(),contains() funciotns
//TC-2 : Filling the data into the TextBoxes
//TC-3 : Checking RadioButtons,CheckBoxes

package com.qa.seleniumscriptsDemo;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPathsFunctionsDemo {

   public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");  //opening URL in Chrome
				
	//TestCase-1 : Using starts-with function
	//Inspecting FullName TextBox
	//Filling the data by using send-keys
	
	
	// <input type="text" onblur="fieldTrack(this);" name="name65d9c26e" value="" style="width:185px;" maxlength="61">
	WebElement e=driver.findElement(By.xpath("//*[starts-with(@name,'name')]"));
	boolean disp=e.isDisplayed();
	System.out.println(disp);
	boolean ena=e.isEnabled();
	System.out.println(ena);
	e.sendKeys("MC.SAI"); //Entering Fullname with negative TestCase
	Thread.sleep(3000);
	e.sendKeys("\n");   //next line
	Thread.sleep(3000);
	//to handle Alert msgs
	Alert a = driver.switchTo().alert();
	String text=a.getText();
	System.out.println(text);
	Thread.sleep(1000);  
	a.accept();
	Thread.sleep(1000);
	e.clear();
	Thread.sleep(1000);
    e.sendKeys("M C SAI");  //Entering with positive TC

    driver.findElement(By.xpath("//*[starts-with(@name,'login')]")).sendKeys("DSREDDY"); //Choose Rediff ID
	Thread.sleep(3000);
	//Button
	driver.findElement(By.xpath("//*[starts-with(@name,'btnchkavail')]")).click(); //check availability button
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[starts-with(@id,'radio')])[1]")).click(); //click on radio button
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[starts-with(@id,'radio')])[2]")).click(); //click on radio button
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[starts-with(@id,'radio')])[3]")).click(); //click on radio button
	Thread.sleep(3000);
	/*driver.findElement(By.xpath("(//*[starts-with(@id,'radio')])[4]")).click(); //click on radio button
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[starts-with(@id,'radio')])[5]")).click(); //click on radio button
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[starts-with(@id,'radio')])[6]")).click(); //click on radio button
	Thread.sleep(3000);  */

	/*
	
	
	//Using text() function
	driver.findElement(By.xpath("//*[text()='Password']")).isDisplayed();
	driver.findElement(By.xpath("//*[contains(@name,'assw')]")).sendKeys("swa12345");  //pasword
	Thread.sleep(3000);

	driver.findElement(By.xpath("(//*[contains(@name,'assw')])[2]")).sendKeys("swa12345");  //Retype password
	Thread.sleep(3000);

	driver.findElement(By.xpath("(//*[contains(@name,'email')])[1]")).sendKeys("xxxxx@gmail.com"); //enter alt EmailId
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[starts-with(@name,'chk_alte')]")).click();
	Thread.sleep(3000);
		
	//Security Questions

	driver.findElement(By.xpath("//*[starts-with(@value ,'What is ')][1]")).click();;    
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[starts-with(@value ,'What is ')][2]")).click();;
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[starts-with(@value ,'What is ')][3]")).click();;
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[starts-with(@value ,'What is ')][4]")).click();;
	Thread.sleep(3000);
		
	//Security Answer
	driver.findElement(By.xpath("//*[starts-with(@name,'hinta')]")).sendKeys("XXXX1234");; //Enter the answer
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[starts-with(@name,'mother')]")).sendKeys("SUBBAMMA");; //mother name
	Thread.sleep(3000);
		
		//country code for mobile numer
		List<WebElement> e1= driver.findElements(By.xpath("//div[@id='country_id']/descendant::*"));
		  
		Thread.sleep(5000);
		System.out.println(e1.size());
		for(int i=0;i<e1.size();i++)
		{
			String Fromtext= e1.get(i).getText();
			System.out.println(Fromtext);
			if(Fromtext.contains("United Kingdom"))
			{
				e1.get(i).click();
				break;
			}
		}
	driver.findElement(By.xpath("(//*[starts-with(@name,'mobno')])")).sendKeys("1234567890");  //enter mobile#
	Thread.sleep(3000);
		
	WebElement day=driver.findElement(By.xpath("(//*[starts-with(@name,'DOB')])[1]"));   //Date drop down
	Select dday=new Select(day);
	dday.selectByValue("10");
		
	WebElement month=driver.findElement(By.xpath("(//*[starts-with(@name,'DOB_M')])"));  //month drop down
	Select dmonth=new Select(month);
	dmonth.selectByIndex(5);
		
	WebElement year=driver.findElement(By.xpath("(//*[starts-with(@name,'DOB')])[3]"));   //year drop down
	Select dyear=new Select(year);
	dyear.selectByValue("1982");
		
	driver.findElement(By.xpath("(//*[starts-with(@name,'gender')])[1]")).click();   //radio button for Male
	Thread.sleep(3000);

	driver.findElement(By.xpath("(//*[starts-with(@name,'gender')])[2]")).click();   //radio button Female
	Thread.sleep(3000);

	
	//locate the entire select box
	//store the location in e1
	WebElement country=driver.findElement(By.xpath("//*[starts-with(@name,'coun')]"));   //dropdown for Country
	//Select is the class in selenium that has methods to  select itemsin the  dropdown
	Select dd1=new Select(country);                 // dropdown   
	dd1.selectByValue("3");
	Thread.sleep(3000);
	dd1.selectByValue("99");
	Thread.sleep(3000);
	dd1.selectByValue("7");
	Thread.sleep(3000);
	dd1.selectByValue("48");
	Thread.sleep(3000);
	dd1.selectByValue("69");
	Thread.sleep(3000);
	dd1.selectByValue("99");
	Thread.sleep(3000);
		
	List<WebElement> li=dd1.getOptions();  //it fetch all lists of webelements in the select box
	System.out.println("Countries in the World :" +li.size());    //size()  : number of WebElements in the select box
	//print all the items in the dropdown in my console
	//for each loop to repeat a task again and again
	//goto every index of the list and fetch the text and print it
	for(WebElement e1:li)     //1.creating an object e for WebElement & points to list 2.automatically increaments by 1
	{
		System.out.println(e1.getText());
	}
									
	WebElement city=driver.findElement(By.xpath("//*[starts-with(@name,'city')]"));   //dropdown for City
	Select dd2=new Select(city);                 // dropdown   
	dd2.selectByValue("Ahmedabad");
	Thread.sleep(3000);
	dd2.selectByValue("Bangalore");
	Thread.sleep(3000);
	dd2.selectByValue("Chennai");
	Thread.sleep(3000);
	dd2.selectByValue("Hyderabad");
	Thread.sleep(3000);
	List<WebElement> li1=dd2.getOptions();  //it fetch all lists of webelements in the select box
	System.out.println("Cities in India :" +li1.size());    //size()  : number of WebElements in the select box
		
	driver.findElement(By.xpath("//*[@class='captcha']")).sendKeys("NYWA");  //Enter Captcha text shown above
	Thread.sleep(3000);

	driver.findElement(By.xpath("//*[starts-with(@name,'Register')]")).click();
		
	driver.findElement(By.xpath("//*[contains(@name,'assw')]")).sendKeys("swa12345");  //pasword
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[contains(@name,'assw')])[2]")).sendKeys("swa12345");  //Retype password
		Thread.sleep(3000);
  
        */
	//working on Home link  and navigating back to previous page
	driver.findElement(By.xpath("(//*[starts-with(@class,'f12')])[1]")).click();  //opening Home page
	Thread.sleep(1000);
	
	//Going back to webpage
	driver.navigate().back();  //going back to the previous web page
	driver.navigate().refresh();       //refreshing the driver

	//driver.navigate().back();  //going back to the previous web page

	//working on rediff.com text
	boolean rediff=driver.findElement(By.xpath("(//*[starts-with(@title,'Rediff.com')])")).isDisplayed();
	System.out.println(rediff);
					
//working with terms and conditions
      	
    driver.findElement(By.xpath("(//*[contains(@href,'terms')])")).click();		
    Set <String> windows = driver.getWindowHandles();
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
	        
	}

}
