package Basics2;

import org.testng.annotations.*;

public class Class3 {


    @BeforeGroups
    public void beforeGroup(){
        System.out.println("I am before group");
    }

    @AfterGroups
    public void afterGroup(){
        System.out.println("I am after group");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("I am after suite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }

    @Test(enabled = true)
    public void secondTest(){
        System.out.println("This is second test");
    }

    @Test(enabled = true)
    public void firstTest(){
        System.out.println("This is first test");
    }

    @Test(enabled = true)
    public void thirdTest(){
        System.out.println("This is third test");
    }
}
