import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumbasicMethods {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://scriptinglogic.com");

       /* System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());*/


        driver.navigate().to("http://gmail.com");

      driver.navigate().back();// - it will act as a back button of your browser
        driver.navigate().forward(); //- it will act as a forward button of your browser
       driver.navigate().refresh(); //- it will act as a refresh button of your browser


    }

}
