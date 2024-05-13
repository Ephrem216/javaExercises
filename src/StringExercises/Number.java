package StringExercises;

public class Number {
    private String number;
    public Number(String number){
        this.number = number;
    }

    public int toDecimal(){
        int decimal = 0;
        for(int i = number.length() - 1; i >= 0; i--){
            decimal += getNumberEquivalent(String.valueOf(number.charAt(i))) * (int)Math.pow(16, (number.length() - i - 1));
        }
        return decimal;
    }

    public int getNumberEquivalent(String chr){
        switch(chr.toLowerCase()){
            case "a":
                return 10;
            case "b":
                return 11;
            case "c":
                return 12;
            case "d":
                return 13;
            case "e":
                return 14;
            case "f":
                return 15;
            default:
                return Integer.parseInt(chr);
        }
    }
}
