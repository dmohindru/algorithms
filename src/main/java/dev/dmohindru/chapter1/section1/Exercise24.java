package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

// 1.1.24
public class Exercise24 {
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        StdOut.println("---euclid call stack---");
        int r = euclid(p, q);
        StdOut.printf("%7s %7s %7s\n", "p", "q", "gcd");
        StdOut.printf("%7d %7d %7d\n", p, q, r);
    }

    public static int euclid(int p, int q) {
        StdOut.printf("p=%d, q=%d\n", p, q);
        if (q == 0) return p;
        int r = p % q;
        return euclid(q, r);
    }
}
