package thinkingInObjects;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBMI() {
        return (double) Math.round(weight * 100 / (double) (height * height)) /100;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18) return "underweight";
        else if (bmi > 24) return "overweight";
        else return "normal";
    }
}

