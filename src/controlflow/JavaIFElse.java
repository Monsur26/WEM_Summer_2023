package controlflow;

public class JavaIFElse {
    public static int ageVerification(int age){
        if (age >= 18){
            System.out.println("This person is an adult");
        } else {
            System.out.println("This person is not an adult");
        }
        return age;
    }
    public static void  dayOfTheWeek(String dayNmae){
        if(dayNmae.equalsIgnoreCase("Sunday") || dayNmae.equalsIgnoreCase("Saturday")){
            System.out.println("Today we have class");
        } else {
            System.out.println("No class! :D");
        }

    }

    public static void main(String[] args) {
        int score=60;

        if(score > 60){
            System.out.println("This Student has passed the course because the score is more than or equal to 60");
        } else {
            System.out.println("This Student has Failed the course because the score is less than 60");
        }
        ageVerification(21);
        ageVerification(17);
        dayOfTheWeek("Saturday");

    }
}
