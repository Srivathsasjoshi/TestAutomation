package com.sgtesting.org;

class Student
{
	Student(String firstname)
	{
		System.out.println("First name : "+firstname);
	}
	Student(int age)
	{
		System.out.println("Age : "+age);
	}
	Student(String city,int PIN)
	{
		System.out.println("City : "+city+" PIN code : "+PIN);
	}
}

public class Demosu {

	public static void main(String[] args) {
		Student s1=new Student("Ganesh");
		Student s2=new Student(11);
		Student s3=new Student("Kolar",563101);

	}

}
