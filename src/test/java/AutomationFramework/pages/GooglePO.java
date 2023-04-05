package AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GooglePO {
    private WebDriver driver;

    public GooglePO(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getSearchTxbox() {
        WebElement elem = driver.findElement(By.name("q"));
        return elem;
    }

    public WebElement getCookiesButton(){
        WebElement elem = driver.findElement(By.cssSelector("#L2AGLb > div"));
        return elem;
    }

    public WebElement getResultsAmountAndTime(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));
        //WebElement elem = driver.findElement(By.id("#result-stats"));
        return element;
    }
}
