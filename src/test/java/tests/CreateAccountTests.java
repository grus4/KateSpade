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
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.homePage.refreshPage();
        extentTest.log(LogStatus.INFO, "Refresh Home Page");
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
        kateSpade.createAccountPage.switchToNewAccount();
        extentTest.log(LogStatus.INFO, "Click on the Submit button");
        kateSpade.header.checkCongratulationMessage();
        extentTest.log(LogStatus.INFO, "A new Account has been created successfully");
        kateSpade.header.logout();
    }

    @Test
    public void createAccountFormValidation_EmptyFields() {
        extentTest = extentReports
                .startTest("createAccountFormValidation_EmptyFields")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.homePage.refreshPage();
        extentTest.log(LogStatus.INFO, "Refresh Home Page");
        kateSpade.header.switchToCreateAccountHopup();
        extentTest.log(LogStatus.INFO, "Switching to Create Account hopup");
        kateSpade.createAccountPage.clickSubmitButton();
        extentTest.log(LogStatus.INFO, "Click on the Submit button");
        kateSpade.createAccountPage.checkValidationForAllEmptyFields();
        extentTest.log(LogStatus.INFO, "Error message is displayed under each empty field");
    }

    //@Test
    public void createAccountFormValidation_Re_RegisterTheSameUser() {
        extentTest = extentReports
                .startTest("createAccountFormValidation_Re_RegisterTheSameUser")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.homePage.refreshPage();
        extentTest.log(LogStatus.INFO, "Refresh Home Page");
        kateSpade.header.switchToCreateAccountHopup();
        extentTest.log(LogStatus.INFO, "Switching to Create Account hopup");
        kateSpade.createAccountPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the First Name Field");
        kateSpade.createAccountPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field");
        kateSpade.createAccountPage.fillEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the existing email in the Email field");
        kateSpade.createAccountPage.fillConfirmEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the existing email in the Confirm Email field");
        kateSpade.createAccountPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in the Password field with valid data");
        kateSpade.createAccountPage.fillConfirmPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in the Confirm password field with valid data");
        kateSpade.createAccountPage.fillZipCodeField(ZIP);
        extentTest.log(LogStatus.INFO, "Fill in the Zip field");
        kateSpade.createAccountPage.clickSubmitButton();
        extentTest.log(LogStatus.INFO, "Click on the Submit button");
        kateSpade.createAccountPage.checkFormValidation_Re_registerTheSameUser();
        extentTest.log(LogStatus.INFO, "Email address already registered message is displayed correctly");
    }

    //@Test
    public void createAccountFormValidation_With_DifferentEmail_In_Email_And_ConfirmEmail_Fields() {
        extentTest = extentReports
                .startTest("createAccountFormValidation_With_DifferentEmail_In_Email_And_ConfirmEmail_Fields")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.homePage.refreshPage();
        extentTest.log(LogStatus.INFO, "Refresh Home Page");
        kateSpade.header.switchToCreateAccountHopup();
        extentTest.log(LogStatus.INFO, "Switching to Create Account hopup");
        kateSpade.createAccountPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the First Name Field");
        kateSpade.createAccountPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field");
        kateSpade.createAccountPage.fillEmailField(PAYPAL_EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the Email field");
        kateSpade.createAccountPage.fillConfirmEmailField(EMAILFORREGISTEREDUSER);
        extentTest.log(LogStatus.INFO, "Enter the e-mail that differs from the e-mail address entered in the Email field");
        kateSpade.createAccountPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in the Password field with valid data");
        kateSpade.createAccountPage.fillConfirmPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in the Confirm password field with valid data");
        kateSpade.createAccountPage.fillZipCodeField(ZIP);
        extentTest.log(LogStatus.INFO, "Fill in the Zip field");
        kateSpade.createAccountPage.clickSubmitButton();
        extentTest.log(LogStatus.INFO, "Click on the Submit button");
        kateSpade.createAccountPage.checkFormValidation_with_DifferentEmail_in_Email__and_ConfirmEmail_Fields();
        extentTest.log(LogStatus.INFO, "Mismatching emails message is displayed correctly");
    }

    //@Test
    public void createAccountFormValidation_With_DifferentPassword_And_ConfirmPassword() {
        extentTest = extentReports
                .startTest("createAccountFormValidation_With_DifferentPassword_And_ConfirmPassword")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.homePage.refreshPage();
        extentTest.log(LogStatus.INFO, "Refresh Home Page");
        kateSpade.header.switchToCreateAccountHopup();
        extentTest.log(LogStatus.INFO, "Switching to Create Account hopup");
        kateSpade.createAccountPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the First Name Field");
        kateSpade.createAccountPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field");
        kateSpade.createAccountPage.fillEmailAndConfirmEmailFields(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the Email and Confirm Email fields");
        kateSpade.createAccountPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in the Password field with valid data");
        kateSpade.createAccountPage.fillConfirmPasswordField(INVALID_PASSWORD);
        extentTest.log(LogStatus.INFO, "Enter a password that differs from the password entered in the Email field");
        kateSpade.createAccountPage.fillZipCodeField(ZIP);
        extentTest.log(LogStatus.INFO, "Fill in the Zip field");
        kateSpade.createAccountPage.clickSubmitButton();
        extentTest.log(LogStatus.INFO, "Click on the Submit button");
        kateSpade.createAccountPage.checkFormValidation_with_DifferentPassword_And_ConfirmPassword();
        extentTest.log(LogStatus.INFO, "Mismatching passwords message is displayed correctly");
    }

    //@Test
    public void createAccountFormValidation_PasswordLength() {
        extentTest = extentReports
                .startTest("createAccountFormValidation_PasswordLength")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.homePage.refreshPage();
        extentTest.log(LogStatus.INFO, "Refresh Home Page");
        kateSpade.header.switchToCreateAccountHopup();
        extentTest.log(LogStatus.INFO, "Switching to Create Account hopup");
        kateSpade.createAccountPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the First Name Field");
        kateSpade.createAccountPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field");
        kateSpade.createAccountPage.fillEmailAndConfirmEmailFields(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the Email and Confirm Email fields");
        kateSpade.createAccountPage.fillPasswordField(INVALID_PASSWORD_LENGTH);
        extentTest.log(LogStatus.INFO, "Enter an invalid password length in the Password field");
        kateSpade.createAccountPage.fillConfirmPasswordField(INVALID_PASSWORD_LENGTH);
        extentTest.log(LogStatus.INFO, "Enter an invalid password length in the Confirm Password field");
        kateSpade.createAccountPage.fillZipCodeField(ZIP);
        extentTest.log(LogStatus.INFO, "Fill in the Zip field");
        kateSpade.createAccountPage.clickSubmitButton();
        extentTest.log(LogStatus.INFO, "Click on the Submit button");
        kateSpade.createAccountPage.checkFormValidation_with_IncorrectPasswordLength();
        extentTest.log(LogStatus.INFO, "Error message for incorrect Password length is displayed correctly");
    }
}
