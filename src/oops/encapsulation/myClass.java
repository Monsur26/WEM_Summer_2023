package oops.encapsulation;

public class myClass {

    private String myName;
    private int myAGe;
    private double mySalary;


    public void setMyName(String name){
        this.myName= name;
    }

    public String getMyName(){
        return myName;
    }

    public int getMyAGe() {
        return myAGe;
    }

    public void setMyAGe(int myAGe) {
        this.myAGe = myAGe;
    }

    public double getMySalary() {
        return mySalary;
    }

    public void setMySalary(double mySalary) {
        this.mySalary = mySalary;
    }
}
