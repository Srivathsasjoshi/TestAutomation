package com.sgtesting.org.others;

class Test
{
		int count=1;
		void displayNumbers()
		{
			if(count<=10)
			{
				System.out.println(count);
				count++;
				displayNumbers();
			}
		}
}

public class Recursion_Demo {

	public static void main(String[] args) {
		
		Test o=new Test();
		o.displayNumbers();

	}

}
