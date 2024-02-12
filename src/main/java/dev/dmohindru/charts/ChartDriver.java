package dev.dmohindru.charts;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class ChartDriver {
    public static void main(String[] args) {
        //Chart chart = new Chart("Test Chart", "x Label", "y Label");
        ChartData[] chartData = new ChartData[] {
                new ChartData(new double[][] {{0.0, 0.1}}, "Label1", Color.RED, 0.0, 1.0),
                new ChartData(new double[][] {{0.0, 0.2}}, "Label2", Color.GREEN, 0.0, 1.0),
                new ChartData(new double[][] {{0.0, 0.3}}, "Label3", Color.BLUE, 0.0, 1.0),
                new ChartData(new double[][] {{0.0, 0.4}}, "Label4", Color.MAGENTA, 0.0, 1.0),
                new ChartData(new double[][] {{0.0, 1.0}}, "Label4", Color.MAGENTA, 0.0, 1.0)
        };

        Chart chart = ChartFactory.createChart("Test Chart", "x axis", "y axis", ChartType.LINE);
        chart.setChartData(chartData);

    }
}
