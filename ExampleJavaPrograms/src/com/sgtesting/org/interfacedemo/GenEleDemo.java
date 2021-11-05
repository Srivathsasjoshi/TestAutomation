package com.sgtesting.org.interfacedemo;

class ElementsDemo
{
	public static<E> void displayElements(E[] elements)
	{
		for(E element :elements)
		{
			System.out.println(element);
		}
	}
}

public class GenEleDemo {

	public static void main(String[] args) {
		
		Integer a[]= {10,20,30,40,50};
		ElementsDemo.displayElements(a);
		
		String s[]= {"Mango","Orange","Grapes"};
		ElementsDemo.displayElements(s);
	}

}
