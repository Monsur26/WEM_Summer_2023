package controlflow;

import java.util.Scanner;

public class JavaNestedIfElse {
    public static void nestedIfElse(int num){
        if (num > 0) {
            System.out.println("This is a positive number");
        } else {
            if (num < 0){
                System.out.println("This is a negative number");
            } else {
                System.out.println("The number is 0");
            }
        }
    }

    public static void greatestAmongThreeNumbers(int a, int b, int c){
        if (a>b && a>c) {
            System.out.println("the biggest number is "+ a);
        } else if (b>a && b>c){
            System.out.println("The biggest number is : "+b);
        } else {
            System.out.println("The biggest number is : "+c);
        }
    }
    public static void smallestAmongThreeNumbers(int a, int b, int c){
        if (a<b && a<c) {
            System.out.println("the smallest number is :"+ a);
        } else if (b<a && b<c){
            System.out.println("The smallest number is : "+b);
        } else {
            System.out.println("The smallest number is : "+c);
        }
    }


    public static void main(String[] args) {
/*        Scanner scanner= new Scanner(System.in);
        System.out.println("Input a number");
        int inputNum= scanner.nextInt();
        nestedIfElse(inputNum);
        scanner.close();*/
        greatestAmongThreeNumbers(23,86,97);
        smallestAmongThreeNumbers(23,86,97);
    }
}
