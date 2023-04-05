package AutomationFramework.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class BrowserConfig {
    private static WebDriver driver;

    public static WebDriver getChromeDriver() {
        //Driver Start
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver.exe");
        //driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-popup-blocking");
        chromeOptions.addArguments("--remote-allow-origins=*");

        /*chromeOptions.addExtensions(new File("./src/test/resources/Extensions/MetaMask.crx"));
        System.out.println("\n\nLoaded metamask extension \n\n");*/
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
