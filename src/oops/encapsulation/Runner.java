package oops.encapsulation;

public class Runner {

    public static void main(String[] args) {
        myClass myClass=new myClass();

        // using setter to set the value
        myClass.setMyName("Monsur Ahmed");
        myClass.setMyAGe(25);
        myClass.setMySalary(100.00);

        // using getter to get the value
        System.out.println("My name is : "+ myClass.getMyName() + "My age is "+ myClass.getMyAGe()+ " years old "
                                      + "my salary is : "+ myClass.getMySalary()+ " $ a month"  );

    }
}
