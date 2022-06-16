
package BasicsTestng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Class4 {

    @BeforeGroups
    public void beforeGroup(){
        System.out.println("I am before group");
    }

    @AfterGroups
    public void afterGroup(){
        System.out.println("I am after group");
    }

    @Test(groups = "smoke")
    public void login(){
        System.out.println("This is login scenario");
    }

    @Test(groups = "regression", priority = 1)
    public void verifyDashboard(){
        System.out.println("This is dashboard scenario");
    }
}
