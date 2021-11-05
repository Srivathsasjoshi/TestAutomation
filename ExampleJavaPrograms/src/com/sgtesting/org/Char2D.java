package com.sgtesting.org;

public class Char2D {

	public static void main(String[] args) {
		char a[][]={{'a','b'},{'c','d'}};
		
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

		// TODO Auto-generated method stub

	}

}
