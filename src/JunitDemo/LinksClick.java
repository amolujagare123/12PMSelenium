package JunitDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LinksClick {

    WebDriver driver;
    @Before
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
    public void clickCustomer()
    {
        WebElement element = driver.findElement(By.xpath("//a[contains(@class,'customers-tab')]"));
        element.click();
    }

     @Test
     public  void clickSales()
     {
         WebElement element = driver.findElement(By.className("sales-tab"));
         element.click();
     }

    @Test
    public  void clickSupplier()
    {
        WebElement element = driver.findElement(By.xpath("//a[contains(@class,'supplier-tab')]"));
        element.click();
    }

    @Test
    public  void clickPurchase()
    {
        WebElement element = driver.findElement(By.xpath("//a[@class='purchase-tab']"));
        element.click();
    }

    @After
    public void afterMyTest() throws InterruptedException {
        Thread.sleep(3500);
        driver.close();
    }

}
