package com.sgtesting.org;

class Human
{
	String firstname;
	int age;
	Human(String fn,int age)
	{
		firstname=fn;
		this.age=age;
		System.out.println("First name is "+fn+" age is "+age);
	}
	
	void display()
	{
		System.out.println("In a method body ...");
		System.out.println("First name is "+firstname+" age is "+age);
	}
}

public class Demos {

	public static void main(String[] args) 
	{
		Human oj=new Human("Richie",55);
		oj.display();

	}

}
