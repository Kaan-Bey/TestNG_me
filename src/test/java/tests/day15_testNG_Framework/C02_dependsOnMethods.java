package tests.day15_testNG_Framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_dependsOnMethods {

    @Test
    public void  amazonTest(){
        Driver.getDriver().get("https://www.amazon.com");

        String expectedUrlIcerik ="Amazon";
        String actualUrlIcerik = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrlIcerik.contains(expectedUrlIcerik));

    }

    @Test (dependsOnMethods = "amazonTest")
    public void nutellaTest(){


    }

    @Test (dependsOnMethods = "nutellaTest")
    public void ilkUrunTesti(){


    }

}
