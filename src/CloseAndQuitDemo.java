import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitDemo {

    public static void main(String[] args) throws InterruptedException {



            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.naukri.com/");

            Thread.sleep(2000);

            //driver.close();

        driver.quit();
        }
}
