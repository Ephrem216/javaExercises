package StringExercises;

public class CountUppercase {
    public static void main(String[] args) {
        System.out.printf("Number of uppercase characters in %s is %d", args[0], count(args[0]));
    }

    public static int count(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i)))
                count++;
        }
        return count;
    }
}
