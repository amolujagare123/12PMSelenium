package ReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExtentReportDemo {

    ExtentSparkReporter reporter;
    ExtentReports extent;

    @BeforeClass
    public void init()
    {

        reporter = new ExtentSparkReporter("Reports\\report.html");


        reporter.config().setDocumentTitle("All testing reports");
        reporter.config().setReportName("Regression testing of Stock management");

        extent = new ExtentReports();

        extent.attachReporter(reporter);

        extent.setSystemInfo("Project name","Stock management system");
        extent.setSystemInfo("Dev name","Gaurav");
        extent.setSystemInfo("Testers name","Priyanka");

    }


    @Test
    public void logintest() throws IOException {

        ExtentTest test = extent.createTest("Logintest");

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");

        driver.manage().window().maximize();

        test.info("browser is Maximized");

        driver.get("http://stock.scriptinglogic.net");

        test.info("url is opened");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");
        // driver.findElement(By.id("login-username")).sendKeys("admin");

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("admin");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is clicked");

        extent.flush();
    }
}
