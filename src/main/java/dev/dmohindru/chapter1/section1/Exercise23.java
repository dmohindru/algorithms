package dev.dmohindru.chapter1.section1;

import dev.dmohindru.util.Constants;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

// 1.1.23
public class Exercise23 {
    public static void main(String[] args) {
        String fileName = Constants.BASE_PATH + args[0];
        int[] whitelist = (new In(fileName)).readAllInts();
        char operation = args[1].charAt(0);

        if (operation != '-' && operation != '+') {
            throw new IllegalArgumentException("Operation need to be '-' or '+'");
        }

        boolean searchForWhiteList = operation == '+';
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int index = binarySearch(key, whitelist);
            if (index != -1 && searchForWhiteList) {
                StdOut.println("Number in whitelist: " + key);
            } else if (index == -1 && !searchForWhiteList) {
                StdOut.println("Number not in whitelist: " + key);
            }
        }
    }

    public static int binarySearch(int key, int[] numbers) {
        return rankRecursive(key, numbers, 0, numbers.length);
    }

    public static int rankRecursive(int key, int[] a, int lo, int hi) {

        int mid = lo + (hi - lo) / 2;
        if (lo > hi) return -1;

        if (key < a[mid]) return rankRecursive(key, a, lo, mid - 1);
        else if (key > a[mid]) return rankRecursive(key, a, mid + 1, hi);
        else return mid;
    }
}
