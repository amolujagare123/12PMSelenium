import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverDemo {

    public static void main(String[] args) {

       /* WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://scriptinglogic.com");*/



       /* WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("http://scriptinglogic.com");
        */

        WebDriverManager.iedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("http://scriptinglogic.com");



    }

}
