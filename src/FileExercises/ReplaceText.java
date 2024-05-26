package FileExercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws IOException {
        String sourceFIleName = args[0];
        String targetFIleName = args[1];
        String oldString = args[2];
        String newString = args[3];
        File sourceFile = new File(sourceFIleName);
        File targetFile = new File(targetFIleName);
        if(!targetFile.exists())
            targetFile.createNewFile();
        try(PrintWriter output = new PrintWriter(targetFile);
            Scanner input = new Scanner(sourceFile)){
            while(input.hasNext()){
                String oldLine = input.nextLine();
                String modifiedLine = oldLine.replaceAll(oldString,newString);
                output.println(modifiedLine);
            }
        }
    }
}
