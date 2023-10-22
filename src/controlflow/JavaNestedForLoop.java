package controlflow;

import java.util.Scanner;

public class JavaNestedForLoop {
    public static void nestedLoopOne(){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <=4 ; j++) {
                System.out.println("for parent loop iteration of i = " +i + " the child loop j = "+ j);
            }
        }
    }

    public static void nestedLoopExam(int starNum){
        for (int i = 1; i <=starNum ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void nestedLoopExam2(){
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >=i ; j--) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void nestedLoopExamWithScanner(int starNum){
        for (int i = 1; i <=starNum ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       // nestedLoopOne();
       // nestedLoopExam(10);
       // nestedLoopExam2();
        Scanner sc=new Scanner(System.in);
        System.out.println("input a number to see pattern");
        int whatIsTheNumber= sc.nextInt();
        nestedLoopExamWithScanner(whatIsTheNumber);
        sc.close();
    }
}
