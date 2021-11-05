package com.sgtesting.org.before_constructor;

class Mobile
{
	String BrandName;
	String ModelName;
}

class Laptop
{
	String BrandName;
	String ModelName;
}

class Desktop
{
	String BrandName;
	String ModelName;
}

public class Gadgets {

	public static void main(String[] args) {
		Mobile Apple=new Mobile();
		Apple.BrandName="Apple";
		Apple.ModelName="Iphone";
		
		Laptop Microsoft=new Laptop();
		Microsoft.BrandName="Microsoft";
		Microsoft.ModelName="Surface";
		
		Desktop HP=new Desktop();
		HP.BrandName="HP";
		HP.ModelName="Optiplex";
		
		System.out.println("Mobile details "+Apple.BrandName+" "+Apple.ModelName);
		System.out.println();
		System.out.println("Laptop details "+Microsoft.BrandName+" "+Microsoft.ModelName);
		System.out.println();
		System.out.println("Desktop details "+HP.BrandName+" "+HP.ModelName);

	}

}
