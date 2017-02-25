package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Rus on 27.11.2016.
 */
public class CreateAccountTests extends Fixture {

    @Test
    public void createAccountWithValidData() {
        extentTest = extentReports
                .startTest("createAccountWithValidData")
                .assignCategory("Smoke Test");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.header.openLoginForm();
        extentTest.log(LogStatus.INFO, "Open Login Form");
        kateSpade.header.switchToCreateAccountHopup();
        extentTest.log(LogStatus.INFO, "Switching to Create Account hopup");
        kateSpade.createAccountPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the First Name field");
        kateSpade.createAccountPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field");
        kateSpade.createAccountPage.fillEmailAndConfirmEmailFields(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the Email and Confirm Email fields");
        kateSpade.createAccountPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in the Password field");
        kateSpade.createAccountPage.fillConfirmPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in the Confirm Password field");
        kateSpade.createAccountPage.fillZipCodeField(ZIP);
        extentTest.log(LogStatus.INFO, "Fill in the Zip field");
        kateSpade.createAccountPage.clickSubmitButton();
        extentTest.log(LogStatus.INFO, "Click on the Sumbit button");
        kateSpade.header.checkCongratulationMessage();
        extentTest.log(LogStatus.INFO, "A new Account has been created successfully");
        kateSpade.header.logout();
    }

    @Test
    public void createAccountFormValidation_EmptyFields() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCreateAccountHopup();
        kateSpade.createAccountPage.clickSubmitButton();
        kateSpade.createAccountPage.checkValidationForAllEmptyFields();
    }

    @Test
    public void createAccountFormValidation_Re_RegisterTheSameUser() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCreateAccountHopup();
        kateSpade.createAccountPage.fillFirstNameField(FIRSTNAME);
        kateSpade.createAccountPage.fillLastNameField(LASTNAME);
        kateSpade.createAccountPage.fillEmailField(EMAIL);
        kateSpade.createAccountPage.fillConfirmEmailField(EMAIL);
        kateSpade.createAccountPage.fillPasswordField(PASSWORD);
        kateSpade.createAccountPage.fillConfirmPasswordField(PASSWORD);
        kateSpade.createAccountPage.clickSubmitButton();
        kateSpade.createAccountPage.checkFormValidation_Re_registerTheSameUser();
    }

    @Test
    public void createAccountFormValidation_With_DifferentEmail_In_Email_And_ConfirmEmail_Fields() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCreateAccountHopup();
        kateSpade.createAccountPage.fillFirstNameField(FIRSTNAME);
        kateSpade.createAccountPage.fillLastNameField(LASTNAME);
        kateSpade.createAccountPage.fillEmailField(PAYPAL_EMAIL);
        kateSpade.createAccountPage.fillConfirmEmailField(EMAILFORREGISTEREDUSER);
        kateSpade.createAccountPage.fillPasswordField(PASSWORD);
        kateSpade.createAccountPage.fillConfirmPasswordField(PASSWORD);
        kateSpade.createAccountPage.clickSubmitButton();
        kateSpade.createAccountPage.checkFormValidation_with_DifferentEmail_in_Email__and_ConfirmEmail_Fields();
    }

    @Test
    public void createAccountFormValidation_With_DifferentPassword_And_ConfirmPassword() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCreateAccountHopup();
        kateSpade.createAccountPage.fillFirstNameField(FIRSTNAME);
        kateSpade.createAccountPage.fillLastNameField(LASTNAME);
        kateSpade.createAccountPage.fillEmailAndConfirmEmailFields(EMAIL);
        kateSpade.createAccountPage.fillPasswordField(PASSWORD);
        kateSpade.createAccountPage.fillConfirmPasswordField(INVALID_PASSWORD);
        kateSpade.createAccountPage.clickSubmitButton();
        kateSpade.createAccountPage.checkFormValidation_with_DifferentPassword_And_ConfirmPassword();
    }

    @Test
    public void createAccountFormValidation_PasswordLength() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCreateAccountHopup();
        kateSpade.createAccountPage.fillFirstNameField(FIRSTNAME);
        kateSpade.createAccountPage.fillLastNameField(LASTNAME);
        kateSpade.createAccountPage.fillEmailAndConfirmEmailFields(EMAIL);
        kateSpade.createAccountPage.fillPasswordField(INVALID_PASSWORD_LENGTH);
        kateSpade.createAccountPage.fillConfirmPasswordField(INVALID_PASSWORD_LENGTH);
        kateSpade.createAccountPage.clickSubmitButton();
        kateSpade.createAccountPage.checkFormValidation_with_IncorrectPasswordLength();
    }
}
