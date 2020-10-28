package Methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading{
    public static void scan() throws FileNotFoundException {
        try {
            File file = new File("scenario.txt");
            Scanner scanner = new Scanner(file);
        }catch (Exception e){
            System.out.println("Something went wrong with reading the file");
        }
    }
}
