package com.sgtesting.org.parameterizedconstructor;

class Maths
{
	String name;
	int students;
	Maths(String mn,int ms)
	{
		name=mn;
		students=ms;
		System.out.println("Subject is "+mn+"\nStudents enrolled "+ms);
	}
}

class Physics
{
	String name;
	int students;
	Physics(String pn,int ps)
	{
		name=pn;
		students=ps;
		System.out.println("\nSubject is "+pn+"\nStudents enrolled "+ps);
	}
}

class Chemistry
{
	String name;
	int students;
	Chemistry(String cn,int cs)
	{
		name=cn;
		students=cs;
		System.out.println("\nSubject is "+cn+"\nStudents enrolled "+cs);
	}
}

public class Subjects {

	public static void main(String[] args) {
		
		Maths M=new Maths("Maths",30);
		Physics P=new Physics("Physics",30);
		Chemistry C=new Chemistry("Chemistry",30);
		
	}

}