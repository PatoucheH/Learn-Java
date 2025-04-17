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
                    System.out.println("You must choose the number 1 or 2 ");
                }
                break;
            case 8:
                Challenge8 challenge8 = new Challenge8();
                Scanner scannerChoice = new Scanner(System.in);
                System.out.println("Choose if you want all the information (1) or choose just one information (2) to display : ");
                int choice = scannerChoice.nextInt();
                if(choice == 1) challenge8.getAllFile();
                else if (choice == 2){
                    Scanner scannerInfo = new Scanner(System.in);
                    System.out.println("""
                            Choose which info you want to display :\s
                            \tCardiology : 1
                            \tRadiology : 2
                            \tVisitors : 3
                            \tNeurology : 4
                            \tPediatrics : 5""");
                    int informationChoice =scannerInfo.nextInt();
                    switch(informationChoice){
                        case 1:
                            challenge8.getOneInfo(1);
                        case 2:
                            challenge8.getOneInfo(2);
                        case 3:
                            challenge8.getOneInfo(3);
                        case 4:
                            challenge8.getOneInfo(4);
                        case 5:
                            challenge8.getOneInfo(5);
                        default:
                            System.out.println("You must choose a number between 1 and 5");
                    }
                }else {
                    System.out.println("You must choose the number 1 or 2");
                }
                break;
            case 9:
                System.out.println("Coming soon !");
                break;
            case 10:
                System.out.println("Coming soon !");
                break;
            default:
                System.out.println("Invalid choice, please enter a number between 1 and 10.");
                break;
        }
        scanner.close();
    }
}