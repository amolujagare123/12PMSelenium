import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BillingDemo {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://billing.scriptinglogic.net");


        WebElement txtUsername = driver.findElement(By.id("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        // driver.findElement(By.id("login-username")).sendKeys("admin");

        WebElement txtpassword = driver.findElement(By.id("password"));
        txtpassword.sendKeys("admin123");


        WebElement btnLogin = driver.findElement(By.name("btn_login"));
        btnLogin.click();

        driver.findElement(By.xpath("//span[text()='Clients']")).click();
        driver.findElement(By.xpath("//a[text()='View Clients']")).click();

        driver.findElement(By.xpath("//tr[td/a[text()='A1QW Pvt Ltd']]//div")).click();

       driver.findElement(By.xpath("//tr[td/a[text()='A1QW Pvt Ltd']]//li[2]")).click();



        //driver.findElement(By.xpath("//tr[td/a[text()='A1QW Pvt Ltd']]//i[contains(@class,'edit')]")).click();


    }
}
