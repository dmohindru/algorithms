package dev.dmohindru.chapter1.section2;

import dev.dmohindru.util.Constants;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise15 {
    public static void main(String[] args) {
        int[] tests = readInts(Constants.BASE_PATH + "1Kints.txt");
        StdOut.println("Entered numbers: " + tests.length);

    }
    public static int[] readInts(String name)
    {
        In in = new In(name);
        String input = in.readAll();
        String[] words = input.split("\\s+");
        int[] ints = new int[words.length];
        for( int i = 0; i < words.length; i++)
            try {
                ints[i] = Integer.parseInt(words[i]);
            } catch (NumberFormatException ex) {
                // Do nothing here
            }

        return ints;
    }
}
