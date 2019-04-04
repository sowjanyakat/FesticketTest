package PageObjects;
import DataProvider.ConfigfileReader;
import Support.Driver;
import org.openqa.selenium.By;

public class LoginPage extends Driver {
    public static final By userFieldLocator=By.id("emailInput");
    public static final By passwordFieldLocator=By.id("passwordInput");
    public static final By signinnameLocator=By.xpath("//span[@class='sc-jlyJG hfOwrd']");
    public  static void enterLogInDetails() {

        ConfigfileReader configFileReader = new ConfigfileReader();

        driver.findElement(userFieldLocator).click();
        driver.findElement(userFieldLocator).sendKeys(configFileReader.getUserName());
        driver.findElement(passwordFieldLocator).click();
        driver.findElement(passwordFieldLocator).sendKeys(configFileReader.getPassword());
           }
    public static void checkUserLoggedIn()
    {

        System.out.println(driver.findElement(signinnameLocator).getText());
        driver.findElement(signinnameLocator).click();
    }

}
