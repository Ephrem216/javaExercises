package AbstractClassesAndInterfaces;

public class Rational extends Number implements Comparable<Rational> {
    private long numerator;
    private long denominator;

    public Rational() throws DenominatorZeroException {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) throws DenominatorZeroException {
        if (denominator == 0)
            throw new DenominatorZeroException();
        long gcd = Math.abs(gcd(numerator, denominator));
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(long denominator) throws DenominatorZeroException {
        if (denominator == 0)
            throw new DenominatorZeroException();
        this.denominator = denominator;
    }

    public Rational add(Rational rational) throws DenominatorZeroException {
        long resultNumerator = numerator * rational.denominator + denominator * rational.numerator;
        long resultDenominator = denominator * rational.denominator;
        return new Rational(resultNumerator, resultDenominator);
    }

    public Rational subtract(Rational rational) throws DenominatorZeroException {
        long resultNumerator = numerator * rational.denominator - denominator * rational.numerator;
        long resultDenominator = denominator * rational.denominator;
        return new Rational(resultNumerator, resultDenominator);
    }

    public Rational multiply(Rational rational) throws DenominatorZeroException {
        long resultNumerator = numerator * rational.numerator;
        long resultDenominator = denominator * rational.denominator;
        return new Rational(resultNumerator, resultDenominator);
    }

    public Rational divide(Rational rational) throws DenominatorZeroException {
        long resultNumerator = numerator * rational.denominator;
        long resultDenominator = denominator * rational.numerator;
        return new Rational(resultNumerator, resultDenominator);
    }

    @Override
    public int compareTo(Rational rational) {
        return Long.compare(numerator * rational.denominator, denominator * rational.numerator);
    }

    @Override
    public int intValue() {
        return (int) (numerator / denominator);
    }

    @Override
    public long longValue() {
        return numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public String toString() {
        return denominator == 1 ? numerator + "" : (numerator + "/" + denominator);
    }

    @Override
    public boolean equals(Object rational) {
        try {
            return this.subtract((Rational)rational).getNumerator() == 0;
        } catch (DenominatorZeroException e) {
            return false;
        }
    }

    private static long gcd(long n, long d) {
        if (d == 0)
            return n;
        else
            return gcd(d, n % d);
    }
}

class DenominatorZeroException extends Exception {
    public DenominatorZeroException() {
        super("Invalid denominator : denominator can not be zero.");
    }
}