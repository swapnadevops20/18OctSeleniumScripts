package com.qa.TestNGScripts;

import org.testng.annotations.Test;

public class GroupsDemo {
	@Test(groups= {"Regression"}, priority='1')
	public void testcase1()
	{
		System.out.println("its regression testcase1");
	}
	@Test (groups= {"Regression"}, priority='2')
	public void testcase2()
	{
		System.out.println("its regression testcase2");
	}
	
	@Test(groups= {"Regression"}, priority='3')
	public void testcase3()
	{
		System.out.println("its regression testcase3");
	}
	@Test(groups= {"FunctionalTesting"})
	public void testcase4()
	{
		System.out.println("its Functional testcase");
	}
	@Test(groups= {"FunctionalTesting"})
	public void testcase5()
	{
		
		System.out.println("its Functional testcase");
	}

	@Test(groups= {"Load Testing"})
	public void testcase6()
	{
		
		System.out.println("its Load testcase 1");
	}
	@Test(groups= {"Load Testing"})
	public void testcase7()
	{
		
		System.out.println("its Load testcase 2");
	}
	@Test(groups= {"Load Testing"})
	public void testcase8()
	{
		
		System.out.println("its Load testcase 3");
	}
}
