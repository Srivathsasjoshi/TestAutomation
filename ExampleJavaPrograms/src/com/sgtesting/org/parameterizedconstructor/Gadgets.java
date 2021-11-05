package com.sgtesting.org.parameterizedconstructor;

class Mobile
{
	String BrandName;
	String ModelName;
	Mobile(String brand,String model)
	{
		BrandName=brand;
		ModelName=model;
		System.out.println("Mobile details are "+brand+" "+model);
	}
}

class Laptop
{
	String BrandName;
	String ModelName;
	Laptop(String brand,String model)
	{
		BrandName=brand;
		ModelName=model;
		System.out.println("laptop details are "+brand+" "+model);
	}
}

class Desktop
{
	String BrandName;
	String ModelName;
	Desktop(String brand,String model)
	{
		BrandName=brand;
		ModelName=model;
		System.out.println("Desktop details are "+brand+" "+model);
	}
}

public class Gadgets {

	public static void main(String[] args) 
	{
		Mobile g1=new Mobile("Apple","iPhone");
		System.out.println();
		Laptop g2=new Laptop("Microsoft","Surface");
		System.out.println();
		Desktop g3=new Desktop("HP","Optiplex");
	}

}
