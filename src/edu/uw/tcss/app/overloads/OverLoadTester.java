package edu.uw.tcss.app.overloads;

public class OverLoadTester {

    public static void main(final String[] theArgs) {
        paramIsWhat(2);
     }
    public static void paramIsWhat(final int theNumber) {
        System.out.println("I'm an int");
    }
    public static void paramIsWhat(final byte theNumber) {
        System.out.println("I'm a byte");
    }
    public static void paramIsWhat(final long theNumber) {
        System.out.println("I'm a long");
    }
    public static void paramIsWhat(final float theNumber) {
        System.out.println("I'm a float");
    }
    public static void paramIsWhat(final double theNumber) {
        System.out.println("I'm a double");
    }
    public static void paramIsWhat(final Integer theNumber) {
        System.out.println("I'm an Integer");
    }
    public static void paramIsWhat(final Long theNumber) {
        System.out.println("I'm a Long");
    }
    public static void paramIsWhat(final Double theNumber) {
        System.out.println("I'm a Double" + theNumber.getClass());
    }
    public static void paramIsWhat(final Number theNumber) {
        System.out.println("I'm a Number " + theNumber.getClass());
    }
    public static void paramIsWhat(final Object theNumber) {
        System.out.println("I'm a Object " + theNumber.getClass());
    }
}

