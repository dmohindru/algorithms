package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise13 {
    public static void main(String[] args) {

        int[][] array = {
                {0, 1, 2},
                {4, 5, 6},
                {8, 9, 10},
                {12, 13, 14}
        };
        StdOut.println("Original matrix");
        print(array);
        StdOut.println("Transpose");
        print(transpose(array));

    }

    private static int[][] transpose(int [][]array) {
        int [][]transpose = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transpose[j][i] = array[i][j];
            }
        }
        return transpose;
    }

    private static void print(int [][]array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                StdOut.print(" " + array[i][j] + " ");
            }
            StdOut.println();
        }

    }
}
