package com.sgtesting.org.constructor;

class Testss {
	Testss() {
		System.out.println("It is a not args constructor");
	}	
	static {
		System.out.println("it is a static block statement");
	}
}
public class Test0 {
	public static void main(String[] args) {
		Testss p2=new Testss();	
	}
}