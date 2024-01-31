package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise21 {
    public static void main(String[] args) {
        String[] inputLines = StdIn.readAllLines();
        StdOut.printf("%7s %7s %7s %7s\n", "Names", "Number1", "Number2", "Result");
        double result;
        int a, b;
        for (String line: inputLines) {
            String []tokens = line.split(" ");
            a = Integer.parseInt(tokens[1]);
            b = Integer.parseInt(tokens[2]);
            result = (double) a / b;
            StdOut.printf("%7s %7s %7s %7.3f\n", tokens[0], tokens[1], tokens[2], result);
        }
    }
}
