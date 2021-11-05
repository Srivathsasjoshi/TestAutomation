package com.sgtesting.org.constructor;

class Calcs
{
	void addition(int x,int y)
	{
		int Result=(x+y);
		System.out.println("Subtraction result : "+Result);
	}
	
	void factorial(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact*=i;
		}
		System.out.println("factorial of "+num+" is "+fact);
	}
}

public class CalcDemo1 {

	public static void main(String[] args) {
			Calcs cs=new Calcs();
	}

}
