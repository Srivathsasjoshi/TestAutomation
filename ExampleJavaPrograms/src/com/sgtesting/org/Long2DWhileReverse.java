package com.sgtesting.org;

public class Long2DWhileReverse {

	public static void main(String[] args) {
		long a[][]={{4,8},{12,16}};
		
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
		}// TODO Auto-generated method stub

	}

}
