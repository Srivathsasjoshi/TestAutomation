package com.sgtesting.org.constructor;

class Test1
{
	static String firstname;
	static int age;
	
	static
	{
		firstname="Richard";
		showFN();
		showAge();
	}
	
	static void showFN()
	{
		System.out.println("First name is "+firstname);
	}
	
	static void showAge()
	{
		System.out.println("Age is "+age);
	}
}

public class Test {

	public static void main(String[] args) {
		
		Test1.age=33;
		System.out.println("Age in main method is "+Test1.age);

	}

}
