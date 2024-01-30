package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise11 {
    public static void main(String[] args) {
        boolean [][] data = {
                {true, false, true, true},
                {true, false, true, false},
                {true, false, true, true}
        };

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                StdOut.printf("[%d][%d]-->", i, j);
                if (data[i][j]) {
                    StdOut.print(" * ");
                } else {
                    StdOut.print("   ");
                }
            }
            StdOut.println();
        }
    }
}
