package dev.dmohindru.chapter1.section2;

import dev.dmohindru.jfreechart.linechart.LineChart;
import dev.dmohindru.jfreechart.linechart.LineChartDataset;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Exercise10 {
    public static void main(String[] args) {
        VisualCounter visualCounter = new VisualCounter(50, 5);
        for (int i = 0; i < 100; i++) {
            visualCounter.increment();
        }

        StdOut.printf("Current Tally: %d, Num of operations: %d\n",
                visualCounter.getTally(),
                visualCounter.getOpsCount());

        visualCounter.visualize();

    }
}


