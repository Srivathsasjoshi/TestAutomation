package com.sgtesting.org;

public class ArrayPrime {

	public static void main(String[] args) 
	{
		int a=0;
		int count=0;
		for(int n=2;n<=50;n++)
		{
			for(int i=2;i<n;i++)
			{
				if(n==0)
				{
					a++;
					break;
				}
			}
			if(a==0)
			{
				count=count+1;
			}
				System.out.println(count+" is the no of prime nos between 1 to 50");
		}

		// TODO Auto-generated method stub

	}

}
