package assertDemos;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LinkClickAssertTestNG {
    WebDriver driver;
    @BeforeMethod
    public void doLogin()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net");
        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");
        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @Test
    public  void clickSales()
    {
        WebElement element = driver.findElement(By.linkText("Add Sales"));
        element.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String expected = "Add Sales";

        String actual = "";

        try {
            WebElement adSalesheader = driver.findElement(By.xpath("//div[@class='content-module']//h3"));
            actual = adSalesheader.getText();
            System.out.println("Header="+actual);
        }
        catch (Exception e)
        {
            actual = "";
        }

        Assert.assertEquals(actual,expected.toUpperCase(),"Wrong heaser");
    }
}
