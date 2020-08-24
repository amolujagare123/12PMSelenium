import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheboxRadioDemo {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/PC/Desktop/Mywebsite/amol.html");


        WebElement  checkJava = driver.findElement(By.id("check0"));
        checkJava.click();

        WebElement checkSelenium = driver.findElement(By.id("check1"));

        WebElement checkCucumber = driver.findElement(By.id("check2"));
        checkCucumber.click();


        WebElement radSelenium = driver.findElement(By.id("rad1"));
        radSelenium.click();


        Thread.sleep(2000);

        if(!checkJava.isSelected())
            checkJava.click();

        if (!checkCucumber.isSelected())
             checkCucumber.click();

        if (!checkSelenium.isSelected())
            checkSelenium.click();




    }

}
