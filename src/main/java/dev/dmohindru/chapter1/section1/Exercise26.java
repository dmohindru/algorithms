package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

// 1.1.26
public class Exercise26 {
    public static void main(String[] args) {
        int a = 10, b = 9, c = 8, d = 7, t;
        StdOut.printf("Orginal numbers: a: %d, b: %d, c: %d\n", a, b, c);

        if (a > b) { t = a; a = b; b = t; }
        if (a > c) { t = a; a = c; c = t; }
        if (b > c) { t = b; b = c; c = t; }



        if (a < b && b < c) {
            StdOut.printf("Number are in ascending order: a: %d, b: %d, c: %d\n", a, b, c);
        } else {
            StdOut.printf("Number are not in ascending order: a: %d, b: %d, c: %d\n", a, b, c);
        }
    }
}
