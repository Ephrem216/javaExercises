package StringExercises;

public class MySting1 {
    private char[] chars;

    public MySting1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public String toString(){
        String str = "";
        for(int i = 0; i < chars.length; i++){
            str += chars[i];
        }
        return str;
    }

    public MySting1 substring(int begin, int end) {
        char[] newChars = new char[end - begin];
        for (int i = begin; i < end; i++)
            newChars[i - begin] = chars[i];
        return new MySting1(newChars);
    }

    public MySting1 toLowerCase() {
        char[] newChar = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            newChar[i] = Character.toLowerCase(chars[i]);
        }
        return new MySting1(newChar);
    }

    public boolean equals(MySting1 s) {
        if (length() != s.length())
            return false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.charAt(i))
                return false;
        }
        return true;
    }

    public static MySting1 valueOf(int i) {
        int len = 0, value = 0, number = i;
        while (number > 0) {
            value = number % 10;
            len++;
            number = number / 10;
        }
        char[] newChar = new char[len];
        value = 0;
        number = i;
        int count = 0;
        while (number > 0) {
            value = number % 10;
            newChar[len - 1 - count] = (char) (value + '0');
            count++;
            number = number / 10;
        }

        return new MySting1(newChar);
    }
}
