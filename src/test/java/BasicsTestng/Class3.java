package BasicsTestng;

import org.testng.annotations.Test;

public class Class3 {

    @Test(enabled = false)
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
