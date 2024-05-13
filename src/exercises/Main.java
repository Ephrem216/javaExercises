package exercises;

public class Main {
    public static void main(String[] args) {
        CheckPalindrome pal = new CheckPalindrome("helolleh");
        System.out.println(pal.isPalindrome());
//        String s1 = " Welcome";
//        String s2 = " welcome";
//        boolean isEqual = s1.equals(s2);
//        isEqual = s1.equalsIgnoreCase(s2);
//        int x = s1.compareTo(s2);
//        x = s1.compareToIgnoreCase(s2);
//        boolean b = s1.startsWith("AAA");
//        b = s1.endsWith("AAA");
//        x = s1.length();
//        char y = s1.charAt(0);
//        String s3 = s1 + s2;
//        String s4 = s1.substring(1);
//        String s5 = s1.substring(1,4);
//        s3 = s1.toLowerCase();
//        s3 = s1.toUpperCase();
//        s3 = s1.trim();
//        String [] tokens = "Welcome to java and HTML".split(" ");
//        x = s1.indexOf("e");
//        x = s1.lastIndexOf("abc");
//        String h = String.valueOf(43.542);
//        System.out.println(h.length());
//        String s1 = "Welcome to Java";
//        String s2 = s1;
//        String s3 = new String("Welcome to Java");
//        String s4 = "Welcome to Java";
//        System.out.println(s1.replace("o J", "AU"));
//        System.out.println(s2 == s3);
//        System.out.println(s1 == s4);
//        String name = "Ephrem ..........";
//        char [] nameChar = name.toCharArray();
//        "... the Syrian...".getChars(3,14,nameChar,6);
//        System.out.println(nameChar);
//        int a[] = new int[]{1, 2, 4, 7, 9};
//        System.out.println(a.toString());
//        String $ = "Hello";
//        System.out.println($);
//        int []list = new int[100000];
//        for(int i = 0; i < list.length; i++)
//            list[i] = (int)(Math.random() * 10000);
//        for(int i = 0; i < list.length; i++)
//            System.out.print(list[i] + "  ");
//        StopWatch watch = new StopWatch();
//        watch.start();
//        for(int i = 0; i < list.length - 1; i ++){
//            int minIndex = i;
//            for(int j = i + 1; j < list.length ; j++){
//                if(list[j] < list[minIndex])
//                    minIndex = j;
//            }
//            if(minIndex != i){
//                int temp = list[i];
//                list[i] = list[minIndex];
//                list[minIndex] = temp;
//            }
//        }
//        watch.stop();
//        for(int i = 0; i < list.length; i++)
//            System.out.print(list[i] + "  ");
//        System.out.println("The time taken by the simple selection sort algorithm to sort an array with 100000 elements is " + watch.getElapsedTime());
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the numbers of rows and columns in the array: ");
//        int row = input.nextInt();
//        int col = input.nextInt();
//        System.out.println("Enter the array elements:");
//        double [][] list = new double[row][col];
//        for(int i = 0; i < row ; i++){
//            for(int j = 0; j < col; j++){
//                list[i][j] = input.nextInt();
//            }
//        }
//
//        Location loc = new Location().locateLargest(list);
//        System.out.printf("The location of the largest element is %.2f at (%d, %d).", loc.getMaxValue(), loc.getRow(), loc.getColumn());

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter end points for the first line segment:");
//        double x1 = input.nextDouble();
//        double y1 = input.nextDouble();
//        double x2 = input.nextDouble();
//        double y2 = input.nextDouble();
//        System.out.print("Enter end points for the second line segment:");
//        double x3 = input.nextDouble();
//        double y3 = input.nextDouble();
//        double x4 = input.nextDouble();
//        double y4 = input.nextDouble();
//        Line line1 = new Line(new Point(x1, y1), new Point(x2, y2));
//        Line line2 = new Line(new Point(x3, y3), new Point(x4, y4));
//        Intersection intersect = new Intersection(line1, line2);
//        Point intersectingPoint = intersect.getIntersectingPoint();
//        System.out.printf("The intersecting point is: (%.2f, %.2f).",intersectingPoint.getX(), intersectingPoint.getY());
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a:");
//        double a = input.nextDouble();
//        System.out.print("Enter b:");
//        double b = input.nextDouble();
//        System.out.print("Enter c:");
//        double c = input.nextDouble();
//        System.out.print("Enter d:");
//        double d = input.nextDouble();
//        System.out.print("Enter e:");
//        double e = input.nextDouble();
//        System.out.print("Enter f:");
//        double f = input.nextDouble();
//        LinearEquation lEq = new LinearEquation(a, b, c, d, e, f);
//        if (lEq.isSolvable()) {
//            System.out.printf("x has a value of %.2f and y has a value of %.2f.", lEq.getX(), lEq.getY());
//        } else {
//            System.out.println("The equation has no real solution.");
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a:");
//        double a = input.nextDouble();
//        System.out.print("Enter b:");
//        double b = input.nextDouble();
//        System.out.print("Enter c:");
//        double c = input.nextDouble();
//        QuadraticEquation qEq = new QuadraticEquation(a, b, c);
//        double discriminant = qEq.getDiscriminant();
//        if (discriminant > 0) {
//            System.out.printf("The equation has two roots of %.2f and %.2f.", qEq.getRoot1(), qEq.getRoot2());
//        } else if (discriminant == 0) {
//            System.out.println("The equation has only one root of " + qEq.getRoot1() + ".");
//        } else {
//            System.out.println("The equation has no real root.");
//        }
//        RegularPolygon polygon1 = new RegularPolygon();
//        RegularPolygon polygon2 = new RegularPolygon(6,4);
//        RegularPolygon polygon3 = new RegularPolygon(10,4,5.6,7.8);
//        System.out.printf("The first polygon has an area of %.2f and a perimeter of %.2f%n",polygon1.getArea(), polygon1.getPerimeter());
//        System.out.printf("The second polygon has an area of %.2f and a perimeter of %.2f%n",polygon2.getArea(), polygon2.getPerimeter());
//        System.out.printf("The third polygon has an area of %.2f and a perimeter of %.2f%n",polygon3.getArea(), polygon3.getPerimeter());
//        Fan fan1 = new Fan();
//        Fan fan2 = new Fan();
//        fan1.setColor("yellow");
//        fan1.setOn(true);
//        fan1.setRadius(10);
//        fan1.setSpeed(3);
//        fan2.setRadius(5);
//        fan2.setSpeed(2);
//        fan2.setOn(false);
//        System.out.println("The first fan:" + fan1.toString());
//        System.out.println("The second fan:" + fan2.toString());
//        Account account = new Account(1122, 20000, 0.045);
//        account.withdraw(2500);
//        account.deposit(3000);
//        System.out.println("The balance is "+account.getBalance());
//        System.out.println("The monthly interest is "+account.getMonthlyInterest());
//        System.out.println("The date the account created is "+account.getDateCreated());
//        PrintCalendar cal = new PrintCalendar(2035, 3);
//        cal.printMonth();
//        cal.showMonth();

//        Stock stock = new Stock("ORCL", "Oracle Corporation");
//        stock.setPreviousClosingPrice(34.5);
//        stock.setCurrentPrice(39.35);
//        System.out.printf("The price-change percentage is %4.2f %1s",stock.getChangePercent(), "%");

//        Rectangle rectangle1 = new Rectangle(4, 40);
//        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
//
//        System.out.println("..........Rectangle 1..........");
//        System.out.println("\tWidth : "+rectangle1.getSideLengths()[0] );
//        System.out.println("\tHeight : "+rectangle1.getSideLengths()[1] );
//        System.out.println("\tArea : "+rectangle1.getArea() );
//        System.out.println("\tPerimeter: "+rectangle1.getPerimeter());
//
//        System.out.println("..........Rectangle 2..........");
//        System.out.println("\tWidth : "+rectangle2.getSideLengths()[0] );
//        System.out.println("\tHeight : "+rectangle2.getSideLengths()[1] );
//        System.out.println("\tArea : "+rectangle2.getArea() );
//        System.out.println("\tPerimeter: "+rectangle2.getPerimeter());
    }
}
