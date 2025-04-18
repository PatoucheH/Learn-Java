import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Challenge10Vehicle> vehicles = new ArrayList<>();
        Challenge10Car car = new Challenge10Car();
        Challenge10Truck truck = new Challenge10Truck();
        vehicles.add(car);
        vehicles.add(truck);

        System.out.println("Choose a challenge to display (1 --> 10) (exit to quit the program) : ");
        String challengeChoose = scanner.nextLine();
        while (!(challengeChoose.equals("exit"))) {
            switch (challengeChoose) {
                case "1":
                    Challenge1 challenge1 = new Challenge1();
                    challenge1.displayNumbers();
                    System.out.println("Choose a challenge to display (1 --> 10) (exit to quit the program) : ");
                    challengeChoose = scanner.nextLine();
                    break;
                case "2":
                    Challenge2 challenge2 = new Challenge2();
                    challenge2.printAllPrimitifsTypes();
                    System.out.println("-".repeat(50));
                    challenge2.printinArray();
                    System.out.println("Choose a challenge to display (1 --> 10) (exit to quit the program) : ");
                    challengeChoose = scanner.nextLine();
                    break;
                case "3":
                    System.out.println("Coming soon (maybe) !");
                    System.out.println("Choose a challenge to display (1 --> 10) (exit to quit the program) : ");
                    challengeChoose = scanner.nextLine();
                    break;
                case "4":
                    System.out.println("Choose the size of the array : ");
                    int arraySize = scanner.nextInt();
                    scanner.nextLine();
                    Challenge4 challenge4 = new Challenge4();
                    challenge4.displayArray(arraySize);
                    System.out.println("Choose a challenge to display (1 --> 10) (exit to quit the program) : ");
                    challengeChoose = scanner.nextLine();
                    break;
                case "5":
                    Challenge5 challenge5 = new Challenge5();
                    challenge5.displayWords();
                    System.out.println("-".repeat(50));
                    System.out.println("Choose a challenge to display (1 --> 10) (exit to quit the program) : ");
                    challengeChoose = scanner.nextLine();
                    break;
                case "6":
                    Challenge6 challenge6 = new Challenge6();
                    challenge6.displayLetters();
                    System.out.println("-".repeat(50));
                    challenge6.displayMostUsedLetters();
                    System.out.println("Choose a challenge to display (1 --> 10) (exit to quit the program) : ");
                    challengeChoose = scanner.nextLine();
                    break;
                case "7":
                    Challenge7 challenge7 = new Challenge7();
                    System.out.println("Choose if you want all the file (1) or just one line (2) : ");
                    int numberLine = scanner.nextInt();
                    scanner.nextLine();
                    int maxNumberLine = challenge7.numberLineCSV();
                    if (numberLine == 1) {
                        challenge7.getAllLine();
                    } else if (numberLine == 2) {
                        System.out.println("Choose the line you want to display : ");
                        int line = scanner.nextInt();
                        scanner.nextLine();
                        if (line > maxNumberLine) {
                            System.out.println("You enter a number bigger than the number of line.");
                        } else {
                            challenge7.getOneLine(line);
                            System.out.println(maxNumberLine);
                        }
                    } else {
                        System.out.println("You must choose the number 1 or 2 ");
                    }
                    System.out.println("Choose a challenge to display (1 --> 10) (exit to quit the program) : ");
                    challengeChoose = scanner.nextLine();
                    break;
                case "8":
                    Challenge8 challenge8 = new Challenge8();
                    Challenge8Write challenge8Write = new Challenge8Write();
                    System.out.print(("Choose if you want to write (1) or read (2) the file : "));
                    int fileChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (fileChoice == 1) {
                        System.out.println("Enter the date (YYYY-MM-DD) :");
                        String dateToAdd = scanner.nextLine();
                        System.out.println("Enter the number in cardiology :");
                        String cardioToAdd = scanner.nextLine();
                        System.out.println("Enter the number in radiology :");
                        String radioToAdd = scanner.nextLine();
                        System.out.println("Enter the number of visitors :");
                        String visitToAdd = scanner.nextLine();
                        System.out.println("Enter the number in neurology :");
                        String neuroToAdd = scanner.nextLine();
                        System.out.println("Enter the number in pediatrics :");
                        String pediaToAdd = scanner.nextLine();
                        String textToAdd = "\n" + dateToAdd + "," + cardioToAdd + "," + radioToAdd + "," + visitToAdd +
                                "," + neuroToAdd + "," + pediaToAdd;
                        challenge8Write.addTextInCSV(textToAdd, "visit-hospital.csv");
                        System.out.println(textToAdd);
                    } else if (fileChoice == 2) {
                        System.out.println("Choose if you want all the information (1) or " +
                                "choose just one information (2) to display : ");
                        int choice = scanner.nextInt();
                        scanner.nextLine();
                        if (choice == 1) Challenge8.getAllFile();
                        else if (choice == 2) {
                            System.out.println("""
                                    Choose which info you want to display :\s
                                    \tCardiology : 1
                                    \tRadiology : 2
                                    \tVisitors : 3
                                    \tNeurology : 4
                                    \tPediatrics : 5""");
                            int informationChoice = scanner.nextInt();
                            scanner.nextLine();
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
                    System.out.println("Choose a challenge to display (1 --> 10) (exit to quit the program) : ");
                    challengeChoose = scanner.nextLine();
                    break;
                case "9":
                    System.out.println("Enter the number of line you want in you file or you want to add : ");
                    int fileSize = scanner.nextInt();
                    scanner.nextLine();
                    Challenge9.createOrWriteCSV(fileSize);
                    System.out.println("Choose a challenge to display (1 --> 10) (exit to quit the program) : ");
                    challengeChoose = scanner.nextLine();
                    break;
                case "10":

                    System.out.println("Enter 1 if you want to get the information or 2 " +
                            "if you want to set the name or number of wheels : ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    if(choice == 1) {
                        for (Challenge10Vehicle v : vehicles) {
                            System.out.println("This vehicles " + v.getName() + " has " + v.getNumberOfWheels());
                        }
                    }else if(choice == 2){
                        System.out.println("Enter 'Truck' if you want to modify the truck and 'Car' if you want car ");
                        String choiceModel = scanner.nextLine();
                        if(choiceModel.equalsIgnoreCase("truck")){
                            System.out.println("Enter 'Name' if you want to modify the name and " +
                                    "'Wheels' if you want wheels ");
                            String choiceToSet = scanner.nextLine();
                            if( choiceToSet.equalsIgnoreCase("wheels")){
                                System.out.println("Enter the new number of wheels :");
                                int wheelsNum = scanner.nextInt();
                                scanner.nextLine();
                                truck.setNumberOfWheels(wheelsNum);
                            }else if (choiceToSet.equalsIgnoreCase("name")){
                                System.out.println("Enter the name :");
                                String newName = scanner.nextLine();
                                truck.setName(newName);
                            }

                        }else if (choiceModel.equals("car")){
                            System.out.println("Enter 'Name' if you want to modify the name and " +
                                    "'Wheels' if you want wheels ");
                            String choiceToSet = scanner.nextLine();
                            if( choiceToSet.equalsIgnoreCase("wheels")){
                                System.out.println("Enter the new number of wheels :");
                                int wheelsNum = scanner.nextInt();
                                scanner.nextLine();
                                car.setNumberOfWheels(wheelsNum);
                            }else if (choiceToSet.equals("name")){
                                System.out.println("Enter the name :");
                                String newName = scanner.nextLine();
                                car.setName(newName);
                            }
                        }
                    }else {
                        System.out.println("You must choose number 1 (see infos) or 2 (change infos) !");
                    }
                    System.out.println("Choose a challenge to display (1 --> 10) (exit to quit the program) : ");
                    challengeChoose = scanner.nextLine();
                    break;
                default:
                    System.out.println("Invalid choice, please enter a number between 1 and 10.");
                    System.out.println("Choose a challenge to display (1 --> 10) (exit to quit the program) : ");
                    challengeChoose = scanner.nextLine();
                    break;
            }
        }
            scanner.close();
    }
}