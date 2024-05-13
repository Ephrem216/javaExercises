package StringExercises;

import java.util.Scanner;

public class PhoneKeypads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string :");
        String keypad = input.nextLine();
        System.out.println(convert(keypad));
    }

    public static String convert(String str) {
        StringBuilder string = new StringBuilder(str.toUpperCase());
        for(int i = 0; i < string.length(); i++)
            if(Character.isLetter(string.charAt(i)))
                string.replace(i,i+1,String.valueOf(getNumber(String.valueOf(string.charAt(i)))));
        return string.toString();
    }

    public static int getNumber(String c) {
        if(" ".contains(c))
            return 1;
        else if("ABC".contains(c))
            return 2;
        else if("DEF".contains(c))
            return 3;
        if("GHI".contains(c))
            return 4;
        if("JKL".contains(c))
            return 5;
        if("MNO".contains(c))
            return 6;
        if("PQRS".contains(c))
            return 7;
        if("TUV".contains(c))
            return 8;
        if("WXYZ".contains(c))
            return 9;
        else
            return 0;
    }
}
