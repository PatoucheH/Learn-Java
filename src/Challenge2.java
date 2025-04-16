public class Challenge2 {
    Integer number2 = 9000;
    Double commaNumber2 = 50.5555;
    Boolean trueOrFalse2 = true;
    Character letter2 = 'H';
    Byte littleNumber2 = -125;
    Short mediumNumber2 = 8055;
    Long longNumber2 = 8000000000000L;
    Float floatNumber2 = 99.99999f;


    public void printAllPrimitifsTypes(){
        System.out.println("Here is an Integer (obj) = " + number2);
        System.out.println("Here is an Double (obj) = " + commaNumber2);
        System.out.println("Here is an Boolean (obj) = " + trueOrFalse2);
        System.out.println("Here is an Character (obj) = " + letter2);
        System.out.println("Here is an Byte (obj) = " + littleNumber2);
        System.out.println("Here is an Short (obj) = " + mediumNumber2);
        System.out.println("Here is an Long (obj) = " + longNumber2);
        System.out.println("Here is an Float (obj) = " + floatNumber2);
    }

    public void printinArray(){
        Object[] allTypes = {
                number2, commaNumber2, trueOrFalse2, letter2, littleNumber2, mediumNumber2,
                longNumber2,floatNumber2
        };
        for (Object var : allTypes){
            System.out.println(var + " : " + var.getClass().getSimpleName());
            System.out.println("-".repeat(10));
        }
    }
}
