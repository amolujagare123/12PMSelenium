package TestNGDemos.Demo;

import org.testng.annotations.*;

public class ClassTwo {


    @BeforeClass
    public void beforeTestMethod()
    {
        System.out.println("beforeTestMethod()");
    }

    @AfterClass
    public void afterTestMethod()
    {
        System.out.println("afterTestMethod()");
    }

    @Test
    public void classTwotest1()
    {
        System.out.println("classTwotest1()");
    }

    @Test (groups = "email")//(enabled=false)
    public void classTwotest2()
    {
        System.out.println("classTwotest2()");
    }

    @Test
    public void classTwotest3()
    {
        System.out.println("classTwotest3()");
    }
}
