package demo;

public class Example {
    public static void main(String[] args) {
        Days today= Days.SUNDAY;
        System.out.println("Today is  "+ today );

        if (today == Days.SATURDAY || today == Days.SUNDAY) {
            System.out.println("It's a weekend day");
        } else {
            System.out.println("Today is not a weekend day");
        }

        Months thisMonths=Months.October;

        if (thisMonths == Months.October) {
            System.out.println("This is the Month of :"+ thisMonths);
        } else {
            System.out.println("This is not October");
        }
    }
}
