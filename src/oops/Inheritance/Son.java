package oops.Inheritance;

public class Son extends Parent{
    @Override
    public int Height(){
        return super.Height();
    }

    @Override
    public void hairColor(){
        System.out.println("Hair color is Black");
    }

    public static void age(){
        System.out.println("Sons age is 25");
    }
}
