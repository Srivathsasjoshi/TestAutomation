package com.sgtesting.org.interfacedemo;

class Sample
{
	String firstname;
	int age;
	
	public Sample(String firstname, int age)
	{
		this.firstname=firstname;
		this.age=age;
	}
	public String toString()
	{
		return "Firstname is "+firstname+" and age is "+age;
	}
}

public class ExistanceStringDemo {

	public static void main(String[] args) {
		
		Sample obj=new Sample("Santosh",19);
		System.out.println(obj);

	}

}
