package oops.abstraction;

public class Exercise2 implements JavaInterface, Excercise3{
    @Override
    public double numADD(int a, int b) {
        return 0;
    }

    @Override
    public double numSubs(int a, int b) {
        return 0;
    }

    @Override
    public double numMultiply(int a, int b) {
        double multiplyNum= a*b;
        return multiplyNum;
    }

    @Override
    public double numDivide(int a, int b) {
        double divNum=a/b;
        return divNum;
    }

    public static void main(String[] args) {
        Exercise2 exercise2=new Exercise2();

        double multiplyTwoNum= exercise2.numMultiply(3,4);
        System.out.println("The multiplication of two number is : "+ multiplyTwoNum);

        double divNum = exercise2.numDivide(10,5);
        System.out.println("The division of two number is : "+ divNum);

    }
}
