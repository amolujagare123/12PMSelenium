package TestNGDemos.Deepak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SocialNetworks {

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    WebDriver driver;

    @Test
    public void abc()
    {
        driver.get("https://www.facebook.com/");


    }

    @Test
    public void bc()
    {
        driver.get("https://twitter.com/?lang=en");
    }

    @Test
    public void c()
    {
        driver.get("https://in.linkedin.com/");

    }

    @AfterMethod
    public void tearDown()
    {

        driver.quit();

    }
}