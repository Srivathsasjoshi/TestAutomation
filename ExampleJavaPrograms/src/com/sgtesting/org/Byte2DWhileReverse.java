package com.sgtesting.org;

public class Byte2DWhileReverse 
{
	public static void main(String args[])
	{
		byte a[][]={{16,32},{48,64}};
		
		int rows=a.length;
		int cols=a[0].length;

		
		int k=rows-1;
		while(k>=0)
		{
			int l=cols-1;
			while(l>=0)
			{
				System.out.print(a[k][l]+" ");
				l--;
			}
			k--;
			System.out.println();
		}
	}
}
