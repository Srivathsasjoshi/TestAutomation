package com.sgtesting.org;

public class Short2DForReverse {

	public static void main(String[] args) {
		short a[][]={{10,20},{30,40}};
		
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
