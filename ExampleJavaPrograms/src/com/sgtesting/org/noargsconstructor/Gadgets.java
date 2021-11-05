package com.sgtesting.org.noargsconstructor;

class Mobile
{
	String BrandName;
	String ModelName;
	Mobile()
	{
		BrandName="Apple";
		ModelName="iPhone";
		System.out.println("Mobile details are "+BrandName+" "+ModelName);
	}
}

class Laptop
{
	String BrandName;
	String ModelName;
	Laptop()
	{
		BrandName="Microsoft";
		ModelName="Surface";
		System.out.println("\nLaptop details are "+BrandName+" "+ModelName);
	}
}

class Desktop
{
	String BrandName;
	String ModelName;
	Desktop()
	{
		BrandName="HP";
		ModelName="Optiplex";
		System.out.println("\nDesktop details are "+BrandName+" "+ModelName);
	}
	
}

public class Gadgets {

	public static void main(String[] args) {
		
		Mobile Apple=new Mobile();
		Laptop Microsoft=new Laptop();
		Desktop HP=new Desktop();

	}

}
