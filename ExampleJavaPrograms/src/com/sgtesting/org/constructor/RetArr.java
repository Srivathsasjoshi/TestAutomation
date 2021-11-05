package com.sgtesting.org.constructor;

class Sample
{
	int[] getArray(int arr[])
	{
		return arr;
	}
}

public class RetArr {

	public static void main(String[] args) {
		
		Sample o=new Sample();
		int b[]= {1,2,3,4};
		int c[]=o.getArray(b);
		for(int kk:c)
		{
			System.out.println(kk);
		}
	
	}
}
//method has to return a given array