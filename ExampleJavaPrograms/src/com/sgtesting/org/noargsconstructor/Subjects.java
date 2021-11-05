package com.sgtesting.org.noargsconstructor;

class Maths
{
	String name;
	int students;
	Maths()
	{
		name="Maths";
		students=30;
		System.out.println("Subject and students enrolled are "+name+" "+students);
	}
}

class Physics
{
	String name;
	int students;
	Physics()
	{
		name="Physics";
		students=30;
		System.out.println("\nSubject and students enrolled are "+name+" "+students);
	}
}

class Chemistry
{
	String name;
	int students;
	Chemistry()
	{
		name="Chemistry";
		students=30;
		System.out.println("\nSubject and students enrolled are "+name+" "+students);
	}
}

public class Subjects {

	public static void main(String[] args) {
		
		Maths M=new Maths();
		Physics P=new Physics();
		Chemistry C=new Chemistry();

	}

}