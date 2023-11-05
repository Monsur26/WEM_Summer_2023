package oops.polymorphism;

public class Runner {

    public static void main(String[] args) {

        ClassA classA = new ClassA();
        ClassB classB= new ClassB();


        // Runtime polymorphism
        classA.methodA();
        classB.methodA();
    }
}
