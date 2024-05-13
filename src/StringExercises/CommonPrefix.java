package StringExercises;

public class CommonPrefix {
    public static void main(String[] args) {
        String s1 = "precaution";
        String s2 = "prediction";
        System.out.println(prefix(s1, s2));
    }

    public static String prefix(String s1, String s2) {
        String commonPrefix = "";
        for (int i = 0; i < s1.length(); i++) {
            if (i < s2.length()) {
                if (s1.charAt(i) == s2.charAt(i))
                    commonPrefix += String.valueOf(s1.charAt(i));
                else break;
            }
        }
        return commonPrefix;
    }
}
