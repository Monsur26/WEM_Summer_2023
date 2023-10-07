package demo;

public class JavaConstructor {
    int a;
    int b;

    public JavaConstructor(int a , int b){
        this.a=a;
        this.b=b;
        System.out.println("This is  my  student_ID: " + this.a + "And my Access Code :"+ this.b);
    }

    // If defined then this is a no-args Constructor
    // If not defined then this is the structure of a  default Constructor
    public JavaConstructor(){
        System.out.println("This is my PNT Class");
    }

    public static void main(String[] args) {
        JavaConstructor obj1= new JavaConstructor();
        JavaConstructor obj2=new JavaConstructor(01, 2565876);
    }
}
