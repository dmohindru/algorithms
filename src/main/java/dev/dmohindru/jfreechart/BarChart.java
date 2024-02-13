package dev.dmohindru.jfreechart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class BarChart extends JFrame {
    private static final long serialVersionUID = 1L;

    public BarChart(String applicationTitle, String chartTitle) {
        super(applicationTitle);
        // Create dataset
        CategoryDataset dataset = createDataset();
        // based on dataset we create the chart
        JFreeChart barChart = createChart(dataset, chartTitle);
        // We put chart into panel
        ChartPanel chartPanel = new ChartPanel(barChart);
        // default size
        chartPanel.setPreferredSize(new Dimension(1280, 760));

        // add it to our application
        setContentPane(chartPanel);

    }

    private CategoryDataset createDataset() {
        final String fiat = "FIAT";
        final String audi = "AUDI";
        final String ford = "FORD";
        final String toyota = "TOYOTA";
        final String mazda = "MAZDA";
        final String nissan = "NISSAN";
        final String speed = "Speed";
        final String millage = "Millage";
        final String userrating = "User Rating";
        final String safety = "safety";
        final DefaultCategoryDataset dataset =
                new DefaultCategoryDataset( );

        dataset.addValue( 1.0 , fiat , speed );
        dataset.addValue( 3.0 , fiat , userrating );
        dataset.addValue( 5.0 , fiat , millage );
        dataset.addValue( 5.0 , fiat , safety );

        dataset.addValue( 5.0 , audi , speed );
        dataset.addValue( 6.0 , audi , userrating );
        dataset.addValue( 10.0 , audi , millage );
        dataset.addValue( 4.0 , audi , safety );

        dataset.addValue( 4.0 , ford , speed );
        dataset.addValue( 2.0 , ford , userrating );
        dataset.addValue( 3.0 , ford , millage );
        dataset.addValue( 6.0 , ford , safety );

        dataset.addValue( 7.0 , toyota , speed );
        dataset.addValue( 2.0 , toyota , userrating );
        dataset.addValue( 3.0 , toyota , millage );
        dataset.addValue( 6.0 , toyota , safety );

        dataset.addValue( 4.0 , mazda , speed );
        dataset.addValue( 2.0 , mazda , userrating );
        dataset.addValue( 3.0 , mazda , millage );
        dataset.addValue( 6.0 , mazda , safety );

        dataset.addValue( 4.0 , nissan, speed );
        dataset.addValue( 2.0 , nissan , userrating );
        dataset.addValue( 3.0 , nissan , millage );
        dataset.addValue( 6.0 , nissan , safety );

        return dataset;

    }

    private JFreeChart createChart(CategoryDataset dataset, String title) {
        JFreeChart barChart = ChartFactory.createBarChart(
                title,
                "Car Usage Statistics",
                "Value",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );

        customiseChart(barChart);

        return barChart;

    }

    void customiseChart(JFreeChart chart) {}

}
