package com.sgtesting.org.noargsconstructor;

class District
{
	String DistName;
	int PIN;
	District()
	{
		DistName="Kolar";
		PIN=563101;
		System.out.println("District name and PIN "+DistName+" "+PIN);
	}
}

class State
{
	String StateName;
	String registration;
	State()
	{
		StateName="Karnataka";
		registration="KA";
		System.out.println("\nState name and registration "+StateName+" "+registration);
	}
}

class Country
{
	String Name;
	String Region;
	Country()
	{
		Name="India";
		Region="South asia";
		System.out.println("\nName of the country and its region is "+Name+" "+Region);
	}
}

public class Places {

	public static void main(String[] args) {
		
		District Kolar=new District();
		State Karnataka=new State();
		Country India=new Country();

	}

}

