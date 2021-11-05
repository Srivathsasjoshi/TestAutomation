package com.sgtesting.org.constructor;

class Mat
{
	Mat()
	{
		int a[]= {1,5,7};
		int b[]= {3,2,1};
		int c[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
	}
}

public class AddMat {

	public static void main(String[] args) {
		Mat ms=new Mat();// TODO Auto-generated method stub

	}

}
