package StringExercises;

import java.util.Scanner;

public class CheckSubstrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String string1 = input.nextLine();
        System.out.print("Enter the second string:");
        String string2 = input.nextLine();
        System.out.println("Is the first string a substring of the second?:"+isSubstring(string1, string2));

    }

    public static boolean isSubstring(String s1, String s2) {
        return s2.contains(s1);
    }
}