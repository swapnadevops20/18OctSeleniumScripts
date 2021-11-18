package com.qa.TestNGParameters;


public class Demo1 {
	
	public int add(int a, int b)
	{
		
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 obj = new Demo1();
		
		System.out.println(obj.add(10, 20));
		
		System.out.println(obj.add(1000, 200));
		
		System.out.println(obj.add(-10,-20));
		
		System.out.println(obj.add(-1000,-20000));
		

	}

}

