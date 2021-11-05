package com.sgtesting.org.constructor;

class Person
{
	String firstname;
	int age;
	
	Person()
	{
		firstname="Rahul";
		age=55;
		System.out.println("First name is "+firstname);
		System.out.println("Age is "+age+"\n");
	}
}

class Birds
{
	String feather;
	int wings;
	
	Birds()
	{
		feather="Grey";
		wings=2;
		System.out.println("Feather color is "+feather+"\nNo of wings is "+wings+"\n");
	}
}

class Pets
{
	String type;
	String breed;
	
	Pets()
	{
		type="Dogs";
		breed="Huskey";
		System.out.println("Animal is "+type+"\nBreed is "+breed+"\n");
	}
}

public class Tests {

	public static void main(String[] args) {
		
		Person Suresh=new Person();
		Birds Crow=new Birds();
		Pets Dog=new Pets();

	}

}
