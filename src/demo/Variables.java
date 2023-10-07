package demo;

public class Variables {
    //Instance Variable

    int number1=5; // instance variable


    static int number2=7; //static variable



    public static void main(String[] args) {

        int number3=6; // Local Variable

        int sum= number3+number2;

        System.out.println("This is the sum of local variable and static variable : "+ sum); //13

        // create an object of the class

//    ClassName  ObjectName= new(keyword) ClassName();
        Variables newVar1=new Variables();
        System.out.println("This is the instance variable value through object creation"+ newVar1.number1);

        sum = number3 + newVar1.number1 + number2;

        System.out.println("This is the sum of three numbers :" +sum);

       final double numPi=3.1416; // final means the variable is fixed, that can not be redefined later on anywhere else

        System.out.println(numPi);

    }
}
