package BasicsTestng;

import org.testng.annotations.*;

public class Class1 {

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
    @Test
    public void secondTest(){
        System.out.println("This is my second test");
    }

    @Test(groups = "smoke1")
    public void firstTest(){
        System.out.println("This is my first test");
    }

    @Test
    public void anotherTest(){
        System.out.println("This is another test");
    }


}
