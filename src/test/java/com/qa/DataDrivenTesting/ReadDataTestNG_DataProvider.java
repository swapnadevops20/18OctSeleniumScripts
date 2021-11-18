package com.qa.DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataTestNG_DataProvider {
	
	
	WebDriver driver;
	
	@BeforeMethod   //Better give  BeforeMethod to close the session and start again the session for next values
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
	@Test(dataProvider="testdata")
	//DataProvider is to inject data into ur testmethod
	public void createaccount(String fullname,String rediffid,String password,String retype) throws InterruptedException
	{
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
		driver.close();
	}

	//fetch data from Excel with the help of apache poi
	@DataProvider(name="testdata")
	public Object[][] readdata()
	{
	Object input[][]=Xls_dataProvider.getTestData("Sheet1");   // this is another class Xls_dataProvider
		
		return input;
		/*
		//give the location of Excel Sheet
		
		FileInputStream file=null;
		try {
			file=new FileInputStream("D:\\\\ExcelSheets\\\\ReadData.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fetch the WorkBook from the location
		
		try {
			book=WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//fetch the sheet from the workbook
		Sheet sheet=book.getSheet("Sheet1");
		
		//get the row and column that has data in the sheet
		
	
		//create an array that will store cell data of each row and each column
		Object[][] inputdata=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		//start a loop to go to every row
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
		//write a loop to know number of columns : every row,get last cell number
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)

		//get the cell data and store it in array object [row][column]
			{
				inputdata[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		//return array Object
		
		return inputdata;
		*/
	}
}
