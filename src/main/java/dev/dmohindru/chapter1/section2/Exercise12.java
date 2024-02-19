package dev.dmohindru.chapter1.section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise12 {
    public static void main(String[] args) {
        SmartDate smartDate = new SmartDate(23, 11, 2024);
        StdOut.printf("Expected: Saturday, Actual: %s\n", smartDate.dayOfTheWeek());

        SmartDate smartDate1 = new SmartDate(23, 11, 2025);
        StdOut.printf("Expected: Sunday, Actual: %s\n", smartDate1.dayOfTheWeek());
    }
}
