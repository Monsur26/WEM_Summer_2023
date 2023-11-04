package oops.abstraction;

public class Exercise extends JavaAbstractClass {


    @Override
    public int numberAddition(int a, int b) {
        int sum= a+b;
        return sum;
    }

    @Override
    public int numberSubtraction(int a, int b) {
        int subtraction=a-b;
        return subtraction;
    }

    @Override
    public int numberMultiplication(int a, int b) {
        return 0;
    }

    @Override
    public int numberDivision(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        Exercise exercise=new Exercise();
        int sumResult= exercise.numberAddition(3,4);
        System.out.println("Addition of desired number is : "+ sumResult);

        int subtractionResult= exercise.numberSubtraction(5,4);
        System.out.println("Subtraction of desired number is : "+ subtractionResult);
    }

}
