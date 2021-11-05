package com.sgtesting.org.constructor;

class Dmeos
{
	static int count=0;
	Dmeos()
	{
		count=count+1;
	}
}

public class Uridrimaan {

	public static void main(String[] args) {
		
		Dmeos o1=new Dmeos();
		Dmeos o2=new Dmeos();
		Dmeos o3=new Dmeos();
		Dmeos o4=new Dmeos();
		Dmeos o5=new Dmeos();
		System.out.println("# of objects/instances is "+Dmeos.count);

	}

}
