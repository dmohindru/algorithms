package dev.dmohindru.jfreechart.barchart;

public class BarDataPoint {
    private final double value;
    private final String bucketName;

    private BarDataPoint(double value, String bucketName) {
        this.value = value;
        this.bucketName = bucketName;
    }

    public static BarDataPoint createBarDataPoint(double value, String bucketName) {
        return new BarDataPoint(value, bucketName);
    }

    public double getValue() {
        return value;
    }

    public String getBucketName() {
        return bucketName;
    }
}
