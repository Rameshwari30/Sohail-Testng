package Basics2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Class5 {

    public static WebDriver driver;

    @Test
    public void openBrowser(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

            SoftAssert soft = new SoftAssert();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            String title = driver.getTitle();
            String expectedTitle = "Human Management Sys";
            //hard assertion
            soft.assertEquals(title, expectedTitle);

            String url = driver.getCurrentUrl();
            String actualUrl = "htt//hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
            soft.assertEquals(url, actualUrl);
            System.out.println("My browser opened");
            driver.quit();
            soft.assertAll();
        }

    @Test
    public void openBrowserAgain(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.quit();
    }
}
