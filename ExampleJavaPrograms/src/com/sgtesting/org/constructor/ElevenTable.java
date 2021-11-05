package com.sgtesting.org.constructor;

class Table
{
	Table()
	{
		for(int i=1;i<=10;i++)
		{
			int j;
			j=i*11;
			System.out.println("11 * "+i+" = "+j);
		}
	}
}
public class ElevenTable {

	public static void main(String[] args) {
		
		Table t1=new Table();
	}

}
