package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

//1.1.5
public class Exercise5 {
    public static void main(String[] args) {
        isStrictlyBetween(0.0, 1.1);
        StdOut.println("Expected: false");
        isStrictlyBetween(0.01, 0.999);
        StdOut.println("Expected: true");
        isStrictlyBetween(-0.1, 0.999);
        StdOut.println("Expected: false");

    }

    private static void isStrictlyBetween(double x, double y) {
        if (x >= 0.0 && x <= 1.0 && y >= 0.0 && y <= 1.0) {
            StdOut.println("true");
        } else {
            StdOut.println("false");
        }
    }
}
