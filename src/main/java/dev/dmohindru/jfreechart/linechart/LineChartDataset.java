package dev.dmohindru.jfreechart.linechart;

import edu.princeton.cs.algs4.Point2D;

import java.awt.*;

public class LineChartDataset {
    private final String seriesName;
    private final Color color;
    private final Point2D[] pointArray;


    private LineChartDataset(String seriesName, Color color, Point2D[] pointArray) {
        this.seriesName = seriesName;
        this.color = color;
        this.pointArray = pointArray;
    }

    public static LineChartDataset createDataSet(String seriesName, Color color, Point2D[] pointArray) {
        return new LineChartDataset(seriesName, color, pointArray);
    }

    public String getSeriesName() {
        return seriesName;
    }

    public Color getSeriesColor() {
        return color;
    }

    public Point2D[] getSeriesData() {
        return pointArray;
    }
}
