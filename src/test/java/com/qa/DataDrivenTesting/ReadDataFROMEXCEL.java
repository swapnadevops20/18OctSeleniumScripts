package com.qa.DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadDataFROMEXCEL {
	
	WebDriver driver;
	//This obj fetch the data from utility file
	Xls_Reader reader=new Xls_Reader("D:\\ExcelSheets\\ReadData.xlsx");
	
	@BeforeMethod   //Better give  BeforeMethod to close the session and start again the session for next values
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void createaccount() throws InterruptedException {
		// to add the column in excel sheet
		//reader.addColumn("Sheet1","Status");
		int rowcount=reader.getRowCount("Sheet1");
		//number of row counts in Excel Sheet
		System.out.println("Print number of rows in a sheet :" +rowcount);
				
		//goto every row ,every column in the sheet and fetch the data from the sheet
		for(int i=2;i<rowcount;i++)
		{
		String fullname=reader.getCellData("Sheet1","fullname", i);
		String rediffid=reader.getCellData("Sheet1","rediffid", i);
		String password=reader.getCellData("Sheet1","password", i);
		String retype=reader.getCellData("Sheet1","retype", i);
		String altemail=reader.getCellData("Sheet1","altemail", i);
		String mobno=reader.getCellData("Sheet1","mobno", i);
		String textshown=reader.getCellData("Sheet1","textshown", i);

		
		driver.findElement(By.xpath("//input[starts-with(@name ,'name')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'name')]")).sendKeys(fullname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).sendKeys(rediffid);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).sendKeys(retype);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name ,'altemail')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'altemail')]")).sendKeys(altemail);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name ,'mobno')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'mobno')]")).sendKeys(mobno);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@class,'captcha')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@class,'captcha')]")).sendKeys(textshown);
		//Thread.sleep(1000);
		//driver.close();

		//reader.setCellData("Sheet1", "Status", i, "executed");

		}
		
	}
	
	@AfterMethod
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		//driver.close();
		System.out.println("After Method is executed");
	}
	

}
