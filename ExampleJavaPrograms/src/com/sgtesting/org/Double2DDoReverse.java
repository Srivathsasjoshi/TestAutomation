package com.sgtesting.org;

public class Double2DDoReverse {

	public static void main(String[] args) {
		double a[][]={{11.11,22.22},{33.33,44.44}};
		
		int rows=a.length;
		int cols=a[0].length;

		int k=rows-1;
		do
		{
			int l=cols-1;
			do
			{
				System.out.print(a[k][l]+" ");
				l--;
			}while(l>=0);
			k--;
			System.out.println();
		}while(k>=0);// TODO Auto-generated method stub

	}

}
