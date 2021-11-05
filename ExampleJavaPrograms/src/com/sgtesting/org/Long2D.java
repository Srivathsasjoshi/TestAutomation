package com.sgtesting.org;

public class Long2D {

	public static void main(String[] args) {
		long a[][]={{4,8},{12,16}};
		
		int rows=a.length;
		int cols=a[0].length;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int k=rows-1;k>=0;k--)
		{
			for(int l=cols-1;l>=0;l--)
			{
				System.out.print(a[k][l]+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
