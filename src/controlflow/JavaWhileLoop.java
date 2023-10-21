package controlflow;

public class JavaWhileLoop {
    public static void countingNumber(){
        int i=3;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }

    public static void addNumbers(){
        int sum=0;
        int i=0;
        while (i<=10){
            sum=sum+i;
            // sum = previous value of SUM + the value of i in the loop
            i++;
        }
        System.out.println("The value of Sum is : " + sum);
    }

    public static void MultiplySuccessiveNumber(){
        long multipliedNum=1;
        long i=1;
        while(i<=10){
            multipliedNum=multipliedNum*i;
            i++;
        }
        System.out.println("The factorial of the number 10 is " + multipliedNum);
    }

    public static void main(String[] args) {
        //countingNumber();
        addNumbers();
        MultiplySuccessiveNumber();
    }
}
