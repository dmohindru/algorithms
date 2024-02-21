package dev.dmohindru.chapter1.section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise19 {
    public static void main(String[] args) {
        SmartDate okDate = new SmartDate("02/22/2024");
        Transaction okTransaction = new Transaction("Dhruv 02/22/2024 11.99");
        StdOut.println("okDate: " + okDate);
        StdOut.println("okTransaction: " + okTransaction);

        // Below code should throw IllegalArgumentException
        //SmartDate notOkDate = new SmartDate("02/02/2024/09");
        Transaction notOkTransaction = new Transaction("Dhruv 02/02/2024 abc");

    }
}
