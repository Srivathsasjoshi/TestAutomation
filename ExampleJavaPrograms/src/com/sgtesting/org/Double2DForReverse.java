package com.sgtesting.org;

public class Double2DForReverse {

	public static void main(String[] args) {
		double a[][]={{11.11,22.22},{33.33,44.44}};
		
		int rows=a.length;
		int cols=a[0].length;
		

		for(int k=rows-1;k>=0;k--)
		{
			for(int l=cols-1;l>=0;l--)
			{
				System.out.print(a[k][l]+" ");
			}
			System.out.println();
		}// TODO Auto-generated method stub

	}

}
