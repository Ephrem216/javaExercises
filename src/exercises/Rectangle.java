package exercises;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double [] getSideLengths(){
        return new double[]{width, height};
    }

    public void setSideLengths(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }
}
