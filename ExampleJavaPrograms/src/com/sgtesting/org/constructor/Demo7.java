package com.sgtesting.org.constructor;


class Demoarray
{

	int[] get1dArray(int x[], int y[]) // (1)This method is behaving ,it has two 1d array's.
	{

		int c[]=new int [13]; // (2)resultant 1d array
		int k=0;
		for(int i=0; i<x.length; i++) // (3)two for loops for iterating over array
		{
			c[k]=x[i];
			k=k+1;
		}
		for(int j=0; j<y.length; j++)
		{
			c[k]=y[j];
			k=k+1;
		}
		return c; // (4)return value
		}
	}


public class Demo7{

public static void main(String[] args) {
	Demoarray o=new Demoarray();
	int x[]= {10,20,30,40,50};
	int y[]= {2,4,6,5,8,10,20,30};
	int[] a= o.get1dArray(x,y);
	for(int p:a) //--->>>> iterating over elements of a array.
	{
		System.out.print(p+ "  ");
		}
	}
}
