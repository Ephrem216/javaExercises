package exercises;

import java.util.Date;
import java.util.Random;
import java.util.GregorianCalendar;

public class DateTest {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        int year = cal.get(GregorianCalendar.YEAR);
        int month = cal.get(GregorianCalendar.MONTH);
        int day = cal.get(GregorianCalendar.DATE);
        System.out.printf("The date of the day is %2s/%2s/%4s", day, month, year);
        System.out.println();
        cal.setTimeInMillis(1234567898765L);
        year = cal.get(GregorianCalendar.YEAR);
        month = cal.get(GregorianCalendar.MONTH);
        day = cal.get(GregorianCalendar.DATE);
        System.out.printf("The date of the day is %2s/%2s/%4s", day, month, year);

//        Random random = new Random(1000);
//        for (int i = 0; i < 50; i++) {
//            System.out.print(random.nextInt(100) + " , ");
//        }
//        Date date = new Date();
//        date.setTime(10_000);
//        System.out.println("The time is " + date.toString());
//        date.setTime(100_000);
//        System.out.println("The time is " + date.toString());
//        date.setTime(1_000_000);
//        System.out.println("The time is " + date.toString());
//        date.setTime(10_000_000);
//        System.out.println("The time is " + date.toString());
//        date.setTime(100_000_000);
//        System.out.println("The time is " + date.toString());
//        date.setTime(1_000_000_000);
//        System.out.println("The time is " + date.toString());
//        date.setTime(10_000_000_000L);
//        System.out.println("The time is " + date.toString());
//        date.setTime(100_000_000_000L);
//        System.out.println("The time is " + date.toString());
//        date.setTime(1_000_000_000_000L);
//        System.out.println("The time is " + date.toString());
//        System.out.println("The time is " + new Date().toString());
//        System.out.println("Elapsed time " + new Date().getTime());
//
//
//

    }
}
