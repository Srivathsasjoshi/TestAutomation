package com.sgtesting.org.before_constructor;

class TwoWheelers
{
	String BrandName;
	String ModelName;
}

class FourWheelers
{
		String BrandName;
		String ModelName;
}

public class Vehicles {

	public static void main(String[] args)
	{
		TwoWheelers Hero=new TwoWheelers();
		Hero.BrandName="Hero";
		Hero.ModelName="Splender+";
		
		FourWheelers Honda=new FourWheelers();
		Honda.BrandName="Honda";
		Honda.ModelName="Civic";
		
		System.out.println("Two wheeler details "+Hero.BrandName+" "+Hero.ModelName);
		System.out.println();
		System.out.println("Four wheeler details "+Honda.BrandName+" "+Honda.ModelName);
	}

}