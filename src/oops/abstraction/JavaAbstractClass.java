package oops.abstraction;

public abstract class JavaAbstractClass {

    // Abstract Class can not be instantiated ie no object can be created

    int num=10;  //initialized
    int num2;    // Not initialized

    public static int numberAdd(int a, int b){
        int sum=a+b;
        return sum;
    }

    // Abstract method
    // Usually there is no method body ie implementation
    public abstract int numberAddition(int a, int b);
    public abstract int numberSubtraction(int a, int b);
    public abstract int numberMultiplication(int a, int b);
    public abstract int numberDivision(int a, int b);



}
