package demo;

import java.util.Random;

public class JavaRandom {
    public static void main(String[] args) {
        Random random= new Random();

        // generating a random number without a range
        int randomInt= random.nextInt();

        // generating a random number within a range
        int randomInt2= random.nextInt(5);

        System.out.println(randomInt);
        System.out.println(randomInt2);

        String nString= "Automation"+ random.nextInt();

        System.out.println(nString);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

    }
}
