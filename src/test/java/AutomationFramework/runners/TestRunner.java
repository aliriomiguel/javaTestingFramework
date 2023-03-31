package AutomationFramework.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "me.jvt.cucumber.report.PrettyReports:target",
                "pretty"
        },
        features = {"src/test/resources/Features"},
        glue = {"io/communityGaming/step_definitions"},
        publish = false,
        tags = "@Search",
        dryRun =false
)
public class TestRunner {
}
