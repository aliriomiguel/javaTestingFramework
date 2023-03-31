package AutomationFramework.step_definitions;

import AutomationFramework.bases.GoogleBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import AutomationFramework.utilities.BrowserConfig;

public class SearchSteps {

    @And("I Search for {string}")
    public void search_google(String str) {
        GoogleBase base = new GoogleBase(BrowserConfig.getDriver());
        base.searchGoogle(str);
    }
}
