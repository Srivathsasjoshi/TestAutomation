package com.sgtesting.org.noargsconstructor;

class Branch
{
	String Branch;
	Branch()
	{
		Branch="Basaveshwaranagar";
		System.out.println("Branch is "+Branch);
	}
}

class Employ
{
	String name;
	Employ()
	{
		name="Raju";
		System.out.println("\nEmploy name is "+name);
	}
}

class Bonus
{
	int bonus;
	Bonus()
	{
		bonus=2500;
		System.out.println("\nBonus given is "+bonus);
	}
}

class Insurance
{
	int insurance;
	Insurance()
	{
		insurance=1000;
		System.out.println("\nInsurance provided is "+insurance);
	}
}

public class Company {

	public static void main(String[] args) {
		
		Branch Basaveshwaranagar=new Branch();
		Employ Raju=new Employ();
		Bonus amount=new Bonus();
		Insurance savings=new Insurance();

	}

}
