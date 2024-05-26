package FileExercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner("32 87");
        System.out.println(read.nextInt() + read.nextInt());
//        Scanner input = new Scanner(System.in);
//        int x = input.nextInt();
//        String y = input.nextLine();
//        System.out.println("x=" + x + "\ny=" + y);
//        File file = new File("src/FileExercises/scores.txt");
//        try (Scanner readFromFile = new Scanner(file);) {
//            while (readFromFile.hasNext()) {
//                String string = readFromFile.next();
//                if (!string.startsWith("---")) {
//                    String name = string;
//                    String mn = readFromFile.next();
//                    String lname = readFromFile.next();
//                    String score = readFromFile.next();
//                    System.out.printf("%10s%10s%10s%10s\n", name, mn, lname, score);
//                } else System.out.println(string);
//            }
//        }
//
//        System.out.println("......"+System.lineSeparator()+"....");
//        File file = new File("src/FileExercises/scores.txt");
//        try {
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            PrintWriter output = new PrintWriter(file);
//            output.println(String.format("%-10s%-10s%-10s%-10s", "Name", "MN", "LastN.", "Score"));
//            output.close(); // Close the PrintWriter after writing
//        } catch (IOException e) {
//            e.printStackTrace(); // Handle any potential IO exceptions
//        }
//        File file = new File("src/FileExercises/scores.txt");
//        if (!file.exists()) {
//            file.createNewFile();
//        }
//        try (PrintWriter output = new PrintWriter(file);
//        PrintWriter c = new PrintWriter(file);) {
//            String n = "How Does Scanner Work?\n" +
//                    " The nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), next\n" +
//                    "Double(), and next() methods are known as token-reading methods, because they read \n" +
//                    "tokens separated by delimiters. By default, the delimiters are whitespace characters. You \n" +
//                    "can use the useDelimiter(String regex) method to set a new pattern for delimiters.\n" +
//                    " How does an input method work? A token-reading method first skips any delimiters (whites\n" +
//                    "pace characters by default), then reads a token ending at a delimiter. The token is then auto\n" +
//                    "matically converted into a value of the byte,short,int,long,float, or double type for \n" +
//                    "nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), and nextDou\n" +
//                    "ble(), respectively. For the next() method, no conversion is performed. If the token does \n" +
//                    "not match the expected type, a runtime exception java.util.InputMismatchException\n" +
//                    " will be thrown. \n" +
//                    "Both methods next() and nextLine() read a string. The next() method reads a string \n" +
//                    "delimited by delimiters, and nextLine() reads a line ending with a line separator.";
//            output.print(n);
//            output.println(String.format("%-10s%-10s%-10s%-10s", "Name", "MN", "LastN.", "Score"));
//            output.println(String.format("%-10s%-10s%-10s%-10s", "----------", "----------", "----------", "----------"));
//            output.println(String.format("%-10s%-10s%-10s%-10s", "Ephrem", "K.", "Atnaf", "94"));
//            output.println(String.format("%-10s%-10s%-10s%-10s", "Donald", "J.", "Trump", "88"));
//            output.println(String.format("%-10s%-10s%-10s%-10s", "Emanuel", "J.", "Macron", "74"));
//            output.println(String.format("%-10s%-10s%-10s%-10s", "Bruce", "M.", "Wayne", "77"));
//        }
//        File file1 = new File("Folder1");
//        File file2 = new File("C:\\Users\\HP\\IdeaProjects\\television2\\src\\FileExercises");
//        File file3 = new File("C:\\Users\\HP\\IdeaProjects\\television2\\src\\FileExercises","Folder3");
//        File file4 = new File(file1,"Folder4");
//        System.out.println(file2.exists());
//        System.out.println(file2.isFile());
//        System.out.println(file2.isDirectory());
//        System.out.println(file2.isAbsolute());
//        System.out.println(file2.isHidden());
//        System.out.println(file2.getAbsoluteFile());
//        System.out.println(file2.getAbsolutePath());
//        System.out.println(file1);
//        String absolutePath = file1.getAbsolutePath();
//        File absoluteFile = file1.getAbsoluteFile();
//        System.out.println(absolutePath);
//        System.out.println(absoluteFile);
//        System.out.println(file2.getCanonicalPath());
//        System.out.println(file2.getName());
//        System.out.println(file1.getAbsolutePath());
//        System.out.println(file1.getPath());
//        System.out.println(new File("IdeaProjects\\FileExercises").getPath());
//        System.out.println(new File("IdeaProjects\\FileExercises").getAbsolutePath());
//        System.out.println(new File("IdeaProjects\\FileExercises").getParent());
//        System.out.println(file4.getParent());
//        System.out.println(new Date(file2.lastModified()));
//        System.out.println(file2.length());
//        File file5 = new File("C:\\Users\\HP\\IdeaProjects\\television2\\src");
//        File[] listDirectory = file5.listFiles();
//        for(int i = 0; i < listDirectory.length; i++)
//            System.out.println(listDirectory[i]);
//        System.out.println(file1.delete());
//        File file6 = new File("C:\\Users\\HP\\IdeaProjects\\television2\\src\\FileExercises\\a");
//        File file7 = new File("C:\\Users\\HP\\IdeaProjects\\television2\\src\\FileExercises\\new file");
//        System.out.println(file6.exists());
//        System.out.println(file6.delete());
//        File file8 = new File("C:\\Users\\HP\\IdeaProjects\\television2\\src\\FileExercises\\Folder8");
//        System.out.println(file6.createNewFile());
//        System.out.println(file6.mkdir());
//        System.out.println(file6.renameTo(file7));
//        System.out.println(file8.mkdir());
//        System.out.println(file8.createNewFile());
//        File file9 = new File("C:\\Users\\HP\\IdeaProjects\\television2\\src\\FileExercises\\Folder10");
//        System.out.println(file9.mkdirs());
//        System.out.println(file7.canExecute());
//        System.out.println(file7.canRead());
//        System.out.println(file7.canWrite());
//        System.out.println(file8.mkdir());
//        System.out.println(file1.mkdir());
//        File f1 = new File("img1.gif");
//        File f2 = new File("img2.png");
//        File f3 = new File("images/img3.jpeg");
//        File f4 = new File("images/img4.jpg");
//        //System.out.println(new File("images").mkdir());
//        System.out.println(f4.createNewFile());

    }
}

