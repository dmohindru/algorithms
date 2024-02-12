package dev.dmohindru.charts;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public abstract class Chart {
    protected String title;
    protected String xLabel;
    protected String yLabel;

    protected ChartData[] chartData;

    protected final int canvasWidth = 1400;
    protected final int canvasHeight = 1000;

    protected final double horizontalDivision = 0.15;
    protected final double verticalDivision = 0.20;

    protected double rangeMax;

    public Chart(String title, String xLabel, String yLabel) {
        this.title = title;
        this.xLabel = xLabel;
        this.yLabel = yLabel;
        setupChart();

    }

    protected void setupChart() {
        // Default size for now width: 1400px, height: 1000px
        StdDraw.setCanvasSize(canvasWidth, canvasHeight);
        // Division of chart horizontally (x axis) 15% left of y axiz, 85% right of y axis
        StdDraw.setXscale(canvasWidth*horizontalDivision*-1, canvasWidth*(1 - horizontalDivision));
        // Division of chart vertically (y axis) 20% bottom of x axiz, 80% top of x axis
        StdDraw.setYscale(canvasHeight*verticalDivision*-1, canvasHeight*(1-verticalDivision));
        // Set title
        StdDraw.setTitle(this.title);
        StdDraw.setPenRadius(0.005);
        StdDraw.line(0,0, canvasWidth*(1 - horizontalDivision) * 0.95, 0);
        StdDraw.line(0,0, 0, canvasHeight*(1-verticalDivision)*0.95);
        // Chart Title
        StdDraw.text(600, 750, this.title);
        // y axis label
        StdDraw.text(-100, 400, this.yLabel, 90.00);
        // x axis label
        StdDraw.text(600, -100, this.xLabel);

        // max x range calculation
        double xRangeMax = canvasWidth * (1 - horizontalDivision) * 0.95;
        double yRangeMax = canvasHeight * (1 - verticalDivision) * 0.95;
        rangeMax = Math.min(xRangeMax, yRangeMax);
    }

    public void setChartData(ChartData[] chartData) {
        this.chartData = chartData;
        renderLabels();
        renderDataPoints();
    }

    public ChartData[] getInterpolatedData() {
        double minValue = Double.MAX_VALUE;
        double maxValue = Double.MIN_VALUE;
        for (int i = 0; i < chartData.length; i++) {
                // Min value loop
                if (chartData[i].getMinRage() < minValue) {
                    minValue = chartData[i].getMinRage();
                }

                // Max value loop
                if (chartData[i].getMaxRange() > maxValue) {
                    maxValue = chartData[i].getMaxRange();
                }
        }

        double slope = (rangeMax) / (maxValue - minValue);
        ChartData[] interpolatedData = new ChartData[chartData.length];
        for (int i = 0; i < chartData.length; i++) {
            double[][] interpolatedDataPoints = new double[chartData[i].getDataPoints().length][2];
            for (int j = 0; j < chartData[i].getDataPoints().length; j++) {
                // x value
                interpolatedDataPoints[j][0] = ((chartData[i].getDataPoints()[j][0] - minValue) * slope) + 0.0;
                // y value
                interpolatedDataPoints[j][1] = ((chartData[i].getDataPoints()[j][1] - minValue) * slope) + 0.0;
            }
            interpolatedData[i] = new ChartData(
                    interpolatedDataPoints,
                    chartData[i].getLabel(),
                    chartData[i].getColor(),
                    0,
                    rangeMax);
        }


        return interpolatedData;
    }

    protected abstract void renderDataPoints();

    protected abstract void renderLabels();
}
