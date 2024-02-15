package dev.dmohindru.jfreechart.linechart;

import edu.princeton.cs.algs4.Point2D;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

// https://steemit.com/visualization/@datatreemap/visualize-a-multiple-lines-graph-with-jfreechart-in-java
public class LineChart extends JFrame {
    private static final long serialVersionUID = 1L;

    private LineChart(String chartTitle, String xAxisLabel, String yAxisLabel, LineChartDataset[] datasetArray) {
        super(chartTitle);
        // Create data set
        //XYDataset dataset = createDataset(datasetArray);

        // based on dataset create chart
        JFreeChart lineChart = createChart(datasetArray, chartTitle, xAxisLabel, yAxisLabel);

        // Put chart into a panel
        ChartPanel chartPanel = new ChartPanel(lineChart);

        // Default Size
        chartPanel.setPreferredSize(new Dimension(1280, 760));

        // add it to our application
        setContentPane(chartPanel);

    }

    public static LineChart createLineChart(String chartTitle, String xAxisLabel, String yAxisLabel, LineChartDataset[] datasetArray) {
        return new LineChart(chartTitle, xAxisLabel, yAxisLabel, datasetArray);
    }

    public void display() {
        pack();
        setVisible(true);
    }

    private XYDataset createDataset(LineChartDataset[] datasetArray) {    // this method creates the data as time seris
        XYSeriesCollection dataset = new XYSeriesCollection();

        for (LineChartDataset lineDataset: datasetArray) {
            XYSeries series = new XYSeries(lineDataset.getSeriesName());
            for (Point2D point: lineDataset.getSeriesData()) {
                series.add(point.x(), point.y());
            }
            dataset.addSeries(series);
        }

//        XYSeries series1 = new XYSeries("Object 1");
//        XYSeries series2 = new XYSeries("Object 2");
//        XYSeries series3 = new XYSeries("Object 3");
//
//        series1.add(1.0, 2.0);
//        series1.add(2.0, 3.0);
//        series1.add(3.0, 2.5);
//        series1.add(3.5, 2.8);
//        series1.add(4.2, 6.0);
//
//        series2.add(2.0, 1.0);
//        series2.add(2.5, 2.4);
//        series2.add(3.2, 1.2);
//        series2.add(3.9, 2.8);
//        series2.add(4.6, 3.0);
//
//        series3.add(1.2, 4.0);
//        series3.add(2.5, 4.4);
//        series3.add(3.8, 4.2);
//        series3.add(4.3, 3.8);
//        series3.add(4.5, 4.0);
//
//        dataset.addSeries(series1);
//        dataset.addSeries(series2);
//        dataset.addSeries(series3);

        return dataset;
    }

    private JFreeChart createChart(XYDataset dataset, String title, String xAxisLabel, String yAxisLabel) {
        JFreeChart chart = ChartFactory.createXYLineChart(
                title,
                xAxisLabel,
                yAxisLabel,
                dataset,
                PlotOrientation.HORIZONTAL,
                true,
                false,
                false);
        customizeChart(chart);
        return chart;
    }

    private JFreeChart createChart(LineChartDataset[] datasetArray, String title, String xAxisLabel, String yAxisLabel) {
        XYDataset dataset = createDataset(datasetArray);

        JFreeChart chart = ChartFactory.createXYLineChart(
                title,
                xAxisLabel,
                yAxisLabel,
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false);
        customizeChart(chart, datasetArray);
        return chart;
    }

    private void customizeChart(JFreeChart chart) {
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

        // Set paint color for each series
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesPaint(1, Color.GREEN);
        renderer.setSeriesPaint(2, Color.BLUE);

        // sets thickness for series (using strokes)
        renderer.setSeriesStroke(0, new BasicStroke(4.0f));
        renderer.setSeriesStroke(1, new BasicStroke(3.0f));
        renderer.setSeriesStroke(2, new BasicStroke(2.0f));

        // sets paint color for plot outlines
        plot.setOutlinePaint(Color.BLUE);
        plot.setOutlineStroke(new BasicStroke(2.0f));

        // sets renderer for lines
        plot.setRenderer(renderer);

        // sets plot background
        plot.setBackgroundPaint(Color.DARK_GRAY);

        // sets paint color for the grid lines
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);


    }

    private void customizeChart(JFreeChart chart, LineChartDataset[] datasetArray) {
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

        // Set paint color for each series
        for (int i = 0; i < datasetArray.length; i++) {
            renderer.setSeriesPaint(i, datasetArray[i].getSeriesColor());
            renderer.setSeriesStroke(i, new BasicStroke(2.0f));
        }

        // sets paint color for plot outlines
        plot.setOutlinePaint(Color.BLUE);
        plot.setOutlineStroke(new BasicStroke(2.0f));

        // sets renderer for lines
        plot.setRenderer(renderer);

        // sets plot background
        plot.setBackgroundPaint(Color.LIGHT_GRAY);

        // sets paint color for the grid lines
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);


    }
}
