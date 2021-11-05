package com.sgtesting.org.parameterizedconstructor;

class Branch
{
	String Branch;
	Branch(String bn)
	{
		Branch=bn;
		System.out.println("Branch is "+bn);
	}
}

class Employ
{
	String name;
	Employ(String en)
	{
		name=en;
		System.out.println("\nEmploy is "+en);
	}
}

class Bonus
{
	int bonus;
	Bonus(int ba)
	{
		bonus=ba;
		System.out.println("\nBonus given is "+ba);
	}
}

class Insurance
{
	int insurance;
	Insurance(int ia)
	{
		insurance=ia;
		System.out.println("\nInsurance is "+ia);
	}
}

public class Company {

	public static void main(String[] args) {
		
		Branch Basaveshwaranagar=new Branch("Basaveshwaranagar");	
		Employ Raju=new Employ("Raju");
		Bonus amount=new Bonus(2500);
		Insurance savings=new Insurance(1000);

	}

}

