package StringExercises;

public class CountLetters {
    private String str;

    public CountLetters(String str) {
        this.str = str;
    }

    public int[] count() {
        int[] counts = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char chr = str.toLowerCase().charAt(i);
            //Character c = Character.valueOf(str.toLowerCase().charAt(i));
            if(97 <= chr && chr <= 129){
                counts[chr - 97]++;
            }
        }
        return counts;
    }
}
