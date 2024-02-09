package dev.dmohindru.charts;

public class ChartFactory {
    static Chart createChart(String title, String xLabel, String yLabel, ChartType chartType) {
        return switch (chartType) {
            case BAR -> new BarChart(title, xLabel, yLabel);
            case LINE -> new LineChart(title, xLabel, yLabel);
            case PIE -> throw new UnsupportedOperationException("PIE Charts not implemented");
        };
    }
}
