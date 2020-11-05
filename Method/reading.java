package Method;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reading{
    public void scan() throws FileNotFoundException {
        try {
            File file = new File("scenario.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
                System.out.println(scanner.nextLine());
        }catch (Exception e){
            System.out.println("Something went wrong with reading the file");
        }
    }
}