package com.sgtesting.org.constructor;

class Urn
{
	void Prime(int n)
	{
		int a=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				a++;
				break;
			}
		}
		if(a==0)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
		System.out.println();
	}
	
	void OddEven(int a)
	{
		if(a%2==0)
		{
			System.out.println("The no "+a+" is even");
		}
		else
		{
			System.out.println("The no "+a+" is odd");
		}
		System.out.println();
	}
	
	void Div9(int b)
	{
		if(b%9==0)
		{
			System.out.println("The no "+b+" is divisible by 9");
		}
		else
		{
			System.out.println("The no "+b+" is not divisible by 9");
		}
		System.out.println();
	}
	
	void Table(int a)
	{
		for(int i=1;i<=10;i++)
		{
			int j=a*i;
			System.out.println(a+" * "+i+" = "+j);
			
		}
		System.out.println();
	}
	
	void RevTab(int c)
	{
		for(int i=10;i>=1;i--)
		{
			int j=c*i;
			System.out.println(c+" * "+i+" = "+j);
			
		}
		System.out.println();
	}
	
	void EveRange(int a,int b)
	{
		int c=0;
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				c=c+1;
			}
		}
		System.out.println("The even nos b/w the range of "+a+" and "+b+" is "+c);
		System.out.println();
	}
	
	void SumIP(int a,int b)
	{
		int c=a+b;
		System.out.println("sum of the 2 given nos is "+c);
	}
	
	void Add2D(int a[][], int b[][])
	{
		int c[][]=new int[3][3];
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	void Add1D(int a[], int b[])
	{
		int c[]=new int[5];
		for(int i=0;i<=a.length-1;i++)
		{
			c[i]=a[i]+b[i];
			System.out.print(c[i]+" ");
		}
	}
	
}

public class BigAssignment {

	public static void main(String[] args) {
		
		Urn u2=new Urn();
		
		u2.Prime(16);
	
		u2.OddEven(18);
	
		u2.Div9(36);
	
		u2.Table(12);
	
		u2.RevTab(5);
	
		u2.EveRange(12,80);
		
		u2.SumIP(8, 5);
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{9,9,7},{6,5,4},{3,2,1}};
		u2.Add2D(a, b);
		
		int c[]= {1,2,6,4,5};
		int d[]= {9,8,7,6,5};
		u2.Add1D(c, d);
		
		
	}

}
