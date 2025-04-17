import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a challenge to display (1 --> 4) : ");
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
                Challenge4 challenge4 = new Challenge4();
                challenge4.displayArray();
                break;
            case 5:
                System.out.println("Coming soon !");
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
                System.out.println("Choix invalide. Veuillez entrer 1 ou 2.");
                break;
        }
        scanner.close();
    }
}