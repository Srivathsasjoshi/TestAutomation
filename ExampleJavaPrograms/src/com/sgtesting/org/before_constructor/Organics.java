package com.sgtesting.org.before_constructor;

class Fruits
{
	String name;
	int amount;
}

class Vegetables
{
	String name;
	int amount;
}

public class Organics {

	public static void main(String[] args) {
		
		Fruits Banana=new Fruits();
		Banana.name="Banana";
		Banana.amount=12;
		
		Vegetables Potato=new Vegetables();
		Potato.name="Potato";
		Potato.amount=12;
		
		System.out.println("Fruit details "+Banana.name+" "+Banana.amount+"\n");
		System.out.println("Vegetable details "+Potato.name+" "+Potato.amount);

	}

}
