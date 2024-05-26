package exceptions;


public class CircleWithExceptions {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithExceptions() throws InvalidRadiusException{
        this(1.0);
    }

    public CircleWithExceptions(double radius) throws InvalidRadiusException {
        setRadius(radius);
        numberOfObjects++;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius >= 0)
            this.radius = radius;
        else throw new InvalidRadiusException(radius);
    }

    public double getRadius() {
        return radius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}

