package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise22 {
    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9, 13, 15};
        int toSearch = 7;
        int key = rankRecursive(toSearch, data, 0, data.length-1, 0);
        if (key == -1) {
            StdOut.printf("Not found %d in array\n", toSearch);
        } else {
            StdOut.printf("Found %d at position %d\n", toSearch, key);
        }
    }


    public static int rankRecursive(int key, int[] a, int lo, int hi, int level) {
        String indent = "";
        for (int i = 0; i < level; i++)
            indent += "\t";

        int mid = lo + (hi - lo) / 2;
        StdOut.printf("%s lo: %d, hi: %d, mid: %d\n", indent, lo, hi, mid);
        if (lo > hi) return -1;

        if (key < a[mid]) return rankRecursive(key, a, lo, mid - 1, level + 1);
        else if (key > a[mid]) return rankRecursive(key, a, mid + 1, hi, level + 1);
        else return mid;
    }

}
