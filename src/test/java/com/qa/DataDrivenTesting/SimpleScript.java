package com.qa.DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleScript {
	WebDriver driver;
	Xls_Reader reader=new Xls_Reader("D:\\ExcelSheets\\ReadData1.xlsx");

	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
	}
@Test(dataProvider="testdata")
	public void wikiPageInput(String searchdata) throws InterruptedException
	{
		driver.findElement(By.id("searchInput")).clear();
		driver.findElement(By.id("searchInput")).sendKeys(searchdata);
        Thread.sleep(2000);
        driver.close();
     // to add the column in excel sheet
     		reader.addColumn("Sheet1","Status");
    		reader.setCellData("Sheet1", "Status", 0, "executed");

     		//int rowcount=reader.getRowCount("Sheet1");
     		//number of row counts in Excel Sheet
     		//System.out.println("Print number of rows in a sheet :" +rowcount);
     		
		
	}

@DataProvider(name="testdata")

public Object[][] Simpledata()
{
	Object input[][]=Xls_dataProvider.getTestData("Sheet1");
	return input;
}
	
}
