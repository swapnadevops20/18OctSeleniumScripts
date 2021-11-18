package com.qa.TestNGScripts;

import org.testng.annotations.Test;

public class GroupsDemo2 {

	@Test(groups= {"jmeter"})
	public void method1()
	{
		System.out.println("method for jmeter 1");
	}
	@Test(groups= {"jmeter"})
	public void method2()
	{
		System.out.println("method for jmeter 2");
	}
	
	@Test(groups = {"selenium"})
	public void method3()
	{
		System.out.println("method for selenium 1");
	}
	@Test(groups = {"selenium"})
	public void method4()
	{
		System.out.println("method for selenium 2");
	}
}
