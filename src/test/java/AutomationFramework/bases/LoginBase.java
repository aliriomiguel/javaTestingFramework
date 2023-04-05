package AutomationFramework.bases;

import AutomationFramework.pages.LoginPO;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;

public class LoginBase {
    private WebDriver driver;

    private Alert alert;

    public LoginBase(WebDriver driver) {
        this.driver = driver;
    }

    public void insertCredentials(String username, String password){
        LoginPO loginPO = new LoginPO(driver);
        loginPO.getUsernameInput().sendKeys(username);
        loginPO.getPasswordInput().sendKeys(password);
    }

    public void clickPrivacyCheckbox(){
        LoginPO loginPO = new LoginPO(driver);
        loginPO.getPrivacyCheckbox().click();
    }

    public void clickSubmitLoginButton(){
        LoginPO loginPO = new LoginPO(driver);
        loginPO.getSubmitButton().click();
    }

    public void checkLoginAlert(String mssg){
        alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertTrue(alertText.equals(mssg));
    }

    public void clickOnAlertMessage(){
        alert.accept();
    }
}
