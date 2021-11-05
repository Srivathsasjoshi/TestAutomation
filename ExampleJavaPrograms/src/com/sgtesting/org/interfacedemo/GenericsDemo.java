package com.sgtesting.org.interfacedemo;

class TestGeneric<T>
{
	T obj=null;
	public void add(T obj)
	{
		this.obj=obj;
	}
	public T get()
	{
		return obj;
	}
}

public class GenericsDemo {

	public static void main(String[] args) {
		
		//with generic
		
		TestGeneric<Integer>obj1=new TestGeneric<Integer>();
		obj1.add(100);
		int a=obj1.get();
		System.out.println(a);
		obj1.add(200);
		int b=obj1.get();
		System.out.println(b);

		//without generic
		
		TestGeneric obj2=new TestGeneric();
		obj2.add("Apple");
		String s1=(String) obj2.get();
		System.out.println(s1);
		obj2.add(125);
		int c=(int) obj2.get();
		System.out.println(c);
		
	}

}
