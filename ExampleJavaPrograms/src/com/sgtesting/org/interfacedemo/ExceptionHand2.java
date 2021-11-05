package com.sgtesting.org.interfacedemo;

class TestString
{
	static int getCharacterCount(String str)throws Exception
	{
		if(str==null)
		{
			throw new Exception("the input is null, please provide the valid input to get the charcter count ");
		}
		return str.length();
	}
}
public class ExceptionHand2 {

	public static void main(String[] args) {
		
		try
		{
			int v1=TestString.getCharacterCount("Java");
			System.out.println("# of chars : "+v1);
			int v2=TestString.getCharacterCount(null);
			System.out.println("# of chars : "+v2);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
