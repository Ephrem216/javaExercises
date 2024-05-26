package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            method1();
        }catch(Exception ex){
            ex.printStackTrace();
        }
//        int n = 1;
//        Scanner input = new Scanner(System.in);
//        do{
//           System.out.print("Enter a number:");
//           String num = input.next();
//           System.out.println("Is your input a number?:"+isNumber(num));
//        }while(n==1);
//        StringBuilder s = new StringBuilder();

//        try {
//            method();
//            System.out.println("After the method call");
//        } catch (RuntimeException ex) {
//            System.out.println("RuntimeException in main");
//        } catch (Exception ex) {
//            System.out.println("Exception in main");
//        }
    }
public static void method1() throws Exception{
       try{
           method2();
       }catch(Exception ex){
           throw new Exception("New exception from method1",ex);
       }
}

public static void method2() throws Exception{
        throw new Exception("New exception from method2");
    }
//    public static boolean isNumber(String string){
//        return string.matches("-?\\d+(\\.\\d+)?");
//        int point = 0;
//        for(int i = 0; i < string.length(); i++){
//            if(!Character.isDigit(string.charAt(i))){
//                if(string.charAt(i) == '.')
//                    point++;
//                else return false;
//            }
//            if(point > 1) return false;
//        }
//        return true;
//    }
//    public void m(int value) throws Exception{
//        if (value < 40)
//            throw new Exception("value is too small");
//    }
//
//    static void method() throws Exception {
//        try {
//            String s = "abc";
//            System.out.println(s.charAt(3));
//        } catch (RuntimeException ex) {
//            System.out.println("RuntimeException in method()");
//            throw ex;
//        } catch (Exception ex) {
//            System.out.println("Exception in method()");
//        }
//        finally{
//            System.out.println("Good Bye!");
//        }
//        System.out.println("hello there....");
//    }

//        try {
//            int[] list = new int[10];
//            System.out.println("list[10] is " + list[10]);
//        }
//        catch(ArrayIndexOutOfBoundsException ex){
//            System.out.println("Index out of bounds Exception");
//        }
//        catch (ArithmeticException ex) {
//            System.out.println("ArithmeticException");
//        }
//        catch (RuntimeException ex) {
//            System.out.println("RuntimeException");
//        }
//        catch (Exception ex) {
//            System.out.println("Exception");
////        }
//        try {
//            method();
//            System.out.println("After the method call");
//        } catch (ArithmeticException ex) {
//            System.out.println("ArithmeticException");
//        } catch (RuntimeException ex) {
//            System.out.println("RuntimeException");
//        } catch (Exception e) {
//            System.out.println("Exception");
//        }
//    }
//
//    static void method() throws Exception {
//        System.out.println(1 / 0);
//    }
}
