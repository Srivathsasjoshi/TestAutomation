package com.sgtesting.org.noargsconstructor;

class TwoWheelers
{
	String BrandName;
	String ModelName;
	TwoWheelers()
	{
		BrandName="Hero";
		ModelName="Splender+";
		System.out.println("TwoWheeler details are "+BrandName+" "+ModelName);
	}
}

class FourWheelers
{
		String BrandName;
		String ModelName;
		FourWheelers()
		{
			BrandName="Honda";
			ModelName="Civic";
			System.out.println("\nFourWheeler details are "+BrandName+" "+ModelName);
		}
}

public class Vehicles {

	public static void main(String[] args)
	{
		TwoWheelers Hero=new TwoWheelers();
		FourWheelers Honda=new FourWheelers();
	}

}