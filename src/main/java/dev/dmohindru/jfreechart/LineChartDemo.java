package dev.dmohindru.jfreechart;

import dev.dmohindru.jfreechart.linechart.LineChart;
import dev.dmohindru.jfreechart.linechart.LineChartDataset;
import edu.princeton.cs.algs4.Point2D;

import java.awt.*;

public class LineChartDemo {
    public static void main(String[] args) {
        int N = 11;
        Point2D[] nSqGrowth = new Point2D[N];
        Point2D[] nLogNGrowth = new Point2D[N];
        Point2D[] nGrowth = new Point2D[N];
        Point2D[] logGrowth = new Point2D[N];

        for (int i = 0; i < N; i++) {
            nSqGrowth[i] = new Point2D(i, i*i);

            nGrowth[i] = new Point2D(i, i);
            if (i == 0) {
                nLogNGrowth[i] = new Point2D(i, 0);
                logGrowth[i] = new Point2D(i, 0);
            } else {
                nLogNGrowth[i] = new Point2D(i, i * Math.log(i));
                logGrowth[i] = new Point2D(i, Math.log(i));
            }

        }

        LineChartDataset[] lineChartDataset = new LineChartDataset[4];
        lineChartDataset[0] = LineChartDataset.createDataSet("N Squared", Color.RED, nSqGrowth);
        lineChartDataset[1] = LineChartDataset.createDataSet("N Log N", Color.BLUE, nLogNGrowth);
        lineChartDataset[2] = LineChartDataset.createDataSet("N", Color.GREEN, nGrowth);
        lineChartDataset[3] = LineChartDataset.createDataSet("Log N", Color.YELLOW, logGrowth);

        LineChart lineChart = LineChart.createLineChart(
                "Growth Chart",
                "N",
                "Growth",
                lineChartDataset);
        lineChart.display();

    }
}
