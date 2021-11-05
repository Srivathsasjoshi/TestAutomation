package com.sgtesting.org.constructor;

public class Human 
{
	String firstname;
	int age;
	public static void main(String args[])
	{
		Human obj1=new Human();
		obj1.firstname="Boss";
		obj1.age=21;
		System.out.println("First name is "+obj1.firstname);
		System.out.println("Age is "+obj1.age);
		System.out.println();
		
		Human obj2=new Human();
		obj2.firstname="Oren";
		obj2.age=22;
		System.out.println("First name is "+obj2.firstname);
		System.out.println("Age is "+obj2.age);
		System.out.println();// TODO Auto-generated method stub

	}

}
