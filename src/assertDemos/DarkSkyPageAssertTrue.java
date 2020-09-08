package assertDemos;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DarkSkyPageAssertTrue {
    @Test
    public void logintest() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//      driver.get("https://darksky.net/forecast/18.5195,73.8707/us12/en");
        driver.get("https://darksky.net/forecast/40.7127,-74.0059/us12/en");


       List<WebElement> rawTimeList = driver.findElements(By.xpath("//span[@class='hour']/span"));
        // it returns list of webelements

        ArrayList<Integer> timeList  = new ArrayList<>();

        for(int i=0;i<rawTimeList.size();i++)
        {
            WebElement rawTimeElement  = rawTimeList.get(i);

            String rawTime = rawTimeElement.getText();

            System.out.print(rawTime+" ");

            int l = rawTime.length();//-- 4

            String timeStr = rawTime.substring(0,l-2); //---- > "12" ??

            int time = Integer.parseInt(timeStr);

            timeList.add(time);
        }
        System.out.println();
        System.out.println(timeList);


        ArrayList<Integer> expectedList = new ArrayList<>();
        for (int i=0;i<timeList.size()-1;i++)
        {
            int time1 = timeList.get(i);
            int time2 = timeList.get(i+1);
            int diff =0;

            if (time1>time2)
                diff = (time2+12) - time1;
            else
                diff = time2-time1;

            expectedList.add(diff);

        }

        System.out.println(expectedList);

        int occuranceOfTwo = Collections.frequency(expectedList,2);

        System.out.println("occurance of 2="+occuranceOfTwo);

        // if occarance of the 2 is equal to the size of
        // the list then it means that all the 10 elements are 2 only

        int size = expectedList.size();
        System.out.println("size="+size);

       boolean result =  occuranceOfTwo == size;


        Assert.assertTrue(result,"the occarance of 2 is only "+occuranceOfTwo+" times");

    }

}
