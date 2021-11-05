package com.sgtesting.org.before_constructor;

class District
{
	String DistName;
	int PIN;
}

class State
{
	String StateName;
	String registration;
}

class Country
{
	String Name;
	String Region;
}

public class Places {

	public static void main(String[] args) {
		
		District Tumkur=new District();
		Tumkur.DistName="Tumkur";
		Tumkur.PIN=572;
		
		State Karnataka=new State();
		Karnataka.StateName="Karnataka";
		Karnataka.registration="KA";
		
		Country India=new Country();
		India.Name="INDIA";
		India.Region="South Asia";
		
		System.out.println("District Details "+Tumkur.DistName+" "+Tumkur.PIN+"\n");
		System.out.println("State details "+Karnataka.StateName+" "+Karnataka.registration+"\n");
		System.out.println("Country details "+India.Name+" "+India.Region);

	}

}
