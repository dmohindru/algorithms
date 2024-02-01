package dev.dmohindru.chapter1.section1;

public class Exercise29 {
    public static void main(String[] args) {
        int[] numbers = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4};
        int index = binarySearch(4, numbers);
        System.out.println(index);
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
