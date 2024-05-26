package AbstractClassesAndInterfaces;

import java.math.BigDecimal;
import  java.util.Arrays;

public class SortComparableObjects {
    public static void main(String[] args){
        String[] cities = {"Bahir dar", "Addis Ababa","Gondar","Finote Selam", "Lalibela"};
        Arrays.sort(cities);
        BigDecimal[] decimals = {new BigDecimal(3846528734l),new BigDecimal(7432562.7346f),new BigDecimal(4756834)};
        Arrays.sort(decimals);
        for(String city:cities){
            System.out.println(city);
        }
        for(BigDecimal decimal:decimals){
            System.out.println(decimal);
        }
    }
}
