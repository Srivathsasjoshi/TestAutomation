package com.sgtesting.org.constructor;

class Unc
{
	String Name(String s, String t)
	{
		return (s+"\n"+t);
	}
	
}

public class CalcDemo4 {

	public static void main(String[] args) {
		Unc a=new Unc();
		String x=a.Name("Ganesh","Raichur");
		System.out.println(x);

	}

}
//return your name and city