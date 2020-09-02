package TestNGDemos.Demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassThree {

    @BeforeSuite
    public void beforeMySuite()
    {
        System.out.println("beforeMySuite()");
    }

    @AfterSuite
    public void afterMySuite()
    {
        System.out.println("afterMySuite()");
    }

    @Test
    public void classThreetest1()
    {
        System.out.println("classThreetest1()");
    }

    @Test (groups = "email") //(enabled=false)
    public void classThreetest2()
    {
        System.out.println("classThreetest2()");
    }

    @Test
    public void classThreetest3()
    {
        System.out.println("classThreetest3()");
    }
}
