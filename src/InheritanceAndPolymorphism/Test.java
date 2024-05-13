package InheritanceAndPolymorphism;

public class Test {
    public static void main(String[] args) {
        
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
