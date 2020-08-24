import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.lifepartner.in/");

        WebElement drpMaritalStatus = driver.findElement(By.name("ms"));

        Select selMartialStatus = new Select(drpMaritalStatus);

        //selMartialStatus.selectByVisibleText("Never married");
        //selMartialStatus.selectByIndex(2);
        selMartialStatus.selectByValue("1");

    }


}
