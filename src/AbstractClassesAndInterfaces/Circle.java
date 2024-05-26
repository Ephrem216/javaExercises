package AbstractClassesAndInterfaces;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
     public String toString() {
        return super.toString()+ "\nThe circle has a radius of "+ radius;
    }

    public void printCircle() {
        System.out.println("The circle:" + toString());
        System.out.printf("The circle has a radius of %.2f\n", radius);
    }

    @Override
    public boolean equals(Object circle) {
        if (circle instanceof AbstractClassesAndInterfaces.Circle)
            return radius == ((AbstractClassesAndInterfaces.Circle) circle).radius;
        else return false;
    }
}
