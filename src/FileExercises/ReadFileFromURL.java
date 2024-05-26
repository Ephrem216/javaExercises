package FileExercises;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a url:");
        String link = input.next();
        try {
            URL url = new URL(link);
            Scanner inputFromURL = new Scanner(url.openStream());
            int count = 0;
            while (inputFromURL.hasNext()) {
                String string = inputFromURL.nextLine();
                count += string.length();
            }
            System.out.println("The file size is " + count + " characters.");
        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //System.out.println("The file size is "+inputFromURL.);
    }
}
