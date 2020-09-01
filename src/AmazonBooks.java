import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBooks {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/s?k=amarendra+chitale&ref=nb_sb_noss_2");

//        driver.findElement(By.xpath("//img[contains(@alt,'NLP:')]")).click();

        driver.findElement(By.cssSelector("img[alt*='NLP:']")).click();

    }
    }
