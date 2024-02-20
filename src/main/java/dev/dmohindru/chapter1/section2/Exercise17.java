package dev.dmohindru.chapter1.section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise17 {
    public static void main(String[] args) {
        RationalRobust numA = new RationalRobust(100, 2);
        RationalRobust numB = new RationalRobust(100, 3);
        // Should not cause assertion
        StdOut.println(numA.times(numB));
        RationalRobust num1 = new RationalRobust(Integer.MAX_VALUE, 2);
        RationalRobust num2 = new RationalRobust(1000, 2);
        // Should trigger assertion
        StdOut.println(num1.plus(num2));
    }
}
