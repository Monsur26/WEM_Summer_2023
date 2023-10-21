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

    public static void daysOfWeek(int dayNum){
        if(dayNum==1){
            System.out.println("Today is Monday");
        } else if (dayNum==2){
            System.out.println("Today is Tuesday");
        }else if (dayNum==3){
            System.out.println("Today is Wednesday");
        }else if (dayNum==4){
            System.out.println("Today is Thursday");
        }else if (dayNum==5){
            System.out.println("Today is Friday");
        }else if (dayNum==6){
            System.out.println("Today is Saturday");
        }else if (dayNum==7){
            System.out.println("Today is Sunday");
        } else {
            System.out.println("Invalid Input");
        }
    }

    public static void monthName(int monthNUm){
        if (monthNUm==1){
            System.out.println("January");
        } else if (monthNUm==2){
            System.out.println("This is February");
        }else if (monthNUm==3){
            System.out.println("This is Marhc");
        }else if (monthNUm==4){
            System.out.println("This is April");
        }else if (monthNUm==5){
            System.out.println("This is May");
        }else if (monthNUm==6){
            System.out.println("This is June");
        }else if (monthNUm==7){
            System.out.println("This is July");
        }else if (monthNUm==8){
            System.out.println("This is August");
        }else if (monthNUm==9){
            System.out.println("This is September");
        }else if (monthNUm==10){
            System.out.println("This is October");
        }else if (monthNUm==11){
            System.out.println("This is November");
        }else if (monthNUm==12){
            System.out.println("This is December");
        } else {
            System.out.println("Invalid Input, Please give a number in between 1 and 12");
        }
    }

    public static void main(String[] args) {
        gradesEarned(100);
        JavaIFElseIF obj1=new JavaIFElseIF();
        obj1.whatsThAage(350);
        daysOfWeek(6);
        monthName(18);

    }
}
