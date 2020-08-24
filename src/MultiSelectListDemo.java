import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("file:///C:/Users/PC/Desktop/Mywebsite/930pmbatch.html");

        WebElement listSubject = driver.findElement(By.id("subjectMultiList"));

        Select selListSubject = new Select(listSubject);

        selListSubject.selectByVisibleText("Java");

        Thread.sleep(2000);

        selListSubject.selectByVisibleText("c++");

        Thread.sleep(2000);

        selListSubject.selectByVisibleText(".Net");

        Thread.sleep(2000);
        selListSubject.deselectByVisibleText("Java");

        Thread.sleep(2000);

        selListSubject.deselectAll();


    }
}
