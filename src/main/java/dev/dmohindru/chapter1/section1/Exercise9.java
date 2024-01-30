package dev.dmohindru.chapter1.section1;

// 1.1.9
public class Exercise9 {
    public static void main(String[] args) {
        int n = 9;
        int counter = n;
        String binaryRep = "";
        while (counter > 0) {
            binaryRep = (counter % 2) + binaryRep;
            counter = counter / 2;
        }
        System.out.printf("Binary representation of %d is %s\n", n, binaryRep);
    }
}
