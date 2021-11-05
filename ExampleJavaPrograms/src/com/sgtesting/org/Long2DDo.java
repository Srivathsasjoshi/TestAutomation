package com.sgtesting.org;

public class Long2DDo {

	public static void main(String[] args) {
		long a[][]={{4,8},{12,16}};
		
		int rows=a.length;
		int cols=a[0].length;
		
		int i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(a[i][j]+" ");
				j++;
			}while(j<cols);
			i++;
			System.out.println();
		}while(i<rows);
		System.out.println();

		// TODO Auto-generated method stub

	}

}
