import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class Challenge9 {
    static String[] firstName = {
            "Léo", "Emma", "Noah", "Jade", "Lucas", "Louise", "Hugo", "Alice", "Adam", "Chloé",
            "Nathan", "Lina", "Tom", "Mila", "Enzo", "Léa", "Louis", "Manon", "Gabriel", "Zoé",
            "Ethan", "Camille", "Mathis", "Sarah", "Timo", "Anna", "Axel", "Inès", "Raphaël", "Eva"
    };

    static String[] name = {
            "Martin", "Bernard", "Dubois", "Thomas", "Robert", "Richard", "Petit", "Durand", "Leroy", "Moreau",
            "Simon", "Laurent", "Febrile", "Michel", "Garcia", "David", "Bertrand", "Roux", "Vincent", "Fourier",
            "Morel", "Girard", "Andre", "Leoine", "Francois", "Guerino", "Leclerc", "Blanc", "Fare", "Chevalier",
            "Lambert", "Bonnet", "Dupont", "Benoit", "Marty", "Rolland", "Jacket", "Perrine", "Babier", "Lopez"
    };

    static String[] reason = {
            "Appointment", "visit"
    };

    static String[] department = {
            "Cardiology", "Radiology", "Pediatrics", "Geriatrics", "Pulmonology"
    };

    public static void createOrWriteCSV(int fileSize){
            Challenge8Write textWrite = new Challenge8Write();
        try{
            File myText = new File("test.csv");
            if(myText.createNewFile()){
                textWrite.addTextInCSV("Date,First_name,Name,Reason,Department", "test.csv");
                System.out.println("File created : " + myText.getName());
            }else{
                System.out.println("File already exists ");
            }



            LocalDate currentDate = LocalDate.now();
            StringBuilder text;
            for (int j = 0; j < fileSize; j++) {
            text = new StringBuilder("\n" + currentDate + ",");
                for (int i = 0; i < 4; i++) {
                    int arrayLength;
                    String arrayInfo;
                    int index;
                    switch (i) {
                        case 0:
                            arrayLength = firstName.length;
                            index = (int) (Math.random() * arrayLength);
                            arrayInfo = firstName[index];
                            break;
                        case 1:
                            arrayLength = name.length;
                            index = (int) (Math.random() * arrayLength);
                            arrayInfo = name[index];
                            break;
                        case 2:
                            arrayLength = reason.length;
                            index = (int) (Math.random() * arrayLength);
                            arrayInfo = reason[index];
                            break;
                        case 3:
                            arrayLength = department.length;
                            index = (int) (Math.random() * arrayLength);
                            arrayInfo = department[index];
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + i);
                    }
                    text.append(arrayInfo).append(",");
                    if (arrayInfo.equals("visit")) i = 10;
                }
            textWrite.addTextInCSV(text.toString(), "test.csv");
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
