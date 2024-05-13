package StringExercises;


import java.util.Scanner;

public class OccurrencesOfASpecifiedCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string followed by a character :");
        String string = input.next();
        String chr = input.next();
        System.out.println("The occurrence of the specified character in the given string is " + count(string, chr));
    }

    public static int count(String str, String chr){
        int count = 0;
        for(int i = 0;i<str.length(); i++)
            if(str.charAt(i) == chr.toCharArray()[0])
                count++;
        return count;
    }
}