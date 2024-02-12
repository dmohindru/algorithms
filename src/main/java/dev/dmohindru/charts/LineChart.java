package dev.dmohindru.charts;

import edu.princeton.cs.algs4.StdDraw;

import java.util.PrimitiveIterator;

public class LineChart extends Chart {

    private final double LABEL_X_OFFSET = 1000;
    private final double LABEL_Y_OFFSET = 700;

    private final double SQUARE_WIDTH = 10;

    private final double TEXT_OFFSET = 75;

    private final double NEXT_LABEL_OFFSET = 50;

    public LineChart(String title, String xLabel, String yLabel) {
        super(title, xLabel, yLabel);
    }

    @Override
    protected void renderDataPoints() {
        ChartData[] interpolatedData = getInterpolatedData();
//        double[] previousPoint = { 0.0, 0.0 };
        for (int i = 0; i < interpolatedData.length; i++) {
            StdDraw.setPenColor(interpolatedData[i].getColor());
            double[] previousPoint = { 0.0, 0.0 };
            for (int j = 0; j < interpolatedData[i].getDataPoints().length; j++) {
                double[] currentPoint = interpolatedData[i].getDataPoints()[j];
                StdDraw.line(previousPoint[0], previousPoint[1], currentPoint[0], currentPoint[1]);
                previousPoint = currentPoint;
            }
        }

    }

    @Override
    protected void renderLabels() {
        for (int i = 0; i < chartData.length; i++) {
            double yOffset = LABEL_Y_OFFSET - (i * NEXT_LABEL_OFFSET);
            StdDraw.setPenColor(chartData[i].getColor());
            StdDraw.filledSquare(LABEL_X_OFFSET, yOffset , SQUARE_WIDTH);
            StdDraw.text(LABEL_X_OFFSET + TEXT_OFFSET, yOffset, chartData[i].getLabel() );
        }

    }


}
