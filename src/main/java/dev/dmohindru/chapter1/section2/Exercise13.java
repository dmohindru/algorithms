package dev.dmohindru.chapter1.section2;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.StdOut;

public class Exercise13 {
    public static void main(String[] args) {
        Transaction transaction = new Transaction(
                "Dhruv",
                new Date(2, 20, 2024),
                100.00
        );
        StdOut.println(transaction);
    }
}
