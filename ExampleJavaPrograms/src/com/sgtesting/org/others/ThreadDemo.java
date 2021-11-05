package com.sgtesting.org.others;

class MyClass implements Runnable
{
	public void run()
	{
		displayEvenNumbers();
	}
	
	synchronized void displayEvenNumbers()
	{
		try
		{
			for(int i=20;i<=40;i=i+2)
			{
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+"Display the even numbers : "+i);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass job=new MyClass ();
		Thread t1=new Thread(job);
		Thread t2=new Thread(job);
		t1.setName("alpha");
		t2.setName("omega");
		t1.start();
		t2.start();
	}
}
