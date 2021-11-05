package com.sgtesting.org.constructor;

class Ones
{
	Ones()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}

	
public class Pyramid1s
{

	public static void main(String[] args)
	{
		
		Ones os=new Ones();
	}
}
