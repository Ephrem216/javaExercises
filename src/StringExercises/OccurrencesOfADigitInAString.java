package StringExercises;

import java.util.Scanner;

public class OccurrencesOfADigitInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string :");
        String string = input.nextLine();
        int[] count = countDigits(string);
        System.out.println("The occurrence of each digit in the given string is ");
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println(i + " occurs " + count[i] + (count[i] > 1 ? " times." : " time."));
            }
        }
    }

    public static int[] countDigits(String str) {
        int[] count = new int[10];
        for (int i = 0; i < str.length(); i++)
            if (Character.isDigit(str.charAt(i)))
                count[str.charAt(i) - '0']++;
        return count;
    }
}
