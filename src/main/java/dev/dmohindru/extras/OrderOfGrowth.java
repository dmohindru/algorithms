package dev.dmohindru.extras;

import dev.dmohindru.jfreechart.linechart.LineChart;
import dev.dmohindru.jfreechart.linechart.LineChartDataset;
import edu.princeton.cs.algs4.Point2D;

import java.awt.*;

// This code example demonstrates plotting of log-log chart to analyse order of growth
public class OrderOfGrowth {
    public static void main(String[] args) {
        int N = 100;
        // O(1)
        Point2D[] oConstant = new Point2D[N];

        // O(Log(n))
        Point2D[] logN = new Point2D[N];

        // O(n)
        Point2D[] linear = new Point2D[N];

        // O(nLog(n))
        Point2D[] nLogN = new Point2D[N];

        // O(n^2)
        Point2D[] nSquared = new Point2D[N];

        // O(n^3)
        Point2D[] nCubed = new Point2D[N];

        // O(2^n)
        Point2D[] exponential = new Point2D[N];
        for (int i = 0; i < N; i++) {
            double logNXAxis = logBase2(i);
            double constantYAxis = logBase2(1);
            double nYAxis = logBase2(i);
            double nLogNYAxis = logBase2(i * logBase2(i));
            double nSquaredYAxis = logBase2(i * i);
            double nCubedYAxis = logBase2(i * i * i);



            Point2D constantPoint = new Point2D(logNXAxis, constantYAxis);
            oConstant[i] = constantPoint;

            Point2D logNPoint = new Point2D(logNXAxis, logNXAxis);
            logN[i] = logNPoint;

            Point2D linearPoint = new Point2D(logNXAxis, nYAxis);
            linear[i] = linearPoint;

            Point2D nLogNPoint = new Point2D(logNXAxis, nLogNYAxis);
            nLogN[i] = nLogNPoint;

            Point2D nSquaredPoint = new Point2D(logNXAxis, nSquaredYAxis);
            nSquared[i] = nSquaredPoint;

            Point2D nCubedPoint = new Point2D(logNXAxis, nCubedYAxis);
            nCubed[i] = nCubedPoint;

        }

        LineChartDataset[] lineChartDataset = new LineChartDataset[6];
        lineChartDataset[0] = LineChartDataset.createDataSet("O(1)", Color.RED, oConstant);
        lineChartDataset[1] = LineChartDataset.createDataSet("O(Log(n))", Color.BLUE, logN);
        lineChartDataset[2] = LineChartDataset.createDataSet("O(n)", Color.GREEN, linear);
        lineChartDataset[3] = LineChartDataset.createDataSet("O(nLog(n))", Color.GRAY, nLogN);
        lineChartDataset[4] = LineChartDataset.createDataSet("O(n^2)", Color.BLACK, nSquared);
        lineChartDataset[5] = LineChartDataset.createDataSet("O(n^3)", Color.MAGENTA, nCubed);


        LineChart lineChart = LineChart.createLineChart(
                "Growth Chart on Log Log Plot",
                "Log(N)",
                "Log(Growth)",
                lineChartDataset);

        lineChart.display();
    }

    private static double logBase2(double number) {
        if (number == 0) {
            return 0.0;
        }
        return Math.log(number) / Math.log(2);
    }
}
