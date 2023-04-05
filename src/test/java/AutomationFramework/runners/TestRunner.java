package AutomationFramework.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:./target/report/LoginReport.html"
        },
        features = {"src/test/resources/Features"},
        publish = false,
        glue = {"AutomationFramework/step_definitions"},
        tags = "@login",
        dryRun =false
)
public class TestRunner {
}
