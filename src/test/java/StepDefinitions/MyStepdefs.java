package StepDefinitions;
import PageObjects.FesticketHomePage;
import PageObjects.LogOutPage;
import PageObjects.LoginPage;
import Support.Waits;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Support.Config.*;
import static org.junit.Assert.assertTrue;

public class MyStepdefs {
    @Given("^User is on HomePage of Festicket$")
    public void userIsOnHomePageOfFesticket() {
        FesticketHomePage.navigateToSearchPage(FESTICKET_HOME_PAGE);
        assertTrue("Festicket Home page is not rendered",
                FesticketHomePage.getPageTitle().equals(FESTICKET_HOME_PAGE_TITLE));
    }

    @When("^User clicks on signin button$")
    public void userClicksOnSigninButton() {
        FesticketHomePage.clickSignInButton();
    }

    @And("^user enters valid Username and Password$")
    public void userEntersValidUsernameAndPassword() {
        LoginPage.enterLogInDetails();
    }

    @Then("^User gets logged in$")
    public void userGetsLoggedIn() {
        FesticketHomePage.pressSignInSubmitButton();
        assertTrue("Festicket account Page is not rendered",
                FesticketHomePage.getPageTitle().equals(FESTICKET_ACCOUNT_PAGE_TITLE));
    }

    @Given("^User is on Account Page$")
    public void userIsOnAccountPage() {
       LoginPage.checkUserLoggedIn();
    }

    @When("^User Clicks on Signout Button$")
    public void userClicksOnSignoutButton() {
        LogOutPage.verifyUser();
    }

    @Then("^User gets logged out$")
    public void userGetsLoggedOut() {
        LogOutPage.logOut();
    }
}
