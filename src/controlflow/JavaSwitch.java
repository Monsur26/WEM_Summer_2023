package controlflow;

public class JavaSwitch {
    public static void nameOfMonth(int monthNum){

        switch (monthNum){
            case 1:
                System.out.println("This is January");
                break;
            case 2:
                System.out.println("This is February");
                break;
            case 3:
                System.out.println("This is March");
                break;
            case 4:
                System.out.println("This is April");
                break;
            case 5:
                System.out.println("This is May");
                break;
            case 6:
                System.out.println("This is June");
                break;
            case 7:
                System.out.println("This is July");
                break;
            case 8:
                System.out.println("This is August");
                break;
            case 9:
                System.out.println("This is September");
                break;
            case 10:
                System.out.println("This is October");
                break;
            case 11:
                System.out.println("This is November");
                break;
            case 12:
                System.out.println("This is December");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {
        nameOfMonth(0);
    }
}
