import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Challenge5 {
        static HashMap<String, Integer> wordsCount = new HashMap<>();

    public static void addWordsToHash()
    {
        File myText = new File("fichier-test.txt");
        ArrayList<String> words = new ArrayList<>();

        try{
            Scanner reader = new Scanner(myText);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                String[] lineSplit = line.split("[^\\p{L}]+");
                for(String word : lineSplit) words.add(word);
                }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for( String word : words){
            String cleanWord = word.toLowerCase();
            wordsCount.put(cleanWord, wordsCount.getOrDefault(cleanWord, 0) +1 );
        }

    }
    public void displayWords() {
        addWordsToHash();
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }

    public void displayMostUsesWords(){
            String word = "";
            Integer occurences = 0;
        for(Map.Entry<String, Integer> entry : wordsCount.entrySet()){
            if(entry.getValue() > occurences){
                occurences = entry.getValue();
                word = entry.getKey();
            }
        }
        System.out.println("The most used word is :\' " + word + "\' with " + occurences + " occurences.");
    }
}
