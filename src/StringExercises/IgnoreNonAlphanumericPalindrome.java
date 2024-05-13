package StringExercises;

public class IgnoreNonAlphanumericPalindrome {
    private StringBuilder str;
    public IgnoreNonAlphanumericPalindrome(String str){
        this.str = new StringBuilder(str.toLowerCase());
    }
    public boolean isPalindrome(){
        for(int i = str.length() - 1; i >= 0; i--){
            if(!Character.isLetterOrDigit(str.charAt(i))){
                str.deleteCharAt(i);
            }
        }
        return str.toString().equals(str.reverse().toString());
    }
}
