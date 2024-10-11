package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ContactListContactPage {

    public ContactListContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
