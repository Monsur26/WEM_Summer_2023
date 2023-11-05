package controlflow;

public class JavaRecursion {
    public static void countingNumbers(int n){
        if(n>0){
            countingNumbers(n-1);
            System.out.println(n + " ");
        }
    }

    public static long factorial (long num){
        if (num == 0){
            return 1;
        } else {

        } return num * factorial(num-1);
    }

    static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }


    public static void main(String[] args) {
        countingNumbers(5);
        printNumbers(5);

/*        long num= 6;
        long resultSet= factorial(num);

        System.out.println("The factorial of num "+ num + " is : "+ resultSet);*/
    }
}
