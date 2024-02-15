package dev.dmohindru.jfreechart;

import dev.dmohindru.jfreechart.barchart.BarChart;

public class Main {
    public static void main(String[] args) {
//        PieChart demo = new PieChart("Comparison", "Which operating system are you using?");
//        demo.pack();
//        demo.setVisible(true);

//        LineChart lineChartDemo = new LineChart("Line Chart Demo", "Growth Chart");
//        lineChartDemo.pack();
//        lineChartDemo.setVisible(true);

        BarChart barChartDemo = new BarChart("Bar Chart Demo", "Car usage");
        barChartDemo.pack();
        barChartDemo.setVisible(true);
    }
}
