package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

//1.1.17
public class Exercise17 {
    public static void main(String[] args) {
        // Should never return and eventually terminated with java.lang.StackOverflowError exception.
        String result = exR2(6);
        StdOut.println(result);

    }

    public static String exR2(int n)
    {
        String s = exR2(n-3) + n + exR2(n-2) + n;
        if (n <= 0) return "";
        return s;
    }
}
