package StepsDefinition;

import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class RegisterSteps {

    RegisterPage registerPage = new RegisterPage();

    @Given("User navigate to Cermati Register page")
    public void userNavigateToCermatiRegisterPage() {

    }

    @And("User input {string} at phone number field at Register page")
    public void userInputAtPhoneNumberFieldAtRegisterPage(String phoneNumber) {
        registerPage.inputPhoneNumber(phoneNumber);
    }

    @And("User input {string} at email field at Register page")
    public void userInputEmailAtRegisterPage(String email) {
        registerPage.inputEmail(email);
    }

    @And("User input {string} first name at Register page")
    public void userInputFirstNameAtRegisterPage(String firstName) {
        registerPage.inputFirstName(firstName);
    }

    @And("User input {string} last name at Register page")
    public void userInputLastNameAtRegisterPage(String lastName) {
        registerPage.inputLastName(lastName);

    }

    @And("User click register at Register page")
    public void userClickRegisterAtRegisterPage() {
        registerPage.clickRegister();
    }

    @Then("Verify User redirect to input OTP page")
    public void verifyUserRedirectToInputOTPPage() {
        Assert.assertTrue("User redirect to OTP page", registerPage.isRedirectOTP());

    }
}
