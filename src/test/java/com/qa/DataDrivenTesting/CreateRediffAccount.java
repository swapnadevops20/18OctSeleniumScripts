//The Excel Sheet location is given in utility file
//Utility File : Xls_dataProvider1.java
//Creating Account in RediffPage

package com.qa.DataDrivenTesting;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateRediffAccount {
	
	WebDriver driver;
	//This obj fetch the data from utility file
		Xls_Reader reader=new Xls_Reader("D:\\ExcelSheets\\SimpleTestData1.xlsx");
		boolean flag = false;

	@BeforeMethod
	public void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
@Test(dataProvider="testdata")
	public void RediffPageInput(String wrongname,String fullname,String rediffid,String password,String retype,String altemail,String mobno,String textshown,String enterans,String mothersname) throws InterruptedException
	{
		    // to add the column in excel sheet
     		//reader.addColumn("Sheet1","Status");
     		int rowcount=reader.getRowCount("Sheet1");
     		//number of row counts in Excel Sheet
     		System.out.println("Print number of rows in a sheet :" +rowcount);  
     		     		
//TC-1 : Negative TC'S
     		
     		WebElement name=driver.findElement(By.xpath("//input[starts-with(@name ,'name')]"));
     		name.sendKeys(wrongname);
     		Thread.sleep(1000);
     		name.sendKeys("\n");
     		Thread.sleep(1000);
     		//to handle Alert msgs
     		Alert a = driver.switchTo().alert();
     		String alerttext=a.getText();
     		System.out.println(alerttext);
     		Thread.sleep(1000);  
     		a.accept();
     		Thread.sleep(1000);
     		name.clear();
     		Thread.sleep(1000);
     	     		
//TC-2 : POSITIVE TC
     		driver.findElement(By.xpath("//input[starts-with(@name ,'name')]")).sendKeys(fullname);
     		Thread.sleep(1000);
     		
     		//Rediff id
     		driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).clear();
     		driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).sendKeys(rediffid);
     		
     		 //TC-2 : Entering Check availability Button and Testing on Radio buttons WebElement
			driver.findElement(By.xpath("//*[starts-with(@name,'btnchkavail')]")).click(); //check availability button
			Thread.sleep(1000);
			//Selecting radio list for check availability btn
			driver.findElement(By.xpath("(//*[starts-with(@id,'radio')])[1]")).click(); //click on radio button
			Thread.sleep(1000);
			//entering pwd
     		driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).clear();
     		driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).sendKeys(password);
     		Thread.sleep(1000);
     		driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).clear();
     		driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).sendKeys(retype);
     		Thread.sleep(1000);
     		driver.findElement(By.xpath("//input[starts-with(@name ,'altemail')]")).clear();
     		driver.findElement(By.xpath("//input[starts-with(@name ,'altemail')]")).sendKeys(altemail);
     		Thread.sleep(1000);
     		
//TC-4 : Testing Click if you don't have an alternate ID
     		driver.findElement(By.xpath("//*[starts-with(@name,'chk_alte')]")).click();
     		Thread.sleep(1000);
     			
     		//Security Questions
     		driver.findElement(By.xpath("//*[starts-with(@value ,'What is ')][1]")).click();
     		Thread.sleep(1000);
     		driver.findElement(By.xpath("//*[starts-with(@value ,'What is ')][4]")).click();
     		Thread.sleep(1000);
     			
     		//Security Answer
     		driver.findElement(By.xpath("//*[starts-with(@name,'hinta')]")).sendKeys(enterans); //Enter the answer
     		Thread.sleep(1000);
     		driver.findElement(By.xpath("//*[starts-with(@name,'mother')]")).sendKeys(mothersname); //mother name
     		Thread.sleep(1000);

     		//entering mobile number
     		driver.findElement(By.xpath("//input[starts-with(@name ,'mobno')]")).clear();
     		driver.findElement(By.xpath("//input[starts-with(@name ,'mobno')]")).sendKeys(mobno);
     		Thread.sleep(1000);
     		
//TC-5 :Verifying default value in DOB

        	 //Verifying radio buttons
        	WebElement day = driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Day')]"));
      		Select sel1 = new Select(day);
      		WebElement month = driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Month')]"));
      		Select sel2 = new Select(month);
      		sel1.selectByValue("01");
      		Thread.sleep(1000);
      		sel2.selectByValue("03");
      		Thread.sleep(1000);
      		WebElement year = driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Year')]"));
      		Select sel3 = new Select(year);
      		sel3.selectByValue("2000");
      		Thread.sleep(1000);
      		
      		//	selecting gender    radio button
      		String male = driver.findElement(By.xpath("(//*[starts-with(@name,'gender')])[1]")).getAttribute("value");
      		System.out.println(male);
      		driver.findElement(By.xpath("(//*[starts-with(@name,'gender')])[2]")).click();
      		Thread.sleep(1000);

      		//	selecting country dropdown
      		WebElement country = driver.findElement(By.xpath("//*[starts-with(@name,'country')]"));
      		Select sel4 = new Select(country);
      		sel4.selectByValue("12");
      		Thread.sleep(1000);
        	
      		//entering captcha    		
     		driver.findElement(By.xpath("//input[starts-with(@class,'captcha')]")).clear();
     		driver.findElement(By.xpath("//input[starts-with(@class,'captcha')]")).sendKeys(textshown);
     		Thread.sleep(1000);
     		//reader.setCellData("Sheet1", "Status", i, "executed");
    	        		
//TC-6 : Create My Account
     		driver.findElement(By.xpath("//input[starts-with(@name ,'Register')]")).click();
    		Thread.sleep(1000);
    		/*
    		Alert alertcreate = driver.switchTo().alert();
    		String text = alertcreate.getText();
    		System.out.println (text);
    		a.accept();  */
    		Thread.sleep(1000);
     	   driver.close();

     // to add the column in excel sheet
     		//reader.addColumn("Sheet1","Status");
    	//	reader.setCellData("Sheet1", "Status", 0, "executed");

     		//int rowcount=reader.getRowCount("Sheet1");
     		//number of row counts in Excel Sheet
     		//System.out.println("Print number of rows in a sheet :" +rowcount);
     		
    		//*[@id="tblcrtac"]/tbody/tr[2]/td/font/b

     		
     	}
@DataProvider(name="testdata")

public Object[][] CreateAccountdata()
	{
	Object input[][]=Xls_dataProvider1.getTestData("Sheet1");
	return input;
	}
	
}





