package StringExercises;

import java.util.Scanner;

public class CheckSSN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your SSN in the format DDD-DD-DDDD : ");
        String string = input.next();
        System.out.println("Your security number is valid?:" + isValid(string));

    }

    public static boolean isValid(String ssn) {
        return ssn.matches("\\d{3}-\\d{2}-\\d{4}");
    }
}
