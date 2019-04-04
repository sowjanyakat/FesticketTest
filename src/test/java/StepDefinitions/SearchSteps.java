package StepDefinitions;

import PageObjects.FesticketHomePage;
import PageObjects.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertTrue;

public class SearchSteps {
    @Given("^User navigates to Search page$")
    public void userNavigatesToSearchPage() {
        SearchPage.cickSearchBox();
    }

    @When("^User Search for the festival$")
    public void userSearchForTheFestival() {
        SearchPage.enterTextToSearch();
    }

    @Then("^Veify user navigates to corresponding page$")
    public void veifyUserNavigatesToCorrespondingPage() {
        System.out.println(FesticketHomePage.getPageTitle());
    }
}
