package tests;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Rus on 27.11.2016.
 */
public class CreateAccountTests extends Fixture {

    @Test
    public void createAccountWithValidData() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCreateAccountPage();
        kateSpade.createAccountPage.fillFirstNameField(FIRSTNAME);
        kateSpade.createAccountPage.fillLastNameField(LASTNAME);
        kateSpade.createAccountPage.fillEmailAndConfirmEmailFields(EMAIL);
        kateSpade.createAccountPage.fillPasswordField(PASSWORD);
        kateSpade.createAccountPage.fillConfirmPasswordField(PASSWORD);
        kateSpade.createAccountPage.clickApplyButton();
        Assert.assertTrue(kateSpade.myAccountPage.isLogoutButtonIsAvailable(), "New account is not created");
        kateSpade.header.logout();
    }

    @Test
    public void createAccountFormValidation_EmptyFields() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCreateAccountPage();
        kateSpade.createAccountPage.clickApplyButton();
        kateSpade.createAccountPage.checkValidationForAllEmptyFields();
    }

    @Test
    public void createAccountFormValidation_Re_RegisterTheSameUser() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCreateAccountPage();
        kateSpade.createAccountPage.fillFirstNameField(FIRSTNAME);
        kateSpade.createAccountPage.fillLastNameField(LASTNAME);
        kateSpade.createAccountPage.fillEmailField(EMAIL);
        kateSpade.createAccountPage.fillConfirmEmailField(EMAIL);
        kateSpade.createAccountPage.fillPasswordField(PASSWORD);
        kateSpade.createAccountPage.fillConfirmPasswordField(PASSWORD);
        kateSpade.createAccountPage.clickApplyButton();
        kateSpade.createAccountPage.checkFormValidation_Re_registerTheSameUser();
    }

    @Test
    public void createAccountFormValidation_With_DifferentEmail_In_Email_And_ConfirmEmail_Fields() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCreateAccountPage();
        kateSpade.createAccountPage.fillFirstNameField(FIRSTNAME);
        kateSpade.createAccountPage.fillLastNameField(LASTNAME);
        kateSpade.createAccountPage.fillEmailField(PAYPAL_EMAIL);
        kateSpade.createAccountPage.fillConfirmEmailField(EMAILFORREGISTEREDUSER);
        kateSpade.createAccountPage.fillPasswordField(PASSWORD);
        kateSpade.createAccountPage.fillConfirmPasswordField(PASSWORD);
        kateSpade.createAccountPage.clickApplyButton();
        kateSpade.createAccountPage.checkFormValidation_with_DifferentEmail_in_Email__and_ConfirmEmail_Fields();
    }

    @Test
    public void createAccountFormValidation_With_DifferentPassword_And_ConfirmPassword() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCreateAccountPage();
        kateSpade.createAccountPage.fillFirstNameField(FIRSTNAME);
        kateSpade.createAccountPage.fillLastNameField(LASTNAME);
        kateSpade.createAccountPage.fillEmailAndConfirmEmailFields(EMAIL);
        kateSpade.createAccountPage.fillPasswordField(PASSWORD);
        kateSpade.createAccountPage.fillConfirmPasswordField(INVALID_PASSWORD);
        kateSpade.createAccountPage.clickApplyButton();
        kateSpade.createAccountPage.checkFormValidation_with_DifferentPassword_And_ConfirmPassword();
    }

    @Test
    public void createAccountFormValidation_PasswordLength() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCreateAccountPage();
        kateSpade.createAccountPage.fillFirstNameField(FIRSTNAME);
        kateSpade.createAccountPage.fillLastNameField(LASTNAME);
        kateSpade.createAccountPage.fillEmailAndConfirmEmailFields(EMAIL);
        kateSpade.createAccountPage.fillPasswordField(INVALID_PASSWORD_LENGTH);
        kateSpade.createAccountPage.fillConfirmPasswordField(INVALID_PASSWORD_LENGTH);
        kateSpade.createAccountPage.clickApplyButton();
        kateSpade.createAccountPage.checkFormValidation_with_IncorrectPasswordLength();
    }
}
