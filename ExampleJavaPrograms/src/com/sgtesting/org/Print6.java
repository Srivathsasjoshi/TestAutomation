package com.sgtesting.org;

public class Print6 {

	public static void main(String[] args)
	{
		int j=0;
		for(int i=1;i<=100;i++)
		{
			if(i%6==0)
			{
				j=j+1;
			}
		}
		System.out.println(j+" is the no of odd nos in between 1 & 100");
		
		int a[]=new int[j];
		int k=0;
		for(int l=1;l<=100;l++)
		{
			if(l%6==0)
			{
				a[k]=l;
				k++;
			}
		}
		
		for(int m=a.length-1;m>=0;m--)
		{
			System.out.println(a[m]);
		}
		
		// TODO Auto-generated method stub

	}

}
