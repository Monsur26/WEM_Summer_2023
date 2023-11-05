package oops.polymorphism;

public class ClassB extends ClassA {

    // method overriding
    @Override
    public void methodA(){
        System.out.println("I am method A in class B");
    }

    @Override
    public void methodB(){
        super.methodB();
    }
}
