package demo;

public class SwappingNumbers {
    public static void main(String[] args) {
        int a=5;
        int b=9;

        System.out.println("a value before swap :" +a);
        System.out.println("b value before swap :" +b);

        int temp;

        temp=a; // temp becomes 5 in this case bothe a and temp holds the value of 5
        a=b;    // a become 9, b is also 9
        b=temp; // b become 5, temp is also 5


        System.out.println("a value after swap :" +a);
        System.out.println("b value after swap :" +b);
    }
}
