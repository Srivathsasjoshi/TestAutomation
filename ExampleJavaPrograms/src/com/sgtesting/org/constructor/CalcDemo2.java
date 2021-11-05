package com.sgtesting.org.constructor;

class Calculations
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

public class CalcDemo2 {

	public static void main(String[] args) {
		Calculations o =new Calculations();
		o.multiplication(o.addition(10, 5),o.substraction(5, 2));
		// TODO Auto-generated method stub

	}

}
