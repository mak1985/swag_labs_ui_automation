package testng;

import org.testng.annotations.*;

public class TestCases {

    @BeforeTest
    public void before_test(){
        System.out.println("@BeforeTest");
    }
    @BeforeClass
    public void before_class(){
        System.out.println("@BeforeClass");
    }
    @Test(description = "test001 is regression")
    public void test001(){
        System.out.println("test001");
    }
    //regression

    @Test()
    public void test003(){
        System.out.println("test003");
    }
    @Test(description = "test002 is sanity")
    public void test002(){
        System.out.println("test002");
    }
    //sanity
    @BeforeMethod
    public void before_method(){
        System.out.println("@BeforeMethod");
    }
    @AfterSuite
    public void after_suite(){
        System.out.println("@AfterSuite");
    }
    @AfterTest
    public void after_test(){
        System.out.println("@AfterTest");
    }


    @AfterClass
    public void after_class(){
        System.out.println("@AfterClass");
    }
    @AfterMethod
    public void after_method(){
        System.out.println("@AfterMethod");
    }
    @BeforeSuite
    public void before_suite(){
        System.out.println("@BeforeSuite....");
    }
}
