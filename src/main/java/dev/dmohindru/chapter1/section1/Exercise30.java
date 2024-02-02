package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise30 {
    public static void main(String[] args) {
        int N = 6;
        boolean[][] data = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                data[i][j] = gcd(i, j) == 1;
            }
        }

        printArray(data);

    }

    public static void printArray(boolean[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                StdOut.printf("%7s", data[i][j] ? "true": "false");
            }
            StdOut.println();
        }
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
