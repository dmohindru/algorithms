package dev.dmohindru.charts;

import java.awt.*;

public class ChartData {
    private double[][] dataPoints;
    private String label;

    private Color color;

    private double minRage;

    private double maxRange;

    public ChartData(double[][] dataPoints, String label, Color color, double minRage, double maxRange) {
        this.dataPoints = dataPoints;
        this.label = label;
        this.color = color;
        this.minRage = minRage;
        this.maxRange = maxRange;
    }

    public double[][] getDataPoints() {
        return dataPoints;
    }

    public String getLabel() {
        return label;
    }

    public Color getColor() {
        return color;
    }

    public double getMaxRange() {
        return maxRange;
    }

    public double getMinRage() {
        return minRage;
    }
}
