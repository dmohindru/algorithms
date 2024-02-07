package dev.dmohindru.chapter1.section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise6 {
    public static void main(String[] args) {
        String str1 = "ACTGACG";
        String str2 = "TGACGAC";

        StdOut.printf("%s and %s are circular = %b\n", str1, str2, isCircular(str1, str2));

        str1 = "abc";
        str2 = "def";
        StdOut.printf("%s and %s are circular = %b\n", str1, str2, isCircular(str1, str2));
    }

    public static boolean isCircular(String str1, String str2) {
        return str1.length() == str2.length() && (str1 + str1).contains(str2);
    }
}
