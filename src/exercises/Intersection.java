package exercises;

public class Intersection {
    private Line line1;
    private Line line2;

    public Intersection(Line line1, Line line2){
        this.line1 = line1;
        this.line2 = line2;
    }

    public Point getIntersectingPoint() {
        Coefficients cof1 = line1.getLineCoefficients();
        Coefficients cof2 = line2.getLineCoefficients();
        LinearEquation eq = new LinearEquation(cof1.a,cof1.b,cof1.c, cof2.a, cof2.b, cof2.c);
        return new Point(eq.getX(), eq.getY());
    }
}

class Point {
    private double x = 0;
    private double y = 0;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
}

class Line {
    private Point point1 = new Point();
    private Point point2 = new Point();

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double getSlope() {
        return (point2.getY() - point1.getY()) / (point2.getX() - point1.getX());
    }

    public Coefficients getLineCoefficients() {
        double a = getSlope();
        double b = -1;
        double c = a * point1.getX() - point1.getY();
        return new Coefficients(a,b,c);
    }
}

class Coefficients {
    double a;
    double b;
    double c;

    Coefficients(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}