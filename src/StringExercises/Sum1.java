package StringExercises;

public class Sum1 {
    public static void main(String[] args){
        System.out.printf("Sum = "+ sum(args));
    }

    public static int sum(String[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += Integer.parseInt(a[i]);
        }
        return sum;
    }
}
