package com.sgtesting.org.interfacedemo;

class Maths
{
	void addition(int x, int y)
	{
		int Res=(x+y);
		System.out.println("Addition result is "+Res);
	}
	
	void division(int x, int y)
	{
		try
		{
			int Res=(x/y);
			System.out.println("Division result is "+Res);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("this block always execute itself");
		}
	}
	
	void subtraction(int x, int y)
	{
		int Res=(x-y);
		System.out.println("subtraction result is "+Res);
	}
	
	void multiplication(int x, int y)
	{
		int Res=(x*y);
		System.out.println("multiplition result is "+Res);
	}
	
	void modulus(int x, int y)
	{
		int Res=(x%y);
		System.out.println("modulus result is "+Res);
	}
}
public class ExceptionHand {

	public static void main(String[] args) {
		Maths o=new Maths();
		o.addition(12, 13);
		o.subtraction(8, 4);
		o.multiplication(2, 30);
		o.division(12, 6);
		o.modulus(18, 9);

	}

}
