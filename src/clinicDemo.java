import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clinicDemo {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://openclinic.sourceforge.net/openclinic/admin/staff_list.php");

        driver.findElement(By.xpath("//tr[td[text()='newuser']]//img[@alt='edit']")).click();

    }
}
