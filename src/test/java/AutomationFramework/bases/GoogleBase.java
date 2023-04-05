package AutomationFramework.bases;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import AutomationFramework.pages.GooglePO;
public class GoogleBase {
    private WebDriver driver;

    public GoogleBase(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptGoogleCookies() {
        System.out.println("Accepting cookies...");
        GooglePO acceptBtn = new GooglePO(driver);
        acceptBtn.getCookiesButton().click();
    }

    public void searchGoogle(String str) {
        GooglePO objects = new GooglePO(driver);

        objects.getSearchTxbox().sendKeys(str);
        objects.getSearchTxbox().sendKeys(Keys.ENTER);
    }

    public void getResultsAmount(){
        GooglePO object = new GooglePO(driver);

        String textResults = object.getResultsAmountAndTime().getText();
        int parenthesisStart = textResults.indexOf("(");
        String resultValue = textResults.substring(0, parenthesisStart).replaceAll("[^0-9]+", "");

        long result = Long.parseLong(resultValue);

        Assert.assertTrue(result>100000);
    }
    public void getLessResultsAmount(){
        GooglePO object = new GooglePO(driver);

        String textResults = object.getResultsAmountAndTime().getText();
        int parenthesisStart = textResults.indexOf("(");
        String resultValue = textResults.substring(0, parenthesisStart).replaceAll("[^0-9]+", "");

        long result = Long.parseLong(resultValue);

        Assert.assertTrue(result<10000);
    }
}
