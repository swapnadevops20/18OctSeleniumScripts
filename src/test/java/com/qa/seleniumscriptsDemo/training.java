package com.qa.seleniumscriptsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class training {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		boolean flag=false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(2000);

		
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
		

	}

}
