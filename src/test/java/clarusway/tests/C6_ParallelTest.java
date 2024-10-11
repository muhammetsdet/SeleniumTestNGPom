package clarusway.tests;

import org.testng.annotations.Test;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.DriverThreadLocal;
import org.openqa.selenium.WebDriver;

public class C6_ParallelTest {


    @Test
    public void test1(){

        DriverThreadLocal.setDriver();

        WebDriver driver = DriverThreadLocal.getDriver();

        driver.get(ConfigReader.getProperty("clarusway_url"));

        System.out.println("driver.getTitle() = " + driver.getTitle());

        DriverThreadLocal.closeBrowser();

    }

    @Test
    public void test2(){

        DriverThreadLocal.setDriver();

        WebDriver driver = DriverThreadLocal.getDriver();

        driver.get(ConfigReader.getProperty("contact_list_url"));

        System.out.println("driver.getTitle() = " + driver.getTitle());

        DriverThreadLocal.closeBrowser();

    }

    @Test
    public void test3(){

        DriverThreadLocal.setDriver();

        WebDriver driver = DriverThreadLocal.getDriver();

        driver.get(ConfigReader.getProperty("dhtmlgoodies_url"));

        System.out.println("driver.getTitle() = " + driver.getTitle());

        DriverThreadLocal.closeBrowser();

    }

}
