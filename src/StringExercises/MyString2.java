package StringExercises;

public class MyString2 {
    private String string;

    public MyString2(String string) {
        this.string = string;
    }

    public int compare(String s) {
//        for (int i = 0; i < string.length(); i++) {
//            if (i < s.length()) {
//                if (string.charAt(i) == s.charAt(i))
//                    continue;
//                else
//                    return string.charAt(i) - s.charAt(i);
//            } else return string.charAt(i);
//        }
//        if (s.length() > string.length())
//            return s.charAt(string.length() - 1);
//        return 0;
        return string.compareTo(s);
    }

    public MyString2 substring(int begin){
        return new MyString2(string.substring(begin));
    }

    public MyString2 toUpperCase(){
        return new MyString2(string.toUpperCase());
    }

    public char[] toChars(){
        return string.toCharArray();
    }

    public static MyString2 valueOf(boolean b){
        return new MyString2(String.valueOf(b));
    }
}
