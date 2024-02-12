package dev.dmohindru.charts;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class ChartDriver {
    public static void main(String[] args) {

        int N = 100;
//        double[][] nSqDataPoints = new double[N][2];
//        for (int i = 1; i < N; i++ ) {
//            nSqDataPoints[i][0] = i;
//            nSqDataPoints[i][1] = i*i;
//        }

        double[][] nDataPoints = new double[N][2];
        for (int i = 0; i < N; i++) {
            nDataPoints[i][0] = i;
            nDataPoints[i][1] = i;
        }

        double[][] nLogPoints = new double[N][2];
        for (int i = 1; i < N; i++) {
            nLogPoints[i][0] = i;
            nLogPoints[i][1] = Math.log(i);
        }

        ChartData[] chartData = new ChartData[]{
//                new ChartData(nSqDataPoints, "N^2", Color.RED, 0, N * N),
                new ChartData(nDataPoints, "N", Color.BLUE, 0, N),
                new ChartData(nLogPoints, "Log(N)", Color.GREEN, 0, N)
        };

        Chart chart = ChartFactory.createChart("Growth Chart", "Time", "Result", ChartType.LINE);
        chart.setChartData(chartData);
    }
}
