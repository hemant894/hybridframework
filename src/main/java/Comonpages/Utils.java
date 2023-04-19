package Comonpages;

import org.openqa.selenium.By;

public class Utils  extends BasePage{


    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

}
