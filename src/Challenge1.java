public class Challenge1 {

    byte littleNumber = 127;
    short mediumNumber = 32767;
    int number = -1000000000;
    long longNumber = 1000000000L;
    float commaNumber = 9.999999F;
    double morePreciseCommaNumber = 9.999999999999;
    char letter = 'C';
    boolean mmmBoolean = true;

    public void displayNumbers() {
        System.out.println("Here is a little number : " + littleNumber);
        System.out.println("Here is a medium number : " + mediumNumber);
        System.out.println("Here is a number : " + number);
        System.out.println("Here is a long number : " + longNumber);
        System.out.println("Here is a float number : " + commaNumber);
        System.out.println("Here is a double number : " + morePreciseCommaNumber);
        System.out.println("Here is a character : " + letter);
        System.out.println("Here is a boolean : " + mmmBoolean);
    }
    // System.out.print() convertit tout en String pour les display
    // Ce sont les 5 types de bases en Java
    // Parce que double à  des nombres après la virgules int ne les accepete pas
    // Car char est la représentation du code unicode de ce caractères un nombres entiers peut donc être rentré
    // car long peut contenir des nombres bcp plus grand
}
