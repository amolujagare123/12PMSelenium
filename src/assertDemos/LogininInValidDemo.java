package assertDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LogininInValidDemo {
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


        String expected = "Wrong Username or Password";

        String actual = "";

        try {

            WebElement errorMessage = driver.findElement(By.xpath("//div[contains(@class,'error-box round')]"));
            actual = errorMessage.getText(); // getText() - it gives text inside the webelement
            System.out.println("Error MSg:"+actual);
        }
        catch (Exception e)
        {
            actual = "";
        }

        Assert.assertEquals("incorrect error msg or error message is absent",expected,actual);



    }
}
