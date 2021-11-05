package com.sgtesting.org.noargsconstructor;

class Fruits
{
	String name;
	int amount;
	Fruits()
	{
		name="Banana";
		amount=12;
		System.out.println("Fruit and amount "+name+" "+amount);
	}
}

class Vegetables
{
	String name;
	int amount;
	Vegetables()
	{
		name="Potato";
		amount=30;
		System.out.println("\nVeggie and amount "+name+" "+amount);
	}
}

public class Organics {

	public static void main(String[] args) {
		
		Fruits Banana=new Fruits();
		Vegetables Potato=new Vegetables();
	}

}