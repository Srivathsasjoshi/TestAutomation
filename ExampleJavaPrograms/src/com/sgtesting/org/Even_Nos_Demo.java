package com.sgtesting.org;

public class Even_Nos_Demo {

	public static void main(String[] args) {
		int count=0;
		for(int i=20;i<=40;i=i+2)
		{
			count=count+1;
		}
		System.out.println(count+" is the no of even nos");
		
		int a[]=new int[count];
		int k=0;
		for(int j=20;j<=40;j=j+2)
		{
			a[k]=j;
			k++;
		}
		for(int l=a.length-1;l>=0;l--)
		{
			System.out.println(a[l]);
		}
		// TODO Auto-generated method stub
	}

}
