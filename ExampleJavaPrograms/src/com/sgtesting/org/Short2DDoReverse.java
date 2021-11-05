package com.sgtesting.org;

public class Short2DDoReverse {

	public static void main(String[] args) {
		short a[][]={{10,20},{30,40}};
		
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
