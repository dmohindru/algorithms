package dev.dmohindru.jfreechart.barchart;

public class BarChartDataset {
    private final BarDataPoint[] dataPoints;
    private final String characteristicName;

    private BarChartDataset(BarDataPoint[] dataPoints, String characteristicName) {

        this.dataPoints = dataPoints;
        this.characteristicName = characteristicName;
    }

    public static BarChartDataset createDataSet(BarDataPoint[] dataPoints, String characteristicName) {
        return new BarChartDataset(dataPoints, characteristicName);
    }


    public BarDataPoint[] getBarDataPoints() {
        return this.dataPoints;
    }

    public String getCharacteristicName() {
        return characteristicName;
    }
}

