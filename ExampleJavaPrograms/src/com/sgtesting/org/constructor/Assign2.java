package com.sgtesting.org.constructor;

class MethodEven
{
	int even(int n)
	{
		int i;
		for(i=60;i>=n;i--)
		{
			if(i%2==0)
			{
				System.out.println("Even No: "+i);
			}
		}
		return i;
}
	
	int odd(int n)
	{
		int num;
		for(num=151;num>=n;num--)
		{
			if(num%2!=0)
			{
				System.out.println("Odd No: "+num);
			}
		}
		return num;
	}
	int division(int n)
	{
		int i;
		for(i=1;i<=50;i++)
		{
			if(i%n==0)
			{
				System.out.println("Divisible by 4: "+i);
			}
		}
		return i;
	}
	
	int table(int n)
	{
		int i;
		for(i=1;i<=20;i++)
		{
			System.out.print(n*i+" ");
		}
		return n*i;
	}
}



public class Assign2 {

	public static void main(String[] args) {
		MethodEven m=new MethodEven();
		int a=m.even(40);
		int b=m.odd(131);
		int c=m.division(4);
		int d=m.table(6);
		}
}
