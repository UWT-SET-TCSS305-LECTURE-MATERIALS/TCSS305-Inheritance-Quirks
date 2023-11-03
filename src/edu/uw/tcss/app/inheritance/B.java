package edu.uw.tcss.app.inheritance;

public class B extends A {
	private int myValue;
	public B() {
		super();
		System.out.println("Cnstrctr B");
		init();
	}
	public void init() {
		System.out.println("Init of B");
		myValue = 42;
	}
	public int getValue() { return myValue;}
	@Override
	public void method() {
		System.out.println("Method of B");
	}
	@Override
	public String toString() {
		return "toString() of B";
	}
}
