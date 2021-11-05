package com.sgtesting.org.constructor;

class Sampler
{
	public static Sampler obj=null;
	
	private Sampler()
	{
		//private constructor
	}
	
	void addition(int x, int y)
	{
		int res=(x+y);
		System.out.println("add res = "+res);
	}
	
	void multiplication(int x, int y)	
	{
		int res=(x*y);
		System.out.println("mul res = "+res);
	}
	
	public static Sampler getInstance()
	{
		if(obj==null)
		{
			obj=new Sampler();
		}
		return obj;
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		
		Sampler o1=Sampler.getInstance();
		o1.addition(10, 20);
		o1.multiplication(10, 12);
		
		Sampler o2=Sampler.getInstance();
		o2.addition(18, 20);
		o2.multiplication(60, 12);
		
		Sampler o3=Sampler.getInstance();
		o3.addition(10, 2);
		o3.multiplication(0, 12);
		
		if(o1==o2 && o2==o3)
		{
			System.out.println("Same objects!!!!!\nChange objects");
		}
		else
		{
			System.out.println("Different objects");
		}

	}

}
