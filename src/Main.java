import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a challenge to display (1 --> 5) : ");
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
                System.out.println("Coming soon !");
                break;
            case 7:
                System.out.println("Coming soon !");
                break;
            case 8:
                System.out.println("Coming soon !");
                break;
            default:
                System.out.println("Invalid choice, please enter a number between 1 and 8.");
                break;
        }
        scanner.close();
    }
}