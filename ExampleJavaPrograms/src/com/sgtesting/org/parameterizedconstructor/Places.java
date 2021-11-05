package com.sgtesting.org.parameterizedconstructor;

class District
{
	String DistName;
	long PIN;
	District(String dis,long pn)
	{
		DistName=dis;
		PIN=pn;
		System.out.println("District name and PIN code are "+dis+" "+pn);
	}
}

class State
{
	String StateName;
	String registration;
	State(String name,String reg)
	{
		StateName=name;
		registration=reg;
		System.out.println("State name and registration are "+name+" "+reg);
	}
}

class Country
{
	String Name;
	String Region;
	Country(String nam,String reg)
	{
		Name=nam;
		Region=reg;
		System.out.println("Country details are"+nam+" "+reg);
	}
}

public class Places {

	public static void main(String[] args) {
		
		District Tumkur=new District("Kolar",563101);
		System.out.println();
		State Karnataka=new State("Karnataka","KA");
		System.out.println();
		Country India=new Country("India","South Asia");
	}

}