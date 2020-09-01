package JunitDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    WebDriver driver;

    @Before
    public void beforMyMethod()
    {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net");
    }

    @After
    public void afterMyTest() throws InterruptedException {
        Thread.sleep(3500);
        driver.close();
    }

    @Test
    public void mylogintest()
    {

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        // driver.findElement(By.id("login-username")).sendKeys("admin");

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("admin");


        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }


    @Test
    public void mylogintest1()
    {


        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("ggfgfg");

        // driver.findElement(By.id("login-username")).sendKeys("admin");

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("gfgf");


        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @Test
    public void mylogintest2()
    {


        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        // driver.findElement(By.id("login-username")).sendKeys("admin");

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("");


        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

}
