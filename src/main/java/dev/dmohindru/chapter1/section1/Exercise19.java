package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise19 {
    public static void main(String[] args) {
        int n = 51;
        long startTime = System.nanoTime();
        long value = F(n);
        long endTime = System.nanoTime();
        StdOut.println("---Recursive version---");
        StdOut.printf("F(%d) = %d, took %d nanoseconds\n", n, value, endTime - startTime);

        // Non recursive version
        long[] values = new long[n+1];
        values[0] = 0;
        values[1] = 1;
        startTime = System.nanoTime();
        value = FNonRecursive(n, values);
        endTime = System.nanoTime();
        StdOut.println("---Non Recursive version---");
        StdOut.printf("FNonRecursive(%d) = %d, took %d nanoseconds", n, value, endTime - startTime);

    }

    private static long F(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return F(n - 1) + F(n - 2);
    }

    private static long FNonRecursive(int n, long[] values) {
        if (n == 0) return values[0];
        if (n == 1) return values[1];

        for (int i = 2; i <= n; i++) {
            values[i] = values[i - 1] + values[i - 2];
        }

        return values[n];
    }
}
