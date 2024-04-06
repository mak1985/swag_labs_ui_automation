package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterSample {

    @Test
    @Parameters({"i", "j"})
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Test
    @Parameters({"i", "j"})
    public void subtraction(int a, int b) {
        System.out.println(a-b);
    }

    @Test
    @Parameters({"i", "j"})
    public void multiply(int a, int b) {
        System.out.println(a*b);
    }
    @Test
    @Parameters({"i", "j"})
    public void division(int a, int b) {
        System.out.println(a/b);
    }
}
