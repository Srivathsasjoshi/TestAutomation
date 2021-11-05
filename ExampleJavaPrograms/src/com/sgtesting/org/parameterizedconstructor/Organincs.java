package com.sgtesting.org.parameterizedconstructor;

class Fruits
{
	String name;
	int amount;
	Fruits(String fn,int fa)
	{
		name=fn;
		amount=fa;
		System.out.println("Fruit and amount "+fn+" "+fa);
	}
}

class Vegetables
{
	String name;
	int amount;
	Vegetables(String vn,int va)
	{
		name=vn;
		amount=va;
		System.out.println("\nVegetable and amount "+vn+" "+va);
	}
}

public class Organincs {

	public static void main(String[] args) {
		Fruits o1=new Fruits("Banana",12);
		Vegetables o2=new Vegetables("Potato",10);
	}

}
