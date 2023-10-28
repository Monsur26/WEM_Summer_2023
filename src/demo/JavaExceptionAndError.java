package demo;

import java.util.Scanner;

public class JavaExceptionAndError  {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input one whole Number");
        int a = scanner.nextInt();
        System.out.println("Input anoone whole Number");
        int b = scanner.nextInt();

        String myName = null;

/*        System.out.println("Division "+ (a/b)); //Execution of Code stops because of Run time error
        System.out.println("Addition "+ (b+a));
        System.out.println("Multiplication "+ (a*b));*/

        try{
            System.out.println("Division "+ (a/b));

        } catch (ArithmeticException arithmeticException){
            System.out.println("Division error happened because  one of the numbers were "+ arithmeticException.getMessage());
        } catch(NullPointerException exception){
            System.out.println("Null Point exception");
        } finally { // this block executes even if some exception happens in try-catch block
            System.out.println("Scanner class  was used for this code!! ");
            scanner.close();
        }
        System.out.println("Addition "+ (b+a));
        System.out.println("Multiplication "+ (a*b));

        try {
            System.out.println(myName.length());
        } catch (NullPointerException exception){
            System.out.println("Null pointer exception"+ exception.getMessage());
        }

    }
}
