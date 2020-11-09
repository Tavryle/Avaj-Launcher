package Method;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {
    public static void writeToFile(String message){
        try {
            FileWriter fileWriter = new FileWriter("simulation.txt", true);
            fileWriter.write(message);
            fileWriter.write("\n");
            fileWriter.close();

        }catch (IOException e){
            System.out.println("something went wrong processing the file");
        }
    }
    public static void createNewFile(){
        try{
            File file = new File("simulation.txt");
            file.delete();
            if (file.createNewFile()){
                System.out.println("file created");
            }
        }catch (IOException e){
            System.out.println("failed to create file");
        }
    }
}
