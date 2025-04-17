import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a challenge to display (1 --> 10) : ");
        int challengeChoose = scanner.nextInt();

        switch (challengeChoose) {
            case 1:
                Challenge1 challenge1 = new Challenge1();
                challenge1.displayNumbers();
                break;
            case 2:
                Challenge2 challenge2 = new Challenge2();
                challenge2.printAllPrimitifsTypes();
                System.out.println("-".repeat(50));
                challenge2.printinArray();
                break;
            case 3:
                System.out.println("Coming soon !");
                break;
            case 4:
                Scanner scannerArraySize = new Scanner(System.in);
                System.out.println("Choose the size of the array : ");
                int arraySize = scannerArraySize.nextInt();
                Challenge4 challenge4 = new Challenge4();
                challenge4.displayArray(arraySize);
                break;
            case 5:
                Challenge5 challenge5 = new Challenge5();
                challenge5.displayWords();
                System.out.println("-".repeat(50));
                challenge5.displayMostUsesWords();
                break;
            case 6:
                Challenge6 challenge6 = new Challenge6();
                challenge6.displayLetters();
                System.out.println("-".repeat(50));
                challenge6.displayMostUsedLetters();
                break;
            case 7:
                Challenge7 challenge7 = new Challenge7();
                Scanner scannerNumberLine = new Scanner(System.in);
                System.out.println("Choose if you want all the file (1) or just one line (2) : ");
                int numberLine = scannerNumberLine.nextInt();
                int maxNumberLine = challenge7.numberLineCSV();
                if (numberLine == 1) {
                    challenge7.getAllLine();
                }
                else if (numberLine == 2){
                    Scanner numberOfLine = new Scanner(System.in);
                    System.out.println("Choose the line you want to display : ");
                    int line = numberOfLine.nextInt();
                    if(line > maxNumberLine){
                        System.out.println("You enter a number bigger than the number of line.");
                    }
                    else {
                        challenge7.getOneLine(line);
                        System.out.println(maxNumberLine);
                    }
                }
                else {
                    System.out.println("Choose if you want all the file (1) or just one line (2) : ");
                    numberLine = scannerNumberLine.nextInt();
                }
                break;
            case 8:
                System.out.println("Coming soon !");
                break;
            case 9:
                System.out.println("Coming soon !");
                break;
            case 10:
                System.out.println("Coming soon !");
                break;
            default:
                System.out.println("Invalid choice, please enter a number between 1 and 8.");
                break;
        }
        scanner.close();
    }
}