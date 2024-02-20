package dev.dmohindru.chapter1.section2;

public class RationalRobust {
    private final long numerator;
    private final long denominator;

    public RationalRobust(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalRobust plus(RationalRobust b) {

        long newDenominator = denominator * b.denominator;
        long aNewNumerator = numerator * b.denominator;
        long bNewNumerator = b.numerator * denominator;
        long sum = aNewNumerator + bNewNumerator;

        checkOverFlow(newDenominator, aNewNumerator, bNewNumerator, sum);



        long commonDivisor = gcd(Math.abs(sum), Math.abs(newDenominator));
        return new RationalRobust((int)(sum / commonDivisor), (int)(newDenominator / commonDivisor));
    }

    public RationalRobust minus(RationalRobust b) {
        long newDenominator = denominator * b.denominator;
        long aNewNumerator = numerator * b.denominator;
        long bNewNumerator = b.numerator * denominator;
        long difference = aNewNumerator - bNewNumerator;

        checkOverFlow(newDenominator, aNewNumerator, bNewNumerator);

        long commonDivisor = gcd(Math.abs(difference), Math.abs(newDenominator));
        return new RationalRobust((int)(difference / commonDivisor), (int)(newDenominator / commonDivisor));
    }

    public RationalRobust times(RationalRobust b) {
        long newDenominator = denominator * b.denominator;
        long newNumerator = numerator * b.numerator;

        checkOverFlow(newDenominator, newNumerator);

        long commonDivisor = gcd(Math.abs(newNumerator), Math.abs(newDenominator));
        return new RationalRobust((int)(newNumerator / commonDivisor), (int)(newDenominator / commonDivisor));
    }

    public RationalRobust divideBy(RationalRobust b) {
        long newDenominator = denominator * b.numerator;
        long newNumerator = numerator * b.denominator;

        checkOverFlow(newDenominator, newNumerator);

        long commonDivisor = gcd(Math.abs(newNumerator), Math.abs(newDenominator));
        return new RationalRobust((int)(newNumerator / commonDivisor), (int)(newDenominator / commonDivisor));
    }

    private long gcd(long p, long q) {
        if (q == 0) return p;
        long r = p % q;
        return gcd(q, r);
    }

    private void checkOverFlow(long... numbers) {
        String ASSERTION_MESSAGE = "This operation will cause overflow";
        for (long num: numbers) {
            assert num <= Integer.MAX_VALUE: ASSERTION_MESSAGE;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else if (!(obj instanceof RationalRobust))
            return false;

        RationalRobust number = (RationalRobust) obj;
        return numerator == number.numerator && denominator == number.denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
