package com.sgtesting.org;

public class PrintCube {

	public static void main(String[] args) {
		int a[]=new int[10];
		int k=0;
		for(int l=1;l<=10;l++)
		{
				a[k]=l*l*l;
				k++;
		}
		
		for(int m=0;m<=a.length-1;m++)
		{
			System.out.println(a[m]);
		}//TODO Auto-generated method stub

	}

}
