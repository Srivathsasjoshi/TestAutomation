package com.sgtesting.org.constructor;

class Calculation3
{
	int addition(int x,int y)
	{
		return (x+y);
	}
	
	int substraction(int a,int b)
	{
		int Res=(a-b);
		return Res;
	}
	
	void multiplication(int x,int y)
	{
		int Res=(x*y);
		System.out.println("Multiplication Result :"+Res);
	}

}

public class CalcDemo {

	public static void main(String[] args) {
		Calculation3 o =new Calculation3();
		int a=o.addition(20, 10);
		int b=o.substraction(25, 15);
		o.multiplication(a, b);
		

	}

}
