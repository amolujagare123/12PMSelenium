import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JobApplication {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        WebElement listJobLocation = driver.findElement(By.id("source_118"));

        Select seListJobLocation = new Select(listJobLocation);

        seListJobLocation.selectByVisibleText("Bangalore");

        Thread.sleep(2000);
        seListJobLocation.selectByVisibleText("Mumbai");

        Thread.sleep(2000);
        seListJobLocation.selectByVisibleText("Delhi");

        Thread.sleep(2000);
        WebElement btnAdd = driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]"));

        btnAdd.click();
        btnAdd.click();


      /*  WebElement listSelectedjobLoc =driver.findElement(By.id("fld_118"));
        Select selListSelectedjobLoc = new Select(listSelectedjobLoc);

        selListSelectedjobLoc.selectByIndex(1);
        selListSelectedjobLoc.selectByIndex(2);

        WebElement btnRemove = driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]"));

        btnRemove.click();*/






    }
}
