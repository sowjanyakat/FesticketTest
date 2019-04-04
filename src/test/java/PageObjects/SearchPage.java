package PageObjects;

import DataProvider.ConfigfileReader;
import Support.Config;
import Support.Driver;
import Support.Waits;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class SearchPage extends Driver {
    public static final By searchbox=By.xpath("//input[@type='text']");
    public static final By searchinput=By.cssSelector("#search-input");
    public static final By selectsearchitem=By.xpath("//ul[@class='app-containers-Search-search__search_results']//li[1]//a");
    public static final By itemtext=By.xpath("//h3[@class='app-components-search-SearchHeading-styles__search_heading app-components-search-SearchHeading-styles__dark']//span//span[2]");
    public static void cickSearchBox()
    {
        driver.findElement(searchbox).click();
        Waits.waitUntilTitledisplay(Config.SEARCH_PAGE_TITLE,30);
    }
    public static void enterTextToSearch()
    {
        ConfigfileReader reader=new ConfigfileReader();
        driver.findElement(searchinput).click();
        driver.findElement(searchinput).sendKeys(reader.getsearchItem());
        driver.findElement(selectsearchitem).click();
        assertTrue("Festicket Search Page is not rendered",
                FesticketHomePage.getPageTitle().contains(reader.getsearchItem()));
    }
  /*  public static String verifyItem()
    {
        String itemname=driver.findElement(itemtext).getText();
        System.out.println(itemname);
        return itemname;
    }*/

}
