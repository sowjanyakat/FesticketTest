package PageObjects;

import Support.Config;
import Support.Driver;
import Support.Waits;
import org.openqa.selenium.By;

public class FesticketHomePage extends Driver {
    public static final By signInLocator = By.xpath("//span[contains(text(),'Log In')]");
    public static final By signInSubmitButtonLocator=By.cssSelector("#submitButton");
    public static void navigateToSearchPage(String url){

        driver.get(url);
        //Waits.waitUntilElementToBeClickable(signInLocator,30);
    }

    public static String getPageTitle(){

        System.out.println(driver.getTitle());
        return driver.getTitle();
    }
    public static void clickSignInButton()
    {
        driver.findElement(signInLocator).click();
        Waits.waitUntilElementToBeClickable(signInLocator,30);
    }


    public static void pressSignInSubmitButton()

    {
        driver.findElement(signInSubmitButtonLocator).click();
        Waits.waitUntilTitledisplay(Config.FESTICKET_ACCOUNT_PAGE_TITLE,30);
    }
}
