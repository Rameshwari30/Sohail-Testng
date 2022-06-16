package testcases;

import org.testng.annotations.Test;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginTest extends CommonMethods {

    @Test(groups = "smoke")
    public void loginTest(){
        openBrowserAndLaunchApplication();
        sendText(loginPage.usernameTextField, ConfigReader.getPropertyValue("username"));
        sendText(loginPage.passwordTextField, ConfigReader.getPropertyValue("password"));
        click(loginPage.loginButton);
    }
}
