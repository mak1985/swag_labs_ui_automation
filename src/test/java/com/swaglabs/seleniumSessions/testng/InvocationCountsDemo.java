package testng;

import org.testng.annotations.Test;

public class InvocationCountsDemo {

    @Test(invocationCount = 5)
    public void testMethod1(){
        System.out.println("Test method 1");
    }

    @Test
    public void testMethod2(){
        System.out.println("Test method 2");
    }
}
