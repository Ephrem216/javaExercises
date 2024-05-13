package StringExercises;

public class Palindrome {
    public static void main(String[] args){
        String string = args[0];
        System.out.printf("Is %s palindrome ? %s",args[0],isPalindrome(string));
    }

    public static boolean isPalindrome(String str){
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }
}
