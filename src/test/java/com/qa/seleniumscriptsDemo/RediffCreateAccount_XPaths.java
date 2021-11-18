package com.qa.seleniumscriptsDemo;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffCreateAccount_XPaths {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");  //opening URL in Chrome
					
		//TestCase-1 : Using starts-with function
		//Inspecting FullName TextBox
		//Filling the data by using send-keys
		
		boolean flag = false;
		
//TC-1 : Verifying all the Elements are displayed,Enabled
		
		//Verifying Create rediffmail account text
				
				if (driver.findElement(By.xpath("//*[contains(text(),'Create')]")).isDisplayed())
				{
					flag = true;
					System.out.println("Create a Rediffmail Account text is  present");
				}
				else
				{
					System.out.println("Create a Rediffmail Account text is not present");
				}
		//Verifying Full name is enabled
				if(driver.findElement(By.xpath("//input[starts-with(@name ,'name')]")).isEnabled())
				{
					flag = true;
					System.out.println("Full Name is  enabled");
				}
				else
				{
					System.out.println("Full Name is not enabled");
				}

		//Verifying Rediffmail id is enabled
				if(driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).isEnabled())
				{
					flag = true;
					System.out.println("Rediffmail id is enabled");
				}
				else
				{
					System.out.println("Rediffmail id is not enabled");
				}
				
		//Verifying Check Availability is enabled
				if(driver.findElement(By.xpath("//input[starts-with(@name ,'btnchkavail')]")).isEnabled())
				{
					flag = true;
					System.out.println("Check Availability button is enabled");
				}
				else
				{
					System.out.println("Check Availability button is not enabled");
				}
						
		//Verifying password is enabled
				if(driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).isEnabled())
				{
					flag = true;
					System.out.println("Password is enabled");
				}
				else
				{
					System.out.println("Password is not enabled");
				}		

		//Verifying confirm password is enabled
				if(driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).isEnabled())
				{
					flag = true;
					System.out.println("Confirm Password is enabled");
				}
				else
				{
					System.out.println("Confirm Password is not enabled");
				}			
				
		//Verifying Alternate email text is enabled
				if(driver.findElement(By.xpath("//input[starts-with(@name ,'altemail')]")).isEnabled())
				{
					flag = true;
					System.out.println("Alternate email is enabled");
				}
				else
				{
					System.out.println("Alternate email is not enabled");
				}					
						
		//Verifying default value in DOB

				WebElement d = driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Day')]"));
				Select sel1 = new Select(d);
				String Day = sel1.getOptions().get(0).getText();
				if (Day.equalsIgnoreCase("Day"))
				{
					flag = true;
					System.out.println("Default text is Day");
				}
				else
				{
					System.out.println("Default text is not Day");
				}

				WebElement m = driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Month')]"));
				Select sel2 = new Select(m);
				String Month = sel2.getOptions().get(0).getText();
				if (Month.equalsIgnoreCase("Month"))
				{
					flag = true;
					System.out.println("Default text is Month");
				}
				else
				{
					System.out.println("Default text is not Month");
				}

				//Verifying radio buttons
				String male = driver.findElement(By.xpath("(//*[starts-with(@name,'gender')])[1]")).getAttribute("value");
				System.out.println(male);
				
//TC-2 : input values in the form
				
				//Entering the Full Name data into the Element
								WebElement fname=driver.findElement(By.xpath("//*[starts-with(@name,'name')]"));
				fname.sendKeys("M.C.Sai" + "\n");     //Entering negative TC
				Thread.sleep(3000);
				//to handle Alert msgs
				Alert a = driver.switchTo().alert();
				String text=a.getText();
				System.out.println(text);
				Thread.sleep(1000);  
				a.accept();
				Thread.sleep(1000);
				fname.clear();
				Thread.sleep(1000);
			    fname.sendKeys("M C SAI");  //Entering with positive TC
			    
				//Entering the Rediffmail ID data into the Element
				//driver.findElement(By.xpath("//*[starts-with(@name,'login')]")).sendKeys("Sai21.2010"); //Choose Rediff ID
				driver.findElement(By.xpath("//*[starts-with(@name,'login')]")).sendKeys("Sai21"); //Choose Rediff ID

			    Thread.sleep(3000);
				
				//Entering Check availability Button
				driver.findElement(By.xpath("//*[starts-with(@name,'btnchkavail')]")).click(); //check availability button
				Thread.sleep(3000);
				
				             //-----------------Error
				//Displaying list of radio button 
				/*
				Select rdropDown = new Select(driver.findElement(By.xpath("(//*[starts-with(@id,'radio')])")));
                Thread.sleep(5000);

		        List <WebElement> rCount = rdropDown.getOptions();
		        int itemSize = rCount.size();
		        for(int i = 0; i < itemSize ; i++){
		            String optionsValue = rCount.get(i).getText();
		            System.out.println(optionsValue);
		        }
				       */  //-----------------Error
				//Selecting radio list for check availability btn
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

				//WebElement rbtn=driver.findElement(By.xpath("(//*[starts-with(@id,'radio')])"));
				//System.out.println("the size of radiob btn list is:"+ rbtn.getSize());
/*
				for(int i=0;i<rbtn.size();i++)
				{
				String rbtntext= rbtn.get(i).getText();
				if(rbtntext.contains("Vashi"))
				{
					rbtn.get(i).click();
				break;
				}
				}
				*/
/*
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
				driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).sendKeys("Raji11.304");
				driver.findElement(By.xpath("//input[starts-with(@name ,'btnchkavail')]")).click();
				driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).sendKeys("user11");
				driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).sendKeys("user11");
				driver.findElement(By.xpath("//input[starts-with(@name ,'altemail')]")).sendKeys("user12@gmail.com");
				driver.findElement(By.xpath("//input[starts-with(@name ,'mobno')]")).sendKeys("7543789012");
				sel1.selectByValue("01");
				Thread.sleep(2000);
				sel2.selectByValue("03");
				Thread.sleep(2000);
				WebElement y = driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Year')]"));
				Select sel3 = new Select(y);
				sel3.selectByValue("2000");
				driver.findElement(By.xpath("(//*[starts-with(@name,'gender')])[2]")).click();
				WebElement country = driver.findElement(By.xpath("//*[starts-with(@name,'country')]"));
				Select sel4 = new Select(country);
				sel4.selectByValue("12");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[starts-with(@name ,'Register')]")).click();
				Thread.sleep(2000);
				Alert a = driver.switchTo().alert();
				String text = a.getText();
				System.out.println (text);
				a.accept();
				driver.close();
				*/

	}

}
