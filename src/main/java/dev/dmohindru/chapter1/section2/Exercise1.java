package dev.dmohindru.chapter1.section2;


import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise1 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Point2D[] points = new Point2D[N];
        // Generate random points
        for (int i = 0; i < points.length; i++) {
            double randX = StdRandom.uniformDouble(0, 1.0);
            double randY = StdRandom.uniformDouble(0, 1.0);
            points[i] = new Point2D(randX, randY);
        }

        int first, second;
        double distance = Double.MAX_VALUE;
        for (first = 0; first < points.length; first++) {
            for (second = 0; second < points.length; second++) {
                if (first == second)
                    continue;
                double distanceTo = points[first].distanceTo(points[second]);
                StdOut.println("Distance between " + points[first] + " " + points[second] + "is " + distanceTo);
                if (distanceTo < distance) {
                    distance = distanceTo;
                }
            }
        }

        StdOut.println("Closest Distance: " + distance);



    }
}
