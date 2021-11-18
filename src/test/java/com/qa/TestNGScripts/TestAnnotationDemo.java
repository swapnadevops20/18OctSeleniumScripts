

package com.qa.TestNGScripts;

import org.testng.annotations.Test;

public class TestAnnotationDemo {
// to execute  your Test Method use @Test
	
//create TC/Scenario for
//1.login
//2.create Email
//3.modify Email
//4.Delete Email
	
	
	@Test  (priority='1')
	 public void loginPageTest()
	 {
		 System.out.println("Selenium code to test login Page ");
	 }
	
	@Test  (priority='2')
	public void createEmailTest()
{
	 System.out.println("Selenium code to test createEmail Page ");
}
	@Test  (priority='3')
	public void modifyEmailTest()
{
	 System.out.println("Selenium code to test modifyEmail Page ");
}
	@Test  (priority='4')
	public void DeleteEmailTest()
{
	 System.out.println("Selenium code to test DeleteEmail Page ");
}

}
