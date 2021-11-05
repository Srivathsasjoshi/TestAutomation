package com.sgtesting.org;

class BasicMath
{
	BasicMath(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("fact is "+fact);
	}
	
	BasicMath()
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum+=i;
		}
		System.out.println("sum is "+sum);
	}
}
public class Subs {

	public static void main(String[] args) {
		BasicMath o1=new BasicMath();
		BasicMath o2=new BasicMath();

	}

}
