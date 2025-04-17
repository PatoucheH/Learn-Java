import java.util.Random;

public class Challenge4 {
    public static Integer[] generateArrayRandom(int size)
    {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public void displayArray()
    {

        Integer[] randomArray = generateArrayRandom(10);

        for (int i = 0; i < randomArray.length; i++)
        {
            try
            {
                Integer current = randomArray[i];
                Integer precedent = (i == 0) ? current : randomArray[i - 1];
                if (precedent == 0)
                {
                    throw new ArithmeticException("We can't divised by 0");
                }
                double result = (double) current / precedent;
                System.out.println("Index" + i + " : " + current + " / " + precedent + " = "
                + result);

            }catch(ArithmeticException e)
            {
                System.out.println("We can't divised by zero");
            }
        }
    }
}
