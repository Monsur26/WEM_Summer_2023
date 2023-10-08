package controlflow;

public class JavaIFElseIF {
    public static void gradesEarned(int gradeNumber){
        if(gradeNumber >=80 && gradeNumber<=100){
            System.out.println("Grade received is A");
        } else if (gradeNumber >=70 && gradeNumber<=79){
            System.out.println("Grade received is B");
        } else if (gradeNumber >=60 && gradeNumber <=69){
            System.out.println("Grade received is C");
        } else if(gradeNumber >=0 && gradeNumber <=59){
            System.out.println("Grade received is F");
        } else {
            System.out.println("Invalid input, please enter a valid number");
        }
    }

    public  int whatsThAage(int age){
        if(age >=0 && age<=3){
            System.out.println("This is a very small human being");
        } else if (age >=4 && age <= 12){
            System.out.println("This is an enthusiastic child");
        } else if (age >=13 && age <= 17){
            System.out.println("This is a grumpy teenager");
        } else if (age >=18){
            System.out.println("This is a sad adult");
        } else {
            System.out.println("This is not a human age !!!");
        }
            return age;

    }

    public static void main(String[] args) {
        gradesEarned(100);
        JavaIFElseIF obj1=new JavaIFElseIF();
        obj1.whatsThAage(350);

    }
}
