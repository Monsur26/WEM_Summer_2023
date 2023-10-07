package demo;

public class JavaMethods {

    // This method is a static-void method without parameters
    public static void sumOfTwoNumbers(){
        int a=5;
        int b=9;
        int sum=a+b;
        System.out.println("This is the sum of two numbers: " + sum);;
    }

    // This method is a static-return type method with parameters
    public static int sumOfTwoDigitsWithParameter(int a, int b){
        int sum= a+b;
        System.out.println("This is the sum of two digits in a parameterized method :"+ sum);
        return sum;
    }

    // This  is a non-static-void type method without parameter
    public void sumOfTwoDoubles(){
        double a= 90.87;
        double b=34.95;
        double sum=a+b;
        System.out.println("This is the sum of two double values :"+ sum);
    }

    // This is a non-static-return type method with parameters
    public double sumOfTwoDoublesWithParameters(double a, double b){
        double sum= a+b;
        System.out.println("This is the sum of two Double Numbers :" + sum);
        return sum;
    }

    public static void main(String[] args) {
        sumOfTwoNumbers();
        sumOfTwoDigitsWithParameter(400,800);

        JavaMethods obj1=new JavaMethods();
        obj1.sumOfTwoDoubles();
        obj1.sumOfTwoDoublesWithParameters(32.9786, 76.7546);
        obj1.sumOfTwoDoublesWithParameters(3.9685, 768.7546);
    }
}
