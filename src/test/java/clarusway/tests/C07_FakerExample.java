package clarusway.tests;

import clarusway.pages.ContactListHomePage;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class C07_FakerExample {
    @Test
    public void test01() throws InterruptedException {
        ContactListHomePage homePage= new ContactListHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("contact_list_url"));

        homePage.username.sendKeys(Faker.instance().internet().emailAddress());
        homePage.password.sendKeys(Faker.instance().internet().password());
        homePage.submit.click();
        Thread.sleep(1000);
        String errorMessage=homePage.errorMessage.getText();
        assertEquals(errorMessage,"Incorrect username or password");

        Driver.closeDriver();
    }
}
