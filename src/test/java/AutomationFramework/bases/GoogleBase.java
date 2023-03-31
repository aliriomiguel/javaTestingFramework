package AutomationFramework.bases;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import AutomationFramework.pages.GooglePO;
public class GoogleBase {
    private WebDriver driver;

    public GoogleBase(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoGoogle() {
        System.out.println("Opening Google...");
        driver.get("https://google.com");
    }

    public void searchGoogle(String str) {
        GooglePO objects = new GooglePO(driver);

        objects.getSearchTxbox().sendKeys(str);
        objects.getSearchTxbox().sendKeys(Keys.ENTER);
    }
}
