import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class Challenge8Write {
    public static void main(String[] args){
        try {

            FileWriter writer = new FileWriter("visit-hospital.csv", true);
            writer.write("HHH");
            writer.close();
            System.out.println("You wrote on the file ");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
