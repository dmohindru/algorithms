package dev.dmohindru.chapter1.section2;

import dev.dmohindru.jfreechart.linechart.LineChart;
import dev.dmohindru.jfreechart.linechart.LineChartDataset;
import edu.princeton.cs.algs4.Point2D;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class VisualCounter {
    private int N;
    private int max;

    private int opsCounter;

    private int tally;

    private List<Point2D> tallyPoints = new ArrayList<>();
    private List<Point2D> opsPoints = new ArrayList<>();

    private List<Point2D> attemptedOpsPoints = new ArrayList<>();

    private int attemptedOperations;

    public VisualCounter(int numOperations, int maxAbsoluteValue) {
        this.N = numOperations;
        this.max = maxAbsoluteValue;
        this.opsCounter = 0;
        this.tally = 0;
        this.attemptedOperations = 0;
        tallyPoints.add(new Point2D(0.0, 0.0));
        opsPoints.add(new Point2D(0.0, 0.0));
        attemptedOpsPoints.add(new Point2D(0.0, 0.0));
    }

    public void increment() {
        attemptedOperations++;
        if (opsCounter < N) {
            opsCounter++;
        }
        if (Math.abs(tally) < max) {
            tally++;
        }
        updatePoints();
    }

    public void decrement() {
        attemptedOperations++;
        if (opsCounter < N) {
            opsCounter++;
        }
        if (Math.abs(tally) < max) {
            tally--;
        }
        updatePoints();
    }

    public int getTally() {
        return this.tally;
    }

    public int getOpsCount() {
        return this.opsCounter;
    }

    private void updatePoints() {
        tallyPoints.add(new Point2D(attemptedOperations, tally));
        opsPoints.add(new Point2D(attemptedOperations, opsCounter));
        attemptedOpsPoints.add(new Point2D(attemptedOperations, attemptedOperations));
    }

    public void visualize() {

        LineChartDataset numOpsPoints = LineChartDataset.createDataSet(
                "Attempted Ops",
                Color.GREEN,
                attemptedOpsPoints.toArray(new Point2D[0]));

        LineChartDataset opsDataPoints = LineChartDataset.createDataSet(
                "Ops",
                Color.RED,
                opsPoints.toArray(new Point2D[0]));

        LineChartDataset tallyDataPoints = LineChartDataset.createDataSet(
                "Tally",
                Color.BLUE,
                tallyPoints.toArray(new Point2D[0]));

        LineChartDataset[] dataset = {opsDataPoints, tallyDataPoints, numOpsPoints};

        LineChart lineChart = LineChart.createLineChart("Visual Counter", "N", "Value", dataset);
        lineChart.display();

    }
}
