package AbstractClassesAndInterfaces;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
    public ComparableRectangle() {
    }

    public ComparableRectangle(double width, double height) {
        super(width,height);
    }

    public int compareTo(ComparableRectangle rectangle) {
//        double result = getArea() - ((Rectangle) rectangle).getArea();
//        if (result > 0) return 1;
//        else if (result == 0) return 0;
//        return -1;
        return Double.compare(getArea() , ((Rectangle) rectangle).getArea());
    }
}
