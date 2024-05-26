package AbstractClassesAndInterfaces;

import java.util.Date;

public class House implements Cloneable,Comparable<House>{
    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id, double area, Date whenBuilt){
        this.id = id;
        this.area = area;
        this.whenBuilt = whenBuilt;
    }

    public int getId() {
        return id;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(House house){
        return Double.compare(area, house.getArea());
    }

    @Override
    public House clone() throws CloneNotSupportedException {
        House house = (House) super.clone();
        return house;
       // return new House(id,area,whenBuilt);
    }
}
