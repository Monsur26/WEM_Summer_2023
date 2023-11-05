package oops.polymorphism;

public class ClassA {
    //method overloading, where multiple methods have the same name but different parameters.

    public ClassA(){

    }
    public ClassA(int a){

    }
    public ClassA(int a, int b){

    }
    public ClassA(int a, int b, int c){

    }
    public ClassA(int a,int b, int c, int d){

    }

    public void methodA(){
        System.out.println("I am method A in class A");
    }
    public void methodB(){
        System.out.println("I am just called method B");
    }
}
