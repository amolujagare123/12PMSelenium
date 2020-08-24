import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) {
        // 1. open browser
        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // upcasting
        // 2. maximize browser

        driver.manage().window().maximize();

        // 3. open url

        driver.get("http://gmail.com");

        driver.close();


    }

}
