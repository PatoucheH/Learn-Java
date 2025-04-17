import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Challenge7 {
    static ArrayList<String> arrayLine = new ArrayList<>();
    public static void getCSVLine(){
        File myText = new File("file-test.CSV");
        try{
            Scanner reader = new Scanner(myText);
            while (reader.hasNextLine()){
                String commaLine = reader.nextLine();
                String[] cleanLine = commaLine.split(",");
                arrayLine.add(String.join(" ", cleanLine));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public int numberLineCSV (){
        getCSVLine();
        return arrayLine.size();
    }

    public static void getAllLine(){
        getCSVLine();
        for (int i = 0; i < arrayLine.size(); i++){
            System.out.println(arrayLine.get(i));
        }
    }

    public static void getOneLine(int line){
        System.out.println(arrayLine.get(line));
    }
}
