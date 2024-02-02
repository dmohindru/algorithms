package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise29 {
    public static void main(String[] args) {
        int[] numbers = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4};
        int key = 3;
        int index = binarySearch(key, numbers);
        StdOut.printf("elements less than %d = %d\n", key, smaller(index, numbers));
        StdOut.printf("number of elements equal to key[%d] %d\n", key, count(index, numbers));
    }

    public static int smaller(int index, int[] numbers) {
        int comparisonNumber = numbers[index];
        while (comparisonNumber == numbers[--index]);
        return index + 1;
    }

    public static int count(int index, int[] numbers) {
        int comparisonNumber = numbers[index];
        // Key can be any where between equal keys
        int count = 0;
        // First count toward start of array
        int temp = index - 1;
        while (temp >= 0 && comparisonNumber == numbers[temp]) {
            count++;
            temp--;

        }
        // Second count towards end of array
        temp = index + 1;
        while (temp < numbers.length && comparisonNumber == numbers[temp]) {
            count++;
            temp++;
        }
        return count;
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
