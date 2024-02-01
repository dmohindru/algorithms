package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise28 {
    public static void main(String[] args) {
        int[] src = { 1, 1, 1, 2, 2, 3, 3, 4, 4};
        int[] result = removeDuplicate(src);
        printArray(src);
        printArray(result);


    }

    public static int[] removeDuplicate(int[] data) {
        int[] newData = new int[data.length];
        int count = 1;
        newData[0] = data[0];
        for (int i = 1; i < data.length; i++) {
            if (newData[count-1] != data[i]) {
                newData[count++] = data[i];
            }
        }
        int[] result = new int[count];
        System.arraycopy(newData, 0, result, 0, count);
        return result;
    }

    public static void printArray(int[] data) {
        StdOut.printf("[ ");
        for (int i = 0; i < data.length; i++) {
            StdOut.printf(" %4d ", data[i]);
        }
        StdOut.printf(" ]\n");
    }
}
