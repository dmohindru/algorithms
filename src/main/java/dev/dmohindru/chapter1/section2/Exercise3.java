package dev.dmohindru.chapter1.section2;

import edu.princeton.cs.algs4.*;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

    private static Map<Interval2D, Interval1D[]> intervalMap = new HashMap<>();
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        if (min > max) {
            double temp = max;
            max = min;
            min = temp;
        }

        Interval2D[] intervals = new Interval2D[N];

        createDraw2DInterval(intervals, min, max);
        StdOut.println("Number of intersecting intervals: " + countIntersectingIntervals(intervals));
        StdOut.println("Number of containing intervals: " + countContainingIntervals(intervals));
    }

    static void createDraw2DInterval(Interval2D[] intervals, double min, double max) {

        StdDraw.setCanvasSize(1024, 512);
        StdDraw.setPenRadius(.015);
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);

        for (int i = 0; i < intervals.length; i++) {
            Interval1D firstInterval = create1DInterval(min, max);
            Interval1D secondInterval = create1DInterval(min, max);
            intervals[i] = new Interval2D(firstInterval, secondInterval);
            intervals[i].draw();
            intervalMap.put(intervals[i], new Interval1D[] {firstInterval, secondInterval});
        }
    }

    static Interval1D create1DInterval(double min, double max) {
        double num1 = StdRandom.uniformDouble(min, max);
        double num2 = StdRandom.uniformDouble(min, max);

        if (num1 > num2) {
            double temp = num2;
            num2 = num1;
            num1 = temp;
        }

        return new Interval1D(num1, num2);

    }

    static int countIntersectingIntervals(Interval2D[] intervals) {
        int counter = 0;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    counter++;
                }
            }
        }
        return counter;
    }

    static int countContainingIntervals(Interval2D[] intervals) {
        int containing = 0;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1 ; j < intervals.length; j++) {
                Interval1D[] interval1DArray = intervalMap.get(intervals[j]);
                if (interval1DArray == null)
                    continue;

                if (intervals[i].contains(get2DPoint(interval1DArray[0])) &&
                        intervals[i].contains(get2DPoint(interval1DArray[1]))) {
                    containing++;
                }
            }
        }
        return containing;
    }

    static Point2D get2DPoint(Interval1D interval1D) {
        return new Point2D(interval1D.min(), interval1D.max());
    }
}
