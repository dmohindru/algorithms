package dev.dmohindru.chapter1.section2;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.StdOut;

public class Exercise14 {
    public static void main(String[] args) {
        Transaction one = new Transaction("Dhruv", new Date(2, 20, 2024), 200.00);
        Transaction two = new Transaction("Dhruv", new Date(2, 20, 2024), 200.00);
        Transaction three = new Transaction("Dhruv", new Date(2, 20, 2024), 201.00);

        StdOut.printf("Expected: true, Actual: %b\n", one.equals(two));
        StdOut.printf("Expected: false, Actual: %b\n", one.equals(three));
    }
}
