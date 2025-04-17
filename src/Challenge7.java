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

    public void getAllLine(){
        getCSVLine();
        for (String s : arrayLine) {
            System.out.println(s);
        }
    }

    public void getOneLine(int line){
        System.out.println(arrayLine.get(line));
    }
}
