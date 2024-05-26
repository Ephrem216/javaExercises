package AbstractClassesAndInterfaces;

import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        GeometricObject x = new Circle(3);
        GeometricObject y = x.clone();
        System.out.println(x == y);
        printGeometricObject(x);
        printGeometricObject(y);
//        ArrayList<String> list = new ArrayList<>();
//        list.add("New York");
//        ArrayList<String> list1 = list;
//        ArrayList<String> list2 = (ArrayList<String>)(list.clone());
//        list.add("Atlanta");
//        System.out.println(list == list1);
//        System.out.println(list == list2);
//        System.out.println("list is " + list);
//        System.out.println("list1 is " + list1);
//        System.out.println("list2.get(0) is " + list2.get(0));
//        System.out.println("list2.size() is " + list2.size());
//        House h1 = new House(1,234.4,new Date());
//        House h2 = h1.clone();
//        System.out.println(h1==h2);
//        System.out.println(h1.compareTo(h2));
//        System.out.println(h1.equals(h2));
//        Rectangle r = new Rectangle(7,4);
//        Date date = new Date();
//        Date date1 = date;
//        Date date2 = (Date)date.clone();
//        System.out.println(date == date1);
//        System.out.println(date == date2);
//        System.out.println(date.equals(date1));
//        System.out.println(date.equals(date2));

//        Integer n1 = new Integer(3);
//        Integer n2 = new Integer(4);
//        System.out.println(n1.compareTo(n2));

//        ComparableRectangle[] rectangles = {
//                new ComparableRectangle(33,56),
//                new ComparableRectangle(5,24),
//                new ComparableRectangle(1,5),
//                new ComparableRectangle(3,67),
//                new ComparableRectangle(23,5)
//        };
//        for(ComparableRectangle rect: rectangles){
//            printGeometricObject(rect);
//        }
//        System.out.println("*******************************************");
//        Arrays.sort(rectangles);
//        for(ComparableRectangle rect: rectangles){
//            printGeometricObject(rect);
//        }
//        GeometricObject circle = new Circle(5);
//        GeometricObject rectangle = new Rectangle(5,7);
//        System.out.println("Do the circle and the rectangle have the same area?"+equalsArea(circle,rectangle));
//        printGeometricObject(circle);
//        printGeometricObject(rectangle);
//        GeometricObject rect1 = new ComparableRectangle(2.3,4.9);
//        GeometricObject rect2 = new ComparableRectangle(3.3,3.4);
//        printGeometricObject(rect1);
//        printGeometricObject(rect2);
//        System.out.println(((ComparableRectangle)rect1).compareTo((ComparableRectangle)rect2));
    }

    public static boolean equalsArea(GeometricObject geoObj1, GeometricObject geoObj2){
        return geoObj1.getArea() == geoObj2.getArea();
    }

    public static void printGeometricObject(GeometricObject geoObj){
        System.out.println("---------------------------");
        System.out.println(geoObj.toString());
        System.out.println("Area:"+geoObj.getArea());
        System.out.println("---------------------------");
    }
}
