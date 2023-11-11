package unitTesting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Runner{

    @Before
    public void beforeRunningTest(){
        System.out.println("Our Testing has started!!");
    }

    @Test
    public void addingTwoNumbers(){
        MyClass myClass= new MyClass();
        int actual_sum= myClass.addTwoNumbers(4,5);
        int expected_sum= 9;

        Assert.assertEquals("Assert Failed",actual_sum,expected_sum);
    }

    @Test
    public void smallCalculator(){
        MyClass myClass= new MyClass();
        int actual_result= myClass.performOperation(56,46, operator.SUBTRACTION);
        int expected_result=12;

        Assert.assertEquals("Assertion failed", actual_result, expected_result);
    }


    @After
    public void afterTesting(){
        System.out.println("Our Testing has been completed ");
    }
}
