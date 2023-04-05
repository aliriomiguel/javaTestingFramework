package AutomationFramework.step_definitions;


import AutomationFramework.bases.CommonBase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import AutomationFramework.utilities.BrowserConfig;

public class CommonSteps {

    @Given("I open CHROME")
    public void open_Chrome() {
        BrowserConfig.getChromeDriver();
    }

    @And("I visit {string}")
    public void visitURL(String url){
        CommonBase base = new CommonBase(BrowserConfig.getDriver());
        base.goToURL("https://"+url);
    }

    @After
    public void tearDown(Scenario scenario) {
        //screenshoot
        final byte[] screenshot = ((TakesScreenshot) BrowserConfig.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "myScreenshot");
        //cerrar el driver
        BrowserConfig.getDriver().quit();
    }


}