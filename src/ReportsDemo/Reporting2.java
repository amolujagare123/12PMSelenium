package ReportsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reporting2 {

    @Test
    public void logintest() throws IOException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://scriptinglogic.com");

        TakesScreenshot ts = (TakesScreenshot) driver;

        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String filename ="";

        String timeStamp = new SimpleDateFormat("_dd_MM_yyyy_hh_mm_ss").format(new Date());

        filename = "screenshot"+timeStamp+".png";

        FileUtils.copyFile(scrFile, new File("D:\\pallavi\\"+filename));

    }
}
