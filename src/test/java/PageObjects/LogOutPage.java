package PageObjects;

import DataProvider.ConfigfileReader;
import Support.Driver;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;

public class LogOutPage extends Driver {
    public static final By accountname=By.xpath("//a[contains(@href,'my-account')]//h3[@class='sc-VigVT iVnnoe']");
    public static final By signoutButton=By.linkText("Log Out");
    public static String name=null;
    public static void verifyUser()
    {
        ConfigfileReader reader=new ConfigfileReader();

        name=driver.findElement(accountname).getText();
        System.out.println(name);
        String fullname=reader.getFirstName() + " " + reader.getLastName();
        System.out.println(fullname);
        assertTrue("Signin name is different from Logout name",
                name.equals(fullname));

    }
    public static void logOut()
    {
        driver.findElement(signoutButton).click();
        System.out.println("User sucessfully logged out");
    }
}
