package exercises;

public class CheckPalindrome {
    private String str;
    public CheckPalindrome(String str){
        this.str = str;
    }

    public boolean isPalindrome(){
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }
}
