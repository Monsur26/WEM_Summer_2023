package demo;

public class DataTypeNumber {
    public static void main(String[] args) {
        int a=5;
        int b=6;

        int c=a+b; //11

        System.out.println(c);

        double x= 3.0;
        x=6.00;
        System.out.println(x); // 6.00
        x=9.3;
        System.out.println(x); //9.3
        double y=4;

        double sum=x+y;
        System.out.println(sum);

        int subs=a-b;
        System.out.println(subs);

        int multiplication=a*b;
        System.out.println(multiplication);

        int division=a/b;
        System.out.println(division);

        int div2nd=b/a;
        System.out.println(div2nd);

        int mod=b%a;
        System.out.println(mod);

        double r=5;
        double t=6;

        double divDouble=r/t;
        System.out.println("This is a division of two double variables: "+divDouble);

        int q=90;
        int p=80;

        System.out.println(q+p); //
    }
}
