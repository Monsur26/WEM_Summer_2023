package controlflow;

public class JavaForLoop {
    public static void countingToThree(){
        for(int i=0;i<3;i++){
            System.out.println(i);
        }
    }
    public static void countingReverse(){
        for (int i=3;i>0;i--){
            System.out.println(i);
        }
    }
    public static void addingNumbers(){
        int sum=0;
        for (int i = 0; i <=10 ; i++) {
            sum=sum+i;
            //System.out.println("For the value of i is  " +i+ "  The value of Sum is: " + sum);
        }
        System.out.println("The value of sum is : "+ sum);
    }
    public static void addingNumbersDynamic(int desiredNumber){
        int sum=0;
        for (int i = 0; i <=desiredNumber ; i++) {
            sum=sum+i;
            //System.out.println("For the value of i is  " +i+ "  The value of Sum is: " + sum);
        }
        System.out.println("The value of sum is : "+ sum);
    }

    public static void multiplySuccessiveNumbers(){ //factorial of a certain Number
        long multiplicationNumber=1;
        for (long i = 1; i <=10 ; i++) {
            multiplicationNumber=multiplicationNumber*i;
            System.out.println("For the value of i is  " +i+ "  The value of Sum is: " + multiplicationNumber);
        }
      //  System.out.println("The value of sum is : "+ sum);
    }


    public static void main(String[] args) {
       // countingToThree();
       // countingReverse();
       // addingNumbers();
       // addingNumbersDynamic(10000);
        multiplySuccessiveNumbers();
    }
}
