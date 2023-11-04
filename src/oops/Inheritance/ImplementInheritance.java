package oops.Inheritance;

public class ImplementInheritance {
    public static void main(String[] args) {
        GrandParent grandParent= new GrandParent();
        Parent parent=new Parent();
        Son son=new Son();
        Daughter daughter=new Daughter();

        // Different object but same implementation on different classes
        System.out.println(grandParent.Height());
        System.out.println(parent.Height());

        // Different object with differnt implementation of same method in different classes
        System.out.println(grandParent.wealth());
        System.out.println(parent.wealth());
        System.out.println(daughter.wealth());


        // solo properties
        GrandParent.age();
        Parent.age();
        Daughter.age();
    }
}
