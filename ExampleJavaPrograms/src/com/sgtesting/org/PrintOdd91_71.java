package com.sgtesting.org;

public class PrintOdd91_71 {

	public static void main(String[] args) {
		int count=0;
		for(int i=91;i>=71;i=i-2)
		{
			count=count+1;
		}
		System.out.println(count+" is the no of odd nos in between 91 & 71");
		
		int a[]=new int[count];
		int j=0;
		for(int k=91;k>=71;k=k-2)
		{
			a[j]=k;
			j++;
		}
		
		for(int l=count-1;l>=0;l--)
		{
			System.out.println(a[l]);
		}
		// TODO Auto-generated method stub

	}

}
