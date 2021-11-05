package com.sgtesting.org.interfacedemo;

interface Test1
{
   void show();
   void display();
}

abstract class Demo1 implements Test1
{
   public void show()
   {
	   System.out.println("It is a show method");
   }
}

class Demo2 extends Demo1
{
   public void display(){
	   System.out.println("It is a display method");
   }
}

public class Demos {

	public static void main(String[] args) {
		Demo2 o=new Demo2();
		o.show();
		o.display();

	}

}
