package Pages;

import Utility.RegisterConstant;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utility.BrowserDriver.*;


@Slf4j
public class RegisterPage extends BasePage {


    public void inputPhoneNumber(String phoneNumber) {
        WebElement temp = getDriver().findElement(By.id(RegisterConstant.phoneNumberInputField_ID));
        TypeAtWebElement(temp, phoneNumber);
    }

    public void inputEmail(String email) {
        WebElement temp = getDriver().findElement(By.id(RegisterConstant.emailInputField_ID));
        TypeAtWebElement(temp, email);
    }

    public void inputFirstName(String firstName) {
        WebElement temp = getDriver().findElement(By.id(RegisterConstant.firstNameInputField_ID));
        TypeAtWebElement(temp, firstName);
    }

    public void inputLastName(String lastName) {
        WebElement temp = getDriver().findElement(By.id(RegisterConstant.lastNameInputField_ID));

        TypeAtWebElement(temp, lastName);
    }

    public void clickRegister() {
        WebElement temp = getDriver().findElement(By.xpath(RegisterConstant.registerButton_XPATH));
        ClickAtWebElement(temp);
    }

    public boolean isRedirectOTP() {
      //  WebElement temp = getDriver().findElement(By.className(RegisterConstant.oTPHeader_CLASS));
       // return temp.isDisplayed();

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        try {
            WebElement temp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(RegisterConstant.oTPHeader_CLASS)));
            return temp.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
