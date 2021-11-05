package com.sgtesting.org.parameterizedconstructor;

class Human
{
	String firstname;
	int age;
	Human(String fn,int Age)
	{
		firstname=fn;
		age=Age;
		System.out.println("First name is "+fn);
		System.out.println("Age is "+Age);
	}
}
public class Demo {

	public static void main(String[] args) {
		Human o1=new Human("Richard",55);
		Human o2=new Human("William",47);
	}
}
