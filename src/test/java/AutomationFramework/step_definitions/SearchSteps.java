package AutomationFramework.step_definitions;

import AutomationFramework.bases.GoogleBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import AutomationFramework.utilities.BrowserConfig;

public class SearchSteps {

    @And("I search for {string}")
    public void search_google(String str) {
        GoogleBase base = new GoogleBase(BrowserConfig.getDriver());
        base.searchGoogle(str);
    }
    @And("I accept the cookies for google")
    public void acceptCookiesFromGoogle(){
        GoogleBase base = new GoogleBase(BrowserConfig.getDriver());
        base.acceptGoogleCookies();
    }
    @Then("I check if I got More than 100000 results")
    public void checkHighResult(){
        GoogleBase base = new GoogleBase(BrowserConfig.getDriver());
        base.getResultsAmount();
    }
    @Then("I check if I got Less than 10000 results")
    public void checkFewResult(){

    }
}
