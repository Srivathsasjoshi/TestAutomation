package com.sgtesting.org;

class Employee
{
	Employee(String name)
	{
		System.out.println("Employee name is "+name);
	}
	Employee(int empid)
	{
		this("Ganesh");
		System.out.println("Employee ID : "+empid);
	}
}

public class Employs {

	public static void main(String[] args) 
	{
			Employee o=new Employee(11);
	}

}
