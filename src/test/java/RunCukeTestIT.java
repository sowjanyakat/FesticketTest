import Support.Driver;
import Utilities.TakeScreenShot;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Login", strict = true, format = {"pretty","html:target/cukes"},
        features = {"src/test/Resources/features/"},glue={"StepDefinitions"},monochrome = true)
public class RunCukeTestIT {


    @BeforeClass
    public static void setup() {
        System.out.println("Initialising Driver");
        Driver.initialiseDriver();
    }

    @AfterClass
    public static void teardown() {

// Take screenshot and store as a file format
        try {
            TakeScreenShot.captureScreenShot(Driver.driver, "target\\screenShots\\screenshot.png");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Driver.driver.quit();
    }

}
