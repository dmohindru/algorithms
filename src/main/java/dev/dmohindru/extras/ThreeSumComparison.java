package dev.dmohindru.extras;

import dev.dmohindru.util.Constants;
import edu.princeton.cs.algs4.*;
/*
Result of execution of this program
Filename	SlowCount	SlowThreeSum	FastCount	FastThreeSum
8ints.txt	4			0.000000			4			0.001000
1Kints.txt	70			0.199000			70			0.016000
2Kints.txt	528			1.444000			528			0.046000
4Kints.txt	4039		11.158000			4039		0.214000
8Kints.txt	32074		89.986000			32074		0.796000
16Kints.txt	255181		729.787000			255181		3.170000
32Kints.txt	2052358		5991.680000			2052358		13.316000
 */

public class ThreeSumComparison {
    public static void main(String[] args) {
        StdOut.printf("Filename\tSlowCount\tSlowThreeSum\tFastCount\tFastThreeSum\n");
        for (String fileName: args) {
            In in = new In(Constants.BASE_PATH + fileName);
            int[] allInts = in.readAllInts();
            Stopwatch slowCounter = new Stopwatch();
            int count = ThreeSum.count(allInts);
            double slowCounterTime = slowCounter.elapsedTime();
            //StdOut.printf("Three Sum Slow count: %d, time consumed: %f\n", count, slowCounterTime);
            Stopwatch fastCounter = new Stopwatch();
            int countFast = ThreeSumFast.count(allInts);
            double fastCounterTime = fastCounter.elapsedTime();
            //StdOut.printf("Three Sum fast count: %d, time consumed: %f\n", countFast, fastCounterTime);
            StdOut.printf("%s\t%d\t\t\t%f\t\t\t%d\t\t\t%f\n", fileName, count, slowCounterTime, countFast, fastCounterTime );

        }

    }
}
