package com.sgtesting.org;

class ArrayDemo
{
	ArrayDemo(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

public class ArrayContr {

	public static void main(String[] args) {

		int b[]= {10,20,30,40,50};
		ArrayDemo o=new ArrayDemo(b);
	}

}
