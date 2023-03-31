package AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GooglePO {
    private WebDriver driver;

    public GooglePO(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getSearchTxbox() {
        WebElement elem = driver.findElement(By.name("q"));
        return elem;
    }
}
