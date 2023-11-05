package oops.Inheritance;

public class GrandParent {

    int a=30000;
    int b=20;

    public GrandParent(){

    }

    public GrandParent(int a){
        this.a= a;
    }

    public GrandParent(int a, int b){
        this.a=a;
        this.b=b;

    }

    public int Height(){
        int height= 6;
        System.out.println("height is "+ height +" feet");
        return height;
    }

    public  int wealth(){
        int wealth= a*b;
        System.out.println("Grandfathers wealth :"+ wealth);
        return wealth;
    }

    public final void myName(){
        System.out.println("This is a private method");
    }

    private void myAge(){

    }

    public static void age(){
        System.out.println("Grandfather age is 70 years ");
    }
}
