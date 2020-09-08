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

public class Reporting {


    @Test
    public void logintest() throws IOException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://facebook.com");

        TakesScreenshot ts = (TakesScreenshot) driver;

        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(scrFile, new File("D:\\pallavi\\screenshot.png"));

    }
    }
