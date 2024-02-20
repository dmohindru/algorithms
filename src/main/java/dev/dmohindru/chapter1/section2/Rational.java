package dev.dmohindru.chapter1.section2;

public class Rational {
    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational plus(Rational b) {
        int newDenominator = denominator * b.denominator;
        int aNewNumerator = numerator * b.denominator;
        int bNewNumerator = b.numerator * denominator;
        int sum = aNewNumerator + bNewNumerator;
        int commonDivisor = gcd(Math.abs(sum), Math.abs(newDenominator));
        return new Rational(sum / commonDivisor, newDenominator / commonDivisor);
    }

    public Rational minus(Rational b) {
        int newDenominator = denominator * b.denominator;
        int aNewNumerator = numerator * b.denominator;
        int bNewNumerator = b.numerator * denominator;
        int difference = aNewNumerator - bNewNumerator;
        int commonDivisor = gcd(Math.abs(difference), Math.abs(newDenominator));
        return new Rational(difference / commonDivisor, newDenominator / commonDivisor);
    }

    public Rational times(Rational b) {
        int newDenominator = denominator * b.denominator;
        int newNumerator = numerator * b.numerator;
        int commonDivisor = gcd(Math.abs(newNumerator), Math.abs(newDenominator));
        return new Rational(newNumerator / commonDivisor, newDenominator / commonDivisor);
    }

    public Rational divideBy(Rational b) {
        int newDenominator = denominator * b.numerator;
        int newNumerator = numerator * b.denominator;
        int commonDivisor = gcd(Math.abs(newNumerator), Math.abs(newDenominator));
        return new Rational(newNumerator / commonDivisor, newDenominator / commonDivisor);
    }

    private int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else if (!(obj instanceof Rational))
            return false;

        Rational number = (Rational) obj;
        return numerator == number.numerator && denominator == number.denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }

}
