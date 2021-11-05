package com.sgtesting.org.constructor;

class Outer
{
	String firstname;
	Inner inner=new Inner();
	void displayAge()
	{
		inner.age=12;
		System.out.println("Age : "+inner.age);
	}
	
	class Inner
	{
		int age;
		void showFN()
		{
			firstname="Ganesh";
			System.out.println("Firstname : "+firstname);
		}
	}
}

public class Outer_Inner_class {

	public static void main(String[] args) {
		
		Outer outer=new Outer();
		outer.displayAge();
		outer.inner.showFN();

	}

}
