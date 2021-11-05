package com.sgtesting.org.constructor;

class Urus
{
	void Addition(int a, int b, int c)
	{
		int res;
		res=a+b+c;
		System.out.println("Addition of 3 nos is "+res);
	}
	
	void Division(int a, int b)
	{
		int res;
		res=a/b;
		System.out.println("Division of 2 nos is "+res);
	}
		
	void Range(int n)
	{
		for(int a=1;a<=n;a++)
		{
			System.out.print(a+" ");
		}
	}
	
}

public class AddDiv {

	public static void main(String[] args) {
		Urus as=new Urus();
		as.Addition(3,2,1);
		as.Division(20,2);
		as.Range(10);

	}

}
