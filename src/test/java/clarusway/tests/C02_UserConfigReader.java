package clarusway.tests.C02_;

import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import org.testng.annotations.Test;

public class C02_UserConfigReader {

    @Test
    public void test01(){
        System.out.println(ConfigReader.getProperty("browser"));

        Driver.getDriver().get(ConfigReader.getProperty("clarusway_url"));

        Driver.getDriver().get(ConfigReader.getProperty("contact_list_app"));

        System.out.println(ConfigReader.getProperty("contact_list_username"));

        Driver.closeDriver();

    }
}
