package edu.uw.tcss.app.inheritance;

public class DemoDynamicBinding {

	public static void main(String[] args) throws CloneNotSupportedException {
		

		
		A a = new A();
		String sString = a.toString();
		System.out.println(sString);
		a.method();
		System.out.println(a.getText());
		System.out.println(a.getText().length());
		printSepartor();
		a = new B();
		sString = a.toString();
		System.out.println(sString);
		a.method();
		System.out.println(a.getText());
		System.out.println(a.getText().length());
	}
	
	private static void printSepartor() {
		System.out.println("\n*******************\n");
	}

}
