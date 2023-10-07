package demo;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        // +, -, *, / and % operation

        int a=10;
        int b=5;

        int sum=a+b;
        int subs=a-b;
        int multiplication=a*b;
        int div=a/b;
        int mod=a%b;

        System.out.println(sum);
        System.out.println(subs);
        System.out.println(multiplication);
        System.out.println(div);
        System.out.println(mod);

        //Assignment Operators:
        a=a+1; //11
        b=b-1; //4

        System.out.println(a);
        System.out.println(b);

        a++; //a=11 so when a++ happens the value 11+1=12 post increment
        b--; //b=4 so when b-- happens the value 4-1=3

        System.out.println(a + " and " +b);

        a++; //13
        b--; //2

        System.out.println(a+ " and " +b);

        a=++a; //pre-increment
        System.out.println(a);

        //a=14

        a++; //15
        a--; //14
        a--; //13
        a++; //14
        a++; //15
        ++a; //16
        a++; //17
        System.out.println(a); //17


    }
}
