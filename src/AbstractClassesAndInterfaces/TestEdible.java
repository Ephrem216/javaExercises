package AbstractClassesAndInterfaces;

public class TestEdible {
    public static void main(String[] args) {
        Object[] object = {new Tiger(), new Chicken(), new Apple(), new Orange(), new Injera()};
        for (int i = 0; i < object.length; i++) {
            if (object[i] instanceof Edible) {
                System.out.println(((Edible) object[i]).howToEat());
            } else {
                System.out.println(((Animal) object[i]).sound());
            }
        }
//        Edible orange = new Orange();
//        System.out.println("How to eat orange:" + orange.howToEat());
//        Animal tiger = new Tiger();
//        System.out.println("Sound of " + tiger.sound());
//        Chicken chicken = new Chicken();
//        System.out.println("How to eat chicken " + chicken.howToEat());
//        System.out.println("Sound of " + chicken.sound());
    }
}

interface Edible {
    String howToEat();
}

//class Something {
//    String howToEat(){
//        return "something";
//    }
//}
//
//abstract class Some extends Something {
//    @Override
//    abstract String howToEat();
//}

interface FastEdible extends Edible {
    String howToEat();
}

class Injera implements FastEdible{
    @Override
    public String howToEat(){
        return "Injera:roast/fry it";
    }
}


abstract class Animal {
    public abstract String sound();
}

class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger: RROOAARR";
    }
}

abstract class Fruit implements Edible {

}

class Chicken extends Animal implements Edible {
    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }

    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple: Make apple cider";
    }
}
