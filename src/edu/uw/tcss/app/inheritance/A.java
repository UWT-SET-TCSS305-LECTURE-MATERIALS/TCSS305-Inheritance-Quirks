package edu.uw.tcss.app.inheritance;

public class A {
	private String myText;
	public A() {
		System.out.println("Cnstrctr A");
		init();
	}
	public void init() {
		System.out.println("Init of A");
		myText = "Set Me";
	}
	public String getText() { return myText; }
	public void method() {
		System.out.println("Method of A");
	}
	@Override
	public String toString() {
		return "toString() of A";
	}
}
