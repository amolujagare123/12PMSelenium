import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Multiselectdemo {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

        Actions action = new Actions(driver);

        action.keyDown(Keys.CONTROL).build().perform();

      /*  WebElement drodwn = driver.findElement(By.id("multi-select"));
        Select sel = new Select(drodwn);
        sel.selectByVisibleText("New Jersey");
        sel.selectByVisibleText("California");*/



       /* driver.findElement(By.xpath("//option[text()='New Jersey']")).click();
        driver.findElement(By.xpath("//option[text()='California']")).click();
*/
       // Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       WebElement printAll = driver.findElement(By.id("printAll"));

       //printAll.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",printAll);


        driver.findElement(By.xpath("//option[text()='New Jersey']")).click();
        driver.findElement(By.xpath("//option[text()='California']")).click();

        js.executeScript("arguments[0].click()",printAll);



    }
}
