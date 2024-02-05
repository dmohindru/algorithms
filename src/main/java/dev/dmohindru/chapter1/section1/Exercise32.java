package dev.dmohindru.chapter1.section1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise32 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double low = Double.parseDouble(args[1]);
        double high = Double.parseDouble(args[2]);

        double steps = (high - low) / N;
        int totalSteps = (int)((high - low) / steps);
        double[] histrogram = new double[totalSteps];

        for (int i = 0; i < 100; i++) {
            double randomNumber = StdRandom.uniformDouble(low, high);
            int bucket = (int)(randomNumber / high * totalSteps);
            histrogram[bucket]++;
        }
        System.out.println(histrogram);
        draw(histrogram);

    }

    static void draw(double[] histrogram) {
        double max = Double.MIN_VALUE;
        int gap = 50;
        double startX = 50.00;
        double width = 10.00;
        double maxHeight = 900.00;
        for (int i = 0; i < histrogram.length; i++) {
            if (histrogram[i] > max ) {
                max = histrogram[i];
            }
        }

        StdDraw.setXscale(-50, 2000);
        StdDraw.setYscale(-50, 1000);

        for (int i = 0; i < histrogram.length; i++) {
            double x = startX + (width + gap) * i  + (width / 2);
            double height = (histrogram[i] / max)  * maxHeight;
            StdDraw.filledRectangle(x, height/2, width/2, height/2);
        }
    }
}
