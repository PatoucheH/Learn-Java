import java.io.IOException;
import java.io.FileWriter;


public class Challenge8Write {


    public void addTextInCSV(String text, String fileName){
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(text);
            writer.close();
            System.out.println("You wrote on the file ");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
