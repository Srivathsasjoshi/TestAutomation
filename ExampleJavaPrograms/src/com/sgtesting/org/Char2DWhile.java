package com.sgtesting.org;

public class Char2DWhile {

	public static void main(String[] args) {
		char a[][]={{'a','b'},{'c','d'}};
		
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
		// TODO Auto-generated method stub

	}

}
