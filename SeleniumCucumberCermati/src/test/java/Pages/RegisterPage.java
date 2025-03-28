package Pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Slf4j
public class RegisterPage extends BasePage {

    @FindBy(id = "mobilePhone")
    WebElement phoneNumberInputField;

    @FindBy(id = "email")
    WebElement emailInputField;
    @FindBy(id = "firstname")
    WebElement firstNameInputField;
    @FindBy(id = "lastname")
    WebElement lastNameInputField;
    @FindBy(xpath = "//*[@id=\"__next\"]/main/div/div[2]/div/button")
    WebElement registerButton;

    @FindBy(className = "OtpHeader_form-header__DSIwC")
    WebElement oTPHeader;

    public void inputPhoneNumber(String phoneNumber) {
        TypeAtWebElement(phoneNumberInputField, phoneNumber);
    }

    public void inputEmail(String email) {
        TypeAtWebElement(phoneNumberInputField, email);
    }

    public void inputFirstName(String firstName) {
        TypeAtWebElement(firstNameInputField, firstName);
    }

    public void inputLastName(String lastName) {
        TypeAtWebElement(lastNameInputField, lastName);
    }

    public void clickRegister() {
        ClickAtWebElement(registerButton);
    }

    public boolean isRedirectOTP()
    {
        return oTPHeader.isDisplayed();
    }
}
