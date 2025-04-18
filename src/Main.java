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
                System.out.println("Coming soon (maybe) !");
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
                Challenge8Write challenge8Write = new Challenge8Write();
                Scanner readOrWrite = new Scanner(System.in);
                System.out.print(("Choose if you want to write (1) or read (2) the file : "));
                int fileChoice = readOrWrite.nextInt();
                if ( fileChoice == 1){
                    Scanner dateText = new Scanner(System.in);
                    System.out.println("Enter the date (YYYY-MM-DD) :");
                    String dateToAdd = dateText.nextLine();
                    Scanner cardioText = new Scanner(System.in);
                    System.out.println("Enter the number in cardiology :");
                    String cardioToAdd = cardioText.nextLine();
                    Scanner radioText = new Scanner(System.in);
                    System.out.println("Enter the number in radiology :");
                    String radioToAdd = radioText.nextLine();
                    Scanner visitText = new Scanner(System.in);
                    System.out.println("Enter the number of visitors :");
                    String visitToAdd = visitText.nextLine();
                    Scanner neuroText = new Scanner(System.in);
                    System.out.println("Enter the number in neurology :");
                    String neuroToAdd = neuroText.nextLine();
                    Scanner pediaText = new Scanner(System.in);
                    System.out.println("Enter the number in pediatrics :");
                    String pediaToAdd = pediaText.nextLine();
                    String textToAdd = "\n" + dateToAdd + "," + cardioToAdd + "," + radioToAdd + "," + visitToAdd + "," + neuroToAdd + "," +pediaToAdd;
                    challenge8Write.addTextInCSV(textToAdd, "visit-hospital.csv");
                    System.out.println(textToAdd);
                }
                else if (fileChoice == 2) {
                    Scanner scannerChoice = new Scanner(System.in);
                    System.out.println("Choose if you want all the information (1) or choose just one information (2) to display : ");
                    int choice = scannerChoice.nextInt();
                    if (choice == 1) challenge8.getAllFile();
                    else if (choice == 2) {
                        Scanner scannerInfo = new Scanner(System.in);
                        System.out.println("""
                                Choose which info you want to display :\s
                                \tCardiology : 1
                                \tRadiology : 2
                                \tVisitors : 3
                                \tNeurology : 4
                                \tPediatrics : 5""");
                        int informationChoice = scannerInfo.nextInt();
                        switch (informationChoice) {
                            case 1:
                                challenge8.getOneInfoByType(1);
                            case 2:
                                challenge8.getOneInfoByType(2);
                            case 3:
                                challenge8.getOneInfoByType(3);
                            case 4:
                                challenge8.getOneInfoByType(4);
                            case 5:
                                challenge8.getOneInfoByType(5);
                            default:
                                System.out.println("You must choose a number between 1 and 5");
                        }
                    } else {
                        System.out.println("You must choose the number 1 or 2");
                    }
                }
                break;
            case 9:
                Challenge9 challenge9 = new Challenge9();
                Scanner chooseSize = new Scanner(System.in);
                System.out.println("Enter the number of line you want in you file or you want to add : ");
                int fileSize = chooseSize.nextInt();
                challenge9.createOrWriteCSV(fileSize);
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