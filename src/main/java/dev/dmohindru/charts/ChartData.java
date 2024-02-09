package dev.dmohindru.charts;

import java.awt.*;

public class ChartData {
    private double[] dataPoints;
    private String label;

    private Color color;

    public ChartData(double[] dataPoints, String label, Color color) {
        this.dataPoints = dataPoints;
        this.label = label;
        this.color = color;
    }

    public double[] getDataPoints() {
        return dataPoints;
    }

    public String getLabel() {
        return label;
    }

    public Color getColor() {
        return color;
    }
}
