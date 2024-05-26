package exceptions;

import java.util.Scanner;

public class QuotientWithExceptions {
    public static int quotient(int number1, int number2) {
        int[] x = new int[5];
        x[5] = 5;
//        if(number2 == 0)
//            throw new ArithmeticException("Division by zero is forbidden!");
        return number1 / number2;
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 0;
        try {
            int result = quotient(num1, num2);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            StackTraceElement[] traceElements = e.getStackTrace();

            for (int i = 0; i < traceElements.length; i++) {

                System.out.print("method " + traceElements[i].getMethodName());
                System.out.print("(" + traceElements[i].getClassName() + ":");
                System.out.println(traceElements[i].getLineNumber() + ")");
//            StackTraceElement[] el = e.getStackTrace();
//            for(int i = 0; i < el.length; i++){
//                System.out.println(el[i]);
            }
        }
        System.out.println("Execution continues......");
    }
}

