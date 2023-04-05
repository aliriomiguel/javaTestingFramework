package AutomationFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPO {
    private WebDriver driver;

    public LoginPO(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameInput(){
        WebElement elem = driver.findElement(By.id("username"));
        return elem;
    }
    public WebElement getPasswordInput(){
        WebElement elem = driver.findElement(By.id("password"));
        return elem;
    }

    public WebElement getPrivacyCheckbox(){
        WebElement elem = driver.findElement(By.id("privacy"));
        return elem;
    }

    public WebElement getSubmitButton(){
        WebElement elem = driver.findElement(By.cssSelector("body > form > input[type=button]:nth-child(13)"));
        return elem;
    }
}
