package clarusway.tests;

import clarusway.pages.HBMarkalarPage;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import clarusway.utilities.JavaScriptUtilities;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class C08_HBMarkalar {
/*
    Given
        Go to https://www.hepsiburada.com/bilgisayarlar-c-2147483646
    When
        Click all marks and print their names
*/

    @Test
    public void test1() {
       // Go to https://www.hepsiburada.com/bilgisayarlar-c-2147483646
        Driver.getDriver().get(ConfigReader.getProperty("hb_markalar"));


      //  Click all marks and print their names

        HBMarkalarPage markalarPage=new HBMarkalarPage();
        List<WebElement> markalar= markalarPage.markalar;

        JavaScriptUtilities.scrollIntoViewJS(markalar.get(0));//Bu şekilde ilt elementten başlanıp sonra devam edilebilir ancak zataen aşapıdaki direk işlemi gerçekleştiriyor.


        for (WebElement w : markalar) {
            JavaScriptUtilities.clickElementByJS(w);
          String marka= w.getAttribute("value");
            System.out.println(marka);
        }
    }


}
