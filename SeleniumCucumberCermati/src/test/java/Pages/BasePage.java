package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utility.BrowserDriver.getDriver;

public class BasePage {

    public static void ClickAtWebElement(WebElement we)
    {
        we.click();
    }

    public static void TypeAtWebElement(WebElement we, String s){
        we.sendKeys(s);
        WaitFor(5);
    }

    public static void WaitUntilWebElementVisible(WebElement we, int time) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(we));
    }

    public static void WaitFor(int second)
    {
        int time = second*1000;
        try {
        Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
