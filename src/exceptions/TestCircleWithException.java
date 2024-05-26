package exceptions;

public class TestCircleWithException {
    public static void main(String[] args){
        try{
            CircleWithExceptions circle1 = new CircleWithExceptions(5);
            CircleWithExceptions circle2 = new CircleWithExceptions();
            CircleWithExceptions circle3 = new CircleWithExceptions(-5);
            CircleWithExceptions circle4 = new CircleWithExceptions(9);
        }catch(InvalidRadiusException ex){
            //ex.printStackTrace();
            System.out.println(ex);
        }
        System.out.println("Number of objects created are "+CircleWithExceptions.getNumberOfObjects());
    }
}
