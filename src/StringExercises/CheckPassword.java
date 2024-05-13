package StringExercises;

import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password:");
        String string = input.next();
        System.out.println("Is your password valid?:" + isValid(string));

    }

    public static boolean isValid(String password) {
        if (password.length() < 8) return false;
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i)))
                return false;
            else if (Character.isDigit(password.charAt(i)))
                count++;
        }
        return count >= 2;
    }
}