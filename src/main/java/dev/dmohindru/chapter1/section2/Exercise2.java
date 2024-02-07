package dev.dmohindru.chapter1.section2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise2 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[N];
        for (int i = 0; i < N; i++) {
            double intervalMin = StdIn.readDouble();
            double intervalMax = StdIn.readDouble();
            intervals[i] = new Interval1D(intervalMin, intervalMax);
        }

        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals.length; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    StdOut.println(intervals[i] + " intersects with " + intervals[j]);
                }
            }
        }
    }
}
