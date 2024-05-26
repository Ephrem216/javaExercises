package AbstractClassesAndInterfaces;

import java.util.Date;

public abstract class GeometricObject implements Cloneable{
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        this("white", false);
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    public String getColor() {
        return color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor:" + color + " and filled:" + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public GeometricObject clone() throws CloneNotSupportedException {
        return (GeometricObject)super.clone();
    }
}
