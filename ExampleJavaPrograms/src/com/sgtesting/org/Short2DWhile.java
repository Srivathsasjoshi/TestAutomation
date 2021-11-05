package com.sgtesting.org;

public class Short2DWhile {

	public static void main(String[] args) {
		short a[][]={{10,20},{30,40}};
		
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
