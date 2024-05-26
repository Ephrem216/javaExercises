package InheritanceAndPolymorphism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.remove(3);
//        System.out.println(list);
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Alfred");
//        names.add("Peter");
//        names.add("Ephrem");
//        names.add("Alfred");
//        names.add("Bruce");
//        names.add("Peter");
//        names.add("Ephrem");
//        names.add("Peter");
//        names.add("Ephrem");
//        names.add("Bruce");
//        names.add("Bane");
//        names.add("Bane");
//        System.out.println(names);
//
//        HashSet<String> set = new HashSet<>(names);
//        names.clear();
//        names.addAll(set);

//        for(int i = 0; i < names.size(); i++){
//            for(int j = i + 1; j < names.size(); j++){
//                if(names.get(j).equals(names.get(i))){
//                    names.remove(j);
//                    j--;
//                }
//            }
//        }
//        for(int i = 0; i < names.size(); i++){
//            if(names.get(i).equals("Ephrem"))
//                names.remove(i);
//        }
//        System.out.println(names);
//        ArrayList<Circle> list = new ArrayList<>();
//        list.add(new Circle(5));
//        list.add(new Circle());
//        System.out.println(list.get(0).getDiameter());
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Ephrem");
//        list.add("Bruce");
//        list.add("Norris");
//        System.out.println(list);
//        Object circle1 = new Circle1();
//        Object circle2 = new Circle1();
//        System.out.println(circle1.equals(circle2));
//        int age = 22;
//        byte a = (byte) age;
//        GeometricObject g = new Circle();
//        System.out.println(g.toString());
//        GeometricObject g2 = new GeometricObject();
//        GeometricObject g3 = g;
//        Circle c = (Circle) g;
//        if (g instanceof Circle) {
//            System.out.println(((Circle) g).getDiameter());
//        }
//        System.out.println(c);
    }
}

class Circle1 {
    double radius;

    public boolean equals(Circle1 circle) {
        return this.radius == circle.radius;
    }
}

class Circle2 {
    double radius;

    public boolean equals(Object circle) {
        return this.radius ==
                ((Circle2) circle).radius;
    }
}

class A extends B {

    public A(int t) {
        System.out.println("A's constructor is invoked");
    }
}

class B {

    public B() {
        System.out.println("B's constructor is invoked");
    }
}
