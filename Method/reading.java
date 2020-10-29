package Method;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reading{
    public static void scan() throws FileNotFoundException {
        try {
            File file = new File("test.txt");
            Scanner scanner = new Scanner(file);
        }catch (Exception e){
            System.out.println("Something went wrong with reading the file");
        }
    }
}