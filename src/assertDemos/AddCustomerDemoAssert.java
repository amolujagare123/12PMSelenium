package assertDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddCustomerDemoAssert {

    @Test
    public void addcustomerTest()
    {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net");


        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        // driver.findElement(By.id("login-username")).sendKeys("admin");

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("admin");


        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement lnkAddCutomer = driver.findElement(By.linkText("Add Customer"));
        lnkAddCutomer.click();


        WebElement btnAdd = driver.findElement(By.name("Submit"));
        btnAdd.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String expected = "PLEASE ENTER A CUSTOMER NAME";
        String actual ="";

        try {
            WebElement errorLabel = driver.findElement(By.xpath("//label[@class='error']"));
            actual = errorLabel.getText();
            System.out.println(actual);
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected,"invalid or no error message");
    }

}
