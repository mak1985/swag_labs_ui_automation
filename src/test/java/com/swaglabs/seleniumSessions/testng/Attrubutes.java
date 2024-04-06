package testng;

import org.testng.annotations.Test;

public class Attrubutes {

    @Test(priority = -2)
    public void bannana() {
        System.out.println("test003");
    }

    @Test(priority =-2)
    public void apple() {
        System.out.println("test002");
    }

    @Test(dependsOnMethods = {"apple"})
    public void orange() {
        System.out.println("test001");
    }
}
