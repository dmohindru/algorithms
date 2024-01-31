package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise20 {
    public static void main(String[] args) {

        long fact = factorial(3);
        StdOut.printf("factorial(3) = %d, ln(6) = %f\n", fact, ln(fact));
        fact = factorial(4);
        StdOut.printf("factorial(4) = %d, ln(24) = %f\n", fact, ln(fact));


    }

    private static long factorial(long n) {
        if (n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    private static double ln(long n) {
        return Math.log(n);
    }

}
