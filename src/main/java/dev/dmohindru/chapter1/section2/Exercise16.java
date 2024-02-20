package dev.dmohindru.chapter1.section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise16 {
    public static void main(String[] args) {
        Rational num1 = new Rational(1, 2);
        Rational num2 = new Rational(3, 4);
        StdOut.println("Num1: " + num1);
        StdOut.println("Num2: " + num2);
        StdOut.println("Addition: " + num1.plus(num2));
        StdOut.println("Subtraction: " + num1.minus(num2));
        StdOut.println("Multiplication: " + num1.times(num2));
        StdOut.println("Division: " + num1.divideBy(num2));
    }
}
