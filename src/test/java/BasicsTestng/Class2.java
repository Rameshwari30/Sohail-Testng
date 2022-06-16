package BasicsTestng;

import org.testng.annotations.Test;

public class Class2 {

    @Test(priority = 2)
    public void secondTest(){
        System.out.println("This is second test");
    }

    @Test(priority = 1)
    public void firstTest(){
        System.out.println("This is first test");
    }

    @Test(priority = 3)
    public void thirdTest(){
        System.out.println("This is third test");
    }

    @Test(priority = 4)
    public void fourthTest(){
        System.out.println("This is fourth test");
    }

}
