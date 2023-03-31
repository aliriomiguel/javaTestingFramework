package AutomationFramework.bases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class CommonBase {
    private WebDriver driver;

    public CommonBase(WebDriver driver) {
        this.driver = driver;
    }
    public void goToURL(String url) {
        System.out.println("Opening URL...");
        driver.get(url);
    }
}
