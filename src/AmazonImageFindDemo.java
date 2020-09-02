import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class AmazonImageFindDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        WebElement searchtext = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        searchtext.sendKeys("amarendra chitale");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@value='Go']")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//img[contains(@alt, 'NLP:')]")).click();

        driver.findElement(By.xpath("//img[contains(@alt, 'Being')]")).click();

        // here 2 books opens in separate tabs

        // driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/span/a/div/img")).click();


        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        // switching to 2nd tab (tab with index 1)
        driver.switchTo().window(tabs.get(1));
        //click on NLP book
        driver.findElement(By.xpath("//*[@id='ebooksImgBlkFront']")).click();

        // switching to 3rd tab (tab with index 2)
        driver.switchTo().window(tabs.get(2));
        //click on being emotionally agile
        driver.findElement(By.xpath("//*[@id='ebooksImgBlkFront']")).click();


    }
}