package ResultVerification;

import Comonpages.Utils;
import org.testng.Assert;

public class ResultVerificationForHomepage extends Utils {
    public void homePageTitle(){
        String Title = driver.getTitle();
        Assert.assertEquals(Title,"nopCommerce demo store","Login Page title not matched");
    }
}
