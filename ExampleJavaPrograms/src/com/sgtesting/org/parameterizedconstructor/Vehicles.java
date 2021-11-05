package com.sgtesting.org.parameterizedconstructor;

class TwoWheelers
{
	String BrandName;
	String ModelName;
	
	TwoWheelers(String brand,String model)
	{
		BrandName=brand;
		ModelName=model;
		System.out.println("Two wheeler details are "+brand+" "+model);
	}
}

class FourWheelers
{
		String BrandName;
		String ModelName;
		
		FourWheelers(String brand,String model)
		{
			BrandName=brand;
			ModelName=model;
			System.out.println("Four wheeler details are "+brand+" "+model);
		}
}

public class Vehicles {

	public static void main(String[] args)
	{
		TwoWheelers w1=new TwoWheelers("Hero","Splender+");
		System.out.println();
		FourWheelers w2=new FourWheelers("Honda","Civic");
	}

}