package demo;

import java.util.Scanner;

public class ScannerClassJava {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("What's your name? ");
        String nameOfUser=scanner.nextLine();
        System.out.println("Hello, my name is : "+ nameOfUser);

        System.out.println("what's your age?");
        int ageOfUser=scanner.nextInt();
        System.out.println("My age is "+ ageOfUser);

        scanner.close();
    }
}
