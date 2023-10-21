package controlflow;

public class JavaDoWhileLoop {
    public static void countNumber(){
        int i=4;
        do {
            System.out.println(i);
            i++;
        } while (i<=3);
    }

    public static void main(String[] args) {
        countNumber();
    }
}
