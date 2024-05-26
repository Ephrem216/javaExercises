package FileExercises;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) throws Exception {
//        java.io.PrintWriter output = new
//                java.io.PrintWriter("temp.txt");
//        output.printf("amount is %f %e\r\n",32.32,32.32);
//        output.printf("amount is %5.4f %5.4e\r\n",32.32,32.32);
//        output.printf("%6b\r\n", (1 > 2));
//        output.printf("%6s\r\n", "Java");
//        output.close();
//        Scanner input = new Scanner(System.in);
//        int intValue = input.nextInt();
//        double doubleValue = input.nextDouble();
//        String line = input.nextLine();
        Scanner input = new Scanner(System.in);
        int intValue = input.nextInt();
        double doubleValue = input.nextDouble();
        String line = input.nextLine();
        System.out.println(intValue);
        System.out.println(doubleValue);
        System.out.println(line);
    }
}