package StringExercises;

public class StringSort {
    private StringBuilder string;

    public StringSort(String string) {
        this.string = new StringBuilder(string);
    }

    public void sort() {
        for (int i = 0; i < string.length(); i++)
            for (int j = i; j < string.length(); j++)
                if (string.charAt(j) < string.charAt(i)) {
                    char temp = string.charAt(i);
                    string.replace(i, i+1,String.valueOf(string.charAt(j)));
                    string.replace(j, j+1,String.valueOf(temp));
                }
    }

    public String getString(){
        return string.toString();
    }

    public boolean isAnagramWith(String str){
        sort();
        StringSort str2 = new StringSort(str);
        str2.sort();
        return string.toString().equals(str2.getString());
    }
}
