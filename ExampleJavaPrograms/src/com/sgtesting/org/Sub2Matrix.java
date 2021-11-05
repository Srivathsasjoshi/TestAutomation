package com.sgtesting.org;

public class Sub2Matrix {

	public static void main(String[] args) {
		int a[][]= {{10,20},{30,40}};
		int b[][]= {{4,3},{2,1}};
		int c[][]=new int[2][2];
		
		int rows=a.length;
		int cols=a[0].length;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}// TODO Auto-generated method stub

	}

}
