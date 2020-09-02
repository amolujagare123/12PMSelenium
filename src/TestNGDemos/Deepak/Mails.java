package TestNGDemos.Deepak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mails {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }



    @Test
    public void abc()
    {
        driver.get("https://outlook.live.com/owa/");

    }

    @Test
    public void bc()

    {
        driver.get("https://www.google.com/intl/en-GB/gmail/about/#");

    }

    @Test
    public void c()
    {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}