package com.sgtesting.org.constructor;

class Student
{
	String Name;
	int Age;
}

class Library
{
	int Books;
	int students;
}

class Sports
{
	String Games;
	int studentsEnrolled;
}

public class MainDemo3 {

	public static void main(String[] args) {
		
		Student Shiva=new Student();
		Shiva.Name="Shiva";
		Shiva.Age=18;
	
		Library l=new Library();
		l.Books=10580;
		l.students=300;
		
		Sports Football=new Sports();
		Football.Games="Football";
		Football.studentsEnrolled=50;
		
		System.out.println("Student name and age is "+Shiva.Name+" "+Shiva.Age+"\n\nNo of books in library is "+l.Books+" Students enrolled are "+l.students+"\n\nSports name is "+Football.Games+" Students enrolled "+Football.studentsEnrolled);

	}

}
