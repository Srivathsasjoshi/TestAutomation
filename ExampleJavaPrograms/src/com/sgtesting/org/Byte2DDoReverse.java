package com.sgtesting.org;

public class Byte2DDoReverse {

	public static void main(String[] args) {
		byte a[][]={{16,32},{48,64}};
		
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
