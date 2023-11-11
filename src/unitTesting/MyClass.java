package unitTesting;

public class MyClass {

    public int addTwoNumbers(int a, int b){
        int sum= a+b;

        return sum;
    }

    public int performOperation(int opp1, int opp2, operator operator){
        switch (operator){
            case ADDITION:
                return opp1+opp2;
            case SUBTRACTION:
                return opp1 - opp2;
            case MULTIPLICATION:
                return opp1 * opp2;
            case DIVISION:
                return opp1/opp2;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }

    }
}
