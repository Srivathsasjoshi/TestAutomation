package com.sgtesting.org.constructor;

class Demdemo
{
	void arr(int x[], int y[])
	{
		for(int i=0;i<=x.length-1;i++)
		{
			int res=(x[i]+y[i]);
			System.out.print(res+" ");
		}
	}
	
	//or this method
	// int[] adds(int x[], int y[])
	// int c[]=new int[x.length];
	// for(int i=0;i<=x.length-1;i++)
	// { c[i]=x[i]+y[i]}
	// return c;
	
}

public class IntArr {

	public static void main(String[] args) {
		
		int a[]= {8,7,5,2};
		int b[]= {1,2,3,4};
		Demdemo as=new Demdemo();
		as.arr(a, b);

	}
}
//return addition results of 1d arrays(methods)