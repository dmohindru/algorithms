package dev.dmohindru.chapter1.section2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.awt.*;

public class Exercise10 {
    public static void main(String[] args) {
        VisualCounter visualCounter = new VisualCounter(5, 13);
        for (int i = 0; i < 50; i++) {
            visualCounter.increment();
        }

        StdOut.printf("Current Tally: %d, Num of operations: %d\n",
                visualCounter.getTally(),
                visualCounter.getOpsCount());

        visualCounter.visualize();

    }
}

class VisualCounter {
    private int N;
    private int max;

    private int opsCounter;

    private int tally;

    private int attemptedOperations;

    public VisualCounter(int numOperations, int maxAbsoluteValue) {
        this.N = numOperations;
        this.max = maxAbsoluteValue;
        this.opsCounter = 0;
        this.tally = 0;
        this.attemptedOperations = 0;
    }

    public void increment() {
        attemptedOperations++;
        if (opsCounter < N && Math.abs(tally) < max) {
            opsCounter++;
            tally++;
        }
    }

    public void decrement() {
        attemptedOperations++;
        if (opsCounter < N && Math.abs(tally) < max) {
            opsCounter++;
            tally--;
        }
    }

    public int getTally() {
        return this.tally;
    }

    public int getOpsCount() {
        return this.opsCounter;
    }

    public void visualize() {

        StdDraw.setXscale(0, attemptedOperations*10);
        StdDraw.setYscale(0, attemptedOperations*10);
        StdDraw.setPenRadius(0.01);
        int numOperationCounter = 0;
        int tallyCounter = 0;
        for (int i = 0; i < attemptedOperations; i++){
            // Draw attempted operations
            StdDraw.setPenColor(Color.RED);
            StdDraw.point(i, i);
            // Draw number of operations
            StdDraw.setPenColor(Color.BLUE);
            StdDraw.point(i, numOperationCounter);
            // Draw tally
            StdDraw.setPenColor(Color.GREEN);
            StdDraw.point(i, tallyCounter);
            if (numOperationCounter < this.opsCounter)
                numOperationCounter++;
            if (tallyCounter < this.tally) {
                tallyCounter++;
            }
        }

    }
}
