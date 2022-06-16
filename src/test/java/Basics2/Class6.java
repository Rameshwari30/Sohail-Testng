package Basics2;

import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class6 extends Class5{

    @DataProvider
    public Object[][] data(){
        Object[][] login = new Object[5][2];
        login[0][0] = "admin";
        login[0][1] = "Hum@nhrm123";
        login[1][0] = "admin";
        login[1][1] = "Hum@nhrm123";
        login[2][0] = "admin";
        login[2][1] = "Hum@nhrm123";
        login[3][0] = "admin";
        login[3][1] = "Hum@nhrm123";
        login[4][0] = "admin";
        login[4][1] = "Hum@nhrm123";

        return login;
    }

    @Test(dataProvider = "data")
    public void adminLogin(String username, String password){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement usernameField = driver.findElement(By.name("txtUsername"));
        WebElement passewordField = driver.findElement(By.id("txtPassword"));
        WebElement loginButton = driver.findElement(By.id("btnLogin"));

        usernameField.sendKeys(username);
        passewordField.sendKeys(password);
        loginButton.click();


    }

}
