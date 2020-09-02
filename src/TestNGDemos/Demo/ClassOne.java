package TestNGDemos.Demo;

import org.testng.annotations.Test;

public class ClassOne {

    @Test
    public void classOnetest1()
    {
        System.out.println("classOnetest1()");
    }

    @Test (groups = "email") // (enabled=false)
    public void classOnetest2()
    {
        System.out.println("classOnetest2()");
    }

    @Test
    public void classOnetest3()
    {
        System.out.println("classOnetest3()");
    }

}
