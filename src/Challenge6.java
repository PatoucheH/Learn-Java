import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge6 {
    static HashMap<Character, Integer> lettersCount = new HashMap<>();

    public static void addLettersToHash() {
        File myText = new File("fichier-test.txt");

        try {
            Scanner reader = new Scanner(myText);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] lineSplit = line.split("[^\\p{L}]+");
                for (String word : lineSplit) {
                    word = word.toLowerCase();
                    for (char letter : word.toCharArray()) {
                        lettersCount.put(letter, lettersCount.getOrDefault(letter, 0) + 1);
                    }
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void displayLetters() {
        addLettersToHash();
        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }

    public void displayMostUsedLetters() {
        if (lettersCount.isEmpty()) {
            addLettersToHash();
        }
        Character letter = null;
        Integer occurrences = 0;
        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
            if (entry.getValue() > occurrences) {
                occurrences = entry.getValue();
                letter = entry.getKey();
            }
        }
        if (letter != null) {
            System.out.println("The most used letter is: '" + letter + "' with " + occurrences + " occurrences.");
        } else {
            System.out.println("No letters found.");
        }
    }
}
