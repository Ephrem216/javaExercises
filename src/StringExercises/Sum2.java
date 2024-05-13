package StringExercises;

public class Sum2 {
    public static void main(String[] args){
        String list[] = args[0].split(" ");
        System.out.printf("Sum = "+ sum(list));
    }

    public static int sum(String[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += Integer.parseInt(a[i]);
        }
        return sum;
    }
}
