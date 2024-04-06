package testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomTestListener.class)
public class SampleTest1 {

    @Test
    public void test1(){
        System.out.println("Executing test1");
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {
        System.out.println("Executing test2");
        Assert.fail("Faling the test2");
    }

    @Test(dependsOnMethods = "test2")
    public void test3() {
        System.out.println("Executing test3");
        Assert.assertTrue(true);
    }
}
