package com.sgtesting.org;

public class Byte2DWhile {

	public static void main(String[] args) {
		byte a[][]={{16,32},{48,64}};
		
		int rows=a.length;
		int cols=a[0].length;
		
		int i=0;
		while(i<rows)
		{
			int j=0;
			while(j<cols)
			{
				System.out.print(a[i][j]+" ");
				j++;
			}
			i++;
			System.out.println();
		}
		System.out.println();
		// TODO Auto-generated method stub

	}

}
