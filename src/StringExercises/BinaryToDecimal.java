package StringExercises;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        String decimal = input.next();
        System.out.println("The binary equivalent is " + decimalToBinary(Integer.parseInt(decimal)));
    }

    public static int toDecimal(String number) {
        int decimal = 0;
//        for(int i = number.length() - 1; i >= 0; i--){
//            decimal += (number.charAt(i) - '0') * (int)Math.pow(2, (number.length() - i - 1));
//        }
        for (int i = 0; i < number.length(); i++)
            decimal = decimal * 2 + (number.charAt(i) - '0');
        return decimal;
    }

    public static String toHexadecimal(String number) {
        int decimal = 0;
//        for(int i = number.length() - 1; i >= 0; i--){
//            decimal += (number.charAt(i) - '0') * (int)Math.pow(2, (number.length() - i - 1));
//        }
        int count = 0;
        String hex = "";
        for (int i = 0; i < number.length(); i++) {
            decimal = decimal * 2 + (number.charAt(i) - '0');
            count++;
            if (count == 4) {
                hex += String.valueOf(getHexChar(decimal));
                decimal = 0;
                count = 0;
            }

        }
        if (count != 0)
            hex += String.valueOf(getHexChar(decimal));
        return hex;
    }

    public static char getHexChar(int num) {
        return switch (num) {
            case 10 -> 'a';
            case 11 -> 'b';
            case 12 -> 'c';
            case 13 -> 'd';
            case 14 -> 'e';
            case 15 -> 'f';
            default -> (char) (num + '0');
        };
    }

    public static String decimalToBinary(int value){
        StringBuilder s = new StringBuilder();
        int remainder = 0;
        while(value > 0){
            remainder = value % 2;
            s.append(remainder);
            value /= 2;
        }
        return s.reverse().toString();
    }
}