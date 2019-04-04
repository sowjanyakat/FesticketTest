package Support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import DataProvider.ConfigfileReader;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver driver;

    /**
     * Fires up a chrome browser which is then used by the pageObjects to trigger browser events.
     */
    public static void initialiseDriver() {

        ConfigfileReader configFileReader = new ConfigfileReader();
        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(configFileReader.getTimeOutValue(), TimeUnit.SECONDS);
    }
}
