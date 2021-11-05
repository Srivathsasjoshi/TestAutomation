package com.sgtesting.org.constructor;

class FabNums
{
	FabNums()
	{
		int a,b,c;
		a=0; b=1; c=0;
		for(int i=0;i<=10;i++)
		{
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;
		}
	}
}

public class Fabanocci {

	public static void main(String[] args) {
		FabNums ff=new FabNums();// TODO Auto-generated method stub

	}

}
