package dev.dmohindru.chapter1.section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise18 {
    public static void main(String[] args) {

        Accumulator accumulator = new Accumulator();
        accumulator.addDataValue(2.0);
        accumulator.addDataValue(4.0);
        accumulator.addDataValue(10.0);
        StdOut.println("Mean expected: 5.333333333333334, actual: " + accumulator.mean());
        StdOut.println(accumulator.var());
        StdOut.println(accumulator.stddev());


    }
}

class Accumulator
{
    private double m;
    private double s;
    private int N;

    public void addDataValue(double x)
    {
        N++;
        s = s + 1.0 * (N-1) / N * (x - m) * (x - m);
        m = m + (x - m) / N;
    }

    public double mean()
    {  return m;  }

    public double var()
    {  return s/(N - 1);  }

    public double stddev()
    {  return Math.sqrt(this.var());  }

}
