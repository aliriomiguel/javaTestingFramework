package AutomationFramework.step_definitions;

import AutomationFramework.bases.LoginBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import AutomationFramework.utilities.BrowserConfig;
public class LoginSteps {

    @And("I add username {string} and password {string}")
    public void addCredentials(String username, String password){
        LoginBase base = new LoginBase(BrowserConfig.getDriver());
        base.insertCredentials(username, password);
    }

    @And("I click on the checkbox")
    public void clickPrivacyPolicyCheckbox(){
        LoginBase base = new LoginBase(BrowserConfig.getDriver());
        base.clickPrivacyCheckbox();
    }

    @And("I click on Submit button")
    public void clickSubmitButtonLogin(){
        LoginBase base = new LoginBase(BrowserConfig.getDriver());
        base.clickSubmitLoginButton();
    }

    @Then("I see the alert message with login ok")
    public void checkAlertMessageText(){
        LoginBase base = new LoginBase(BrowserConfig.getDriver());
        base.checkLoginAlert();
    }


}
