package com.sgtesting.org.constructor;

class Calculation4
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
	
	void multiplication()
	{
		int a=this.addition(10, 2);
		int b=this.substraction(12, 7);
		System.out.println("Multiplication Result:"+(a*b));
	}
}

public class CalcDemo3 {

	public static void main(String[] args) {
		Calculation4 o=new Calculation4();
		o.multiplication();// TODO Auto-generated method stub

	}

}
