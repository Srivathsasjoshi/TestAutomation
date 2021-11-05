package com.sgtesting.org;

public class Byte2DDo {

	public static void main(String[] args) {
		byte a[][]={{16,32},{48,64}};
		
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
