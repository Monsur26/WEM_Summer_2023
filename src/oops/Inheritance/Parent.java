package oops.Inheritance;

public class Parent extends GrandParent{


    // Inherited method uses the same implementation as the parent method
    @Override
    public int Height() {
        return super.Height();
    }

    // Inherited method uses different  implementation as the parent method
    @Override
    public int wealth(){
        int wealth= (a*b)/2;
        System.out.println("Parents wealth is "+ wealth);
        return wealth;
    }

    public void hairColor(){
        System.out.println("Hair color is brown");
    }

    public static void age(){
        System.out.println("Parent age is : 45 years old");
    }


}
