package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

//1.1.2
public class Exercise2 {
    public static void main(String[] args) {
        Double a = (1 + 2.236) / 2;
        Double b = 1 + 2 + 3 + 4.0;
        Boolean c = 4.1 >= 4;
        String d = 1 + 2 + "3";
        StdOut.println("a) " + a + " --> " + a.getClass());
        StdOut.println("b) " + b + " --> " + b.getClass());
        StdOut.println("c) " + c + " --> " + c.getClass());
        StdOut.println("d) " + d + " --> " + d.getClass());
    }
}
