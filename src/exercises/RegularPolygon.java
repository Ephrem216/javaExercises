package exercises;

public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    RegularPolygon(){
    }

    RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }

    RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getPerimeter(){
        return n * side;
    }

    public double getArea(){
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
