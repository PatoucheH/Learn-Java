import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Challenge8 {
    static ArrayList<String[]> dataArray = new ArrayList<>();

    public static ArrayList<String[]> getDataCSVFile () {
        try {
            File myText = new File("visit-hospital.csv");
            Scanner reader = new Scanner(myText);
            if(reader.hasNextLine()) reader.nextLine();
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] line = data.split(",");
                dataArray.add(line);
            }
            reader.close();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        return dataArray;
    }

    public static void getAllFile(){
        getDataCSVFile();
        for(String[] line : dataArray){
            String date = line[0];
            String cardiology =  line[1];
            String radiology =  line[2];
            String visitors =  line[3];
            String neurology =  line[4];
            String pediatrics =  line[5];
            System.out.println(date + " : \n\tCardiology : " + cardiology + "\n\tRadiology : " + radiology +
                    "\n\tVisitors : " + visitors + "\n\tNeurology : " + neurology + "\n\tPediatrics : " + pediatrics );
            System.out.println("-".repeat(50));
        }
    }

    public void getOneInfo(Integer type){
        getDataCSVFile();
        String info = switch (type) {
            case 1 -> "Cardiology";
            case 2 -> "Radiology";
            case 3 -> "Visitors";
            case 4 -> "Neurology";
            case 5 -> "Pediatrics";
            default -> "";
        };
        for (String[] line : dataArray) {
            String date = line[0];
            String numberInfo = line[1];
            System.out.println("Date : " + date);
            System.out.println(info + " : " + numberInfo);
            System.out.println("-".repeat(20));
        }

    }
}
