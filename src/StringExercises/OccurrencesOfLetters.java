package StringExercises;

import java.util.Scanner;

public class OccurrencesOfLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string :");
        String string = input.nextLine();
        int[] count = countLetters(string.toUpperCase());
        System.out.println("The occurrence of each letter in the given string is ");
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println((char)('A' + i) + " occurs " + count[i] + (count[i] > 1 ? " times." : " time."));
            }
        }
    }

    public static int[] countLetters(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++)
            if (Character.isLetter(str.charAt(i)))
                count[str.charAt(i) - 'A']++;
        return count;
    }
}
