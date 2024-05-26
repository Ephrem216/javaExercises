package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        boolean continueInput = true;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter an integer number:");
            try {
                int number = input.nextInt();
                continueInput = false;
                System.out.println("The number is "+number);
            } catch (InputMismatchException ex) {
                //ex.printStackTrace();
                System.out.println("An integer is required...try again");
                input.next();
            }
        } while (continueInput);
    }
}
