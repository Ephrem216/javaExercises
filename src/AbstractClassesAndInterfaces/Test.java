package AbstractClassesAndInterfaces;

public class Test {
    public static void main(String[] args) {
        try {
            Rational r1 = new Rational(1, 2);
            Rational r2 = new Rational(1,-2);
            Rational r3 = new Rational(0,-2);
            System.out.println(r2.divide(r3));
//            Rational rational1 = new Rational(36, 128);
//            System.out.println(rational1);
//            Rational r1 = new Rational(-2, 6);
//            System.out.println(r1.getNumerator());
//            System.out.println(r1.getDenominator());
//            System.out.println(r1.intValue());
//            System.out.println(r1.doubleValue());
//            Rational r1 = new Rational(4, 2);
//            Rational r2 = new Rational(2, 3);
//            System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
//            System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
//            System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
//            System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
//            System.out.println(r2 + " is " + r2.doubleValue());
        } catch (DenominatorZeroException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
//        System.out.println(gcd(20,36));
//        Calendar calendar = new GregorianCalendar();
//        System.out.println("Current time is "+new Date());
//        System.out.println("Current year is "+ calendar.get(Calendar.YEAR));
//        System.out.println("Current month is "+ calendar.get(Calendar.MONTH));
//        System.out.println("Current date is "+ calendar.get(Calendar.DATE));
//        System.out.println("Current day of the week is "+ calendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println("Current day of the month is "+ calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println("Current day of the year is "+ calendar.get(Calendar.DAY_OF_YEAR));
//        System.out.println("Current week of the month is "+ calendar.get(Calendar.WEEK_OF_MONTH));
//        System.out.println("Current week of the year is "+ calendar.get(Calendar.WEEK_OF_YEAR));
//        System.out.println("Current hour is "+ calendar.get(Calendar.HOUR));
//        System.out.println("Current minute is "+ calendar.get(Calendar.MINUTE));
//        System.out.println("Current hour of the day is "+ calendar.get(Calendar.HOUR_OF_DAY));
//        System.out.println("Current am/pm status "+ (calendar.get(Calendar.AM_PM)==0?"AM":"PM"));
//        System.out.println("Current second is "+ calendar.get(Calendar.SECOND));
//        Calendar cal = new GregorianCalendar(2016,3,21);
//        String[] dayWeekNames = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
//        System.out.println("April 21st 2016 is "+dayWeekNames[cal.get(Calendar.DAY_OF_WEEK)-1]);
//        PrintCalendar prtCal = new PrintCalendar(2016,3);
//        prtCal.printMonth();

//        Number x = new Integer(3);
//        System.out.println(x.intValue());
//        System.out.println(((Integer) x).compareTo(new Integer(49)));
//        System.out.println(x.compareTo(new Integer(4)));
//        Number numberRef = new Integer(0);
//        Double doubleRef = new Double(numberRef.doubleValue());
//        Number[] numberArray = new Integer[2];
//        numberArray[0] = new Double(1.5);
//        Number x = 3;
//        System.out.println(x.intValue());
//        System.out.println(x.doubleValue());
//
//    }
//
//    private static long gcd(long n, long d) {
//        long temp;
//        while (d != 0) {
//            temp = n % d;
//            n = d;
//            d = temp;
//        }
//        return n;
//        if (d == 0) {
//            return n;
//        }
//        return gcd(d, n % d);
    }

}

