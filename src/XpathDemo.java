import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class XpathDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net");


        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        // driver.findElement(By.id("login-username")).sendKeys("admin");

        WebElement txtpassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtpassword.sendKeys("admin");


        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

        //Thread.sleep(20000);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

      //  WebElement lnkAddCutomer = driver.findElement(By.xpath("//a[@href='add_customer.php']"));

      //  WebElement lnkAddCutomer = driver.findElement(By.xpath("//a[text()='Add Customer']"));


        WebElement lnkAddCutomer = driver.findElement(By.xpath("//a[contains(text(),'Add C')]"));


        lnkAddCutomer.click();


        WebElement txtName = driver.findElement(By.xpath("//input[@id='name']"));
        txtName.sendKeys("abhishek");

        WebElement txtAddress = driver.findElement(By.xpath("//*[@placeholder='ENTER YOUR ADDRESS']"));
        txtAddress.sendKeys("swargate,pune");

        WebElement txtContact1 = driver.findElement(By.xpath("//input[@name='contact1']"));
        txtContact1.sendKeys("78787878");

        WebElement txtContact2 = driver.findElement(By.xpath("//input[@name='contact2']"));
        txtContact2.sendKeys("78787878");

        WebElement btnAdd = driver.findElement(By.xpath("//input[@value='Add']"));
        btnAdd.click();


    }

}
