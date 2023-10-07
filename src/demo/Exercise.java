package demo;

public class Exercise {
    int x=90;
    static int y=100;

    public static void main(String[] args) {
        int p=13;
        int q=50;

        // Add int y and q

        // Divide int x with q

        // Multiply int x, y and p

        int add = y + q;
        System.out.println("This is the addition of number y and q : " + add);

        Exercise ex1= new Exercise();
        int newVar= ex1.x;


        int division=newVar/q;
        System.out.println("This is the division of the number x by q : "+ division);

        int multiplication=newVar*y*p;
        System.out.println("This is the multiplication of number x, y and p : "+ multiplication);

        AccessModifiers accessModifiers=new AccessModifiers();
        int newInt = accessModifiers.c;
    }

}
