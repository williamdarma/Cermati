package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;


public class BrowserDriver {

    private static WebDriver driver;

    public BrowserDriver(String browser) {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "91.0");

        switch (browser)
        {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;
        }
        driver.get(Constant.URL);;
    }

    public static WebDriver getDriver()
    {
        return driver;
    }

    public void Close()
    {
        driver.close();
    }
}
