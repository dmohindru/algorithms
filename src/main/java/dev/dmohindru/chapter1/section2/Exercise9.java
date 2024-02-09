package dev.dmohindru.chapter1.section2;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;

public class Exercise9 {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 4, 5, 7, 9, 10, 15 };
        Counter counter = new Counter("Rank Counter");
        int key = 10;
        int keyIndex = rank(key, numbers, 0, numbers.length, counter);
        if (keyIndex == -1) {
            StdOut.printf("key [%d] not found\n", key);
        } else {
            StdOut.printf("key [%d] found at index [%d]\n", key, keyIndex);
        }

        StdOut.printf("Total number of keys examined: %d\n", counter.tally());
    }

    public static int rank(int key, int[] a, int lo, int hi, Counter counter) {

        int mid = lo + (hi - lo) / 2;
        if (lo > hi) {
            counter.increment();
            return -1;
        }

        if (key < a[mid]) {
            counter.increment();
            return rank(key, a, lo, mid - 1, counter);
        }
        else if (key > a[mid]) {
            counter.increment();
            return rank(key, a, mid + 1, hi, counter);
        }
        else return mid;
    }
}
