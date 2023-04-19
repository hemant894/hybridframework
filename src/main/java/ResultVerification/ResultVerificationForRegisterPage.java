package ResultVerification;

import Comonpages.Utils;
import org.testng.Assert;


public class ResultVerificationForRegisterPage extends Utils {
    public void registerPageTitle(){
        String Title = driver.getTitle();
        Assert.assertEquals(Title,"nopCommerce demo store. Register","Register page title not matched");
    }


}
