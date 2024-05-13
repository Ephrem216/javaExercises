package StringExercises;

public class Calculator {
    public static void main(String[] args){
        String[] tokens = args[0].split(" ");
        double result = calculate(Double.parseDouble(tokens[0]),tokens[1]
                , Double.parseDouble(tokens[2]));
        System.out.printf("%.2f %s %.2f = %.2f",Double.parseDouble(tokens[0]), tokens[1]
                , Double.parseDouble(tokens[2]), result);
    }

    public static double calculate(double num1, String operator, double num2){
        double result = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / (double)num2;
            default -> 0;
        };
        return result;
    }
}
