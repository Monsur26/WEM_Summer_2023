package oops.Inheritance;

public class Daughter extends Parent {

    @Override
    public int Height(){
        return super.Height();
    }

    @Override
    public int wealth(){
        int wealth = (a*b)/4;
        System.out.println("Daughters wealth is : "+ wealth);
        return wealth;
    }

    public static void age(){
        System.out.println("Daughter age is 30");
    }
}
