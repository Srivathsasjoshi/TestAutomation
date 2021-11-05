package com.sgtesting.org.constructor;

class Mats
{
	Mats()
	{
		int a[][]= {{1,2,3},{4,5,6}};
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}

public class TwoDTranspose {

	public static void main(String[] args) {
		Mats ms=new Mats();
	}

}
