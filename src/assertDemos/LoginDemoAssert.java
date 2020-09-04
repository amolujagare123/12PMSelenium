package assertDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoAssert {

    @Test
    public void logintest()
    {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("admin");


        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        String expected = "http://stock.scriptinglogic.net/dashboard.php1";

        String actual = driver.getCurrentUrl();


        Assert.assertEquals("url is not as expected & so the test is failed",expected,actual);


        org.testng.Assert.assertEquals(actual,expected,"message");


        /*if(expected.equals(actual))
            System.out.println("test is passed");
        else
            System.out.println("test is failed");*/

    }
}
