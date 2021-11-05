package com.sgtesting.org.constructor;

class SumEv
{
	SumEv()
	{
		int a=0;
		for(int i=50;i<=100;i=i+2)
		{
			a=a+i;
		}
		System.out .println(a);
	}
}

public class DispEv 
{
	public static void main(String[] args)
	{
		SumEv a0=new SumEv();
	}
}