package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPathFunctionsAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(2000);
		boolean flag = false;

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
		
//input values in the form
		
		driver.findElement(By.xpath("//input[starts-with(@name ,'name')]")).sendKeys("Raji");
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
		
	




	}

}
