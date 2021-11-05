package com.sgtesting.org;

public class Short2D {

	public static void main(String[] args) {
		short a[][]={{10,20},{30,40}};
		
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
