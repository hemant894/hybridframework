package StepDefinition;

import Comonpages.BrowserSelector;
import Comonpages.Utils;
import gherkin.formatter.model.Scenario;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;

public class Hooks extends Utils {

    BrowserSelector browserSelector=new BrowserSelector();
    @Before
    public void openbrowser(){browserSelector.openSelectedBrowser();}
    @After
    public void closebrowser(Scenario scenario) throws IOException {

        driver.quit();

    }

}
