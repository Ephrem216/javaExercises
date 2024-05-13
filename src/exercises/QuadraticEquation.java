package exercises;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    
    public double getDiscriminant(){
        return Math.sqrt(Math.pow(b,2) - 4 * a * c);
    }

    public double getRoot1(){
        return getDiscriminant() >= 0 ? (-1 * b + getDiscriminant()) / (2 * a): 0;
    }

    public double getRoot2(){
        return getDiscriminant() >= 0 ? (-1 * b - getDiscriminant()) / (2 * a): 0;
    }
}
