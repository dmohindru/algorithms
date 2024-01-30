package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

// 1.1.14
public class Exercise14 {
    public static void main(String[] args) {
        StdOut.println(lg(15));

    }

    private static int lg(int num) {
        int log = 0;
        for (num = num / 2; num > 0; log++, num=num/2);
        return log;
    }
}
