package demo;

public class JavaCasting {
    public static void main(String[] args) {

        // This is called an implicit Casting -- smaller to larger data type conversion
        int x=87;
        double y=x;

        int m=67;
        double n= 54.95;

        int sum1=x+m;
        double sum2=y+n;

        // This is called explicit Casting-- larger to smaller data type conversion
        long a=876;
        int b=(int) a ;

        System.out.println("The value as interger "+ x);
        System.out.println("The value as double "+ y);
        System.out.println("The value of sum integer "+ sum1);
        System.out.println("The value of sum double "+ sum2);
    }
}
