package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class Exercise31 {

    private static class Point {
        double x;
        double y;
        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        draw(N, p);

    }

    static void draw(int N, double p) {

        Point[] points = new Point[N];
        double step = 2 * Math.PI / N;
        double circleRadius = 1000;
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(Math.cos(step*i) * 1000, Math.sin(step * i) * 1000);
        }

        StdDraw.setXscale(-1024, 1024);
        StdDraw.setYscale(-1024, 1024);
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(Color.RED);
        // Draw points
        for (int i = 0; i < points.length; i++) {
            StdDraw.point(points[i].x, points[i].y);
        }

        // Draw lines on basis of probability
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (StdRandom.bernoulli(p)) {
                    StdDraw.line(points[i].x, points[i].y, points[j].x, points[j].y);
                }
            }
        }

    }
}
