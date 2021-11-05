package com.sgtesting.org.interfacedemo;

public class WrapAutoBox {

	public static void main(String[] args) {
		
		autoBoxing();
		System.out.println();
		unBoxingDemo();

	}
	
	static void autoBoxing()
	{
		int a=25;
		System.out.println("int a is "+a);
		Integer b=Integer.valueOf(a);
		System.out.println("Integer b is "+b);
		Integer c=a; //autoBoxing
		System.out.println("Integer c is "+c);
		
	}
	
	static void unBoxingDemo()
	{
		Integer a=Integer.valueOf(25);
		System.out.println("Integer a is "+a);
		int b=a.intValue();
		System.out.println("int b is "+b);
		int c=a; //unBoxing
		System.out.println("int c is "+c);
	}
	

}
