package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

/**
 * Created by Rus on 24.11.2016.
 */
public class LoginTests extends Fixture {


    @Test
    public void loginWithValidData() {
        extentTest = extentReports
                .startTest("loginWithValidData")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.header.openLoginForm();
        extentTest.log(LogStatus.INFO, "Open Login Form");
        kateSpade.loginPage.fillEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill Email field");
        kateSpade.loginPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill Password Field");
        kateSpade.loginPage.switchToMyAccount();
        extentTest.log(LogStatus.INFO, "Switch to My Account page");
        kateSpade.header.checkCongratulationMessage();
        extentTest.log(LogStatus.INFO, "Login to My Account was correct and congratulation link is displayed correctly");
        kateSpade.header.logout();
        extentTest.log(LogStatus.INFO, "Logout from MyAccount");
    }

    @Test
    public void emptyFieldsValidationFotLoginForm() {
        extentTest = extentReports
                .startTest("emptyFieldsValidationFotLoginForm")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.header.openLoginForm();
        extentTest.log(LogStatus.INFO, "Open Login Form");
        kateSpade.loginPage.clickSignInButton();
        extentTest.log(LogStatus.INFO, "Leave empty fields and click the Sign In Button");
        kateSpade.loginPage.checkValidationForAllEptyFields();
        extentTest.log(LogStatus.INFO, "Validation message appears under each field");
    }

    @Test
    public void invalidDataValidationForEmailWithMissingAt() {
        extentTest = extentReports
                .startTest("invalidDataValidationForEmailWithMissingAt")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.header.openLoginForm();
        extentTest.log(LogStatus.INFO, "Open Login Form");
        kateSpade.loginPage.fillEmailField(INVALID_EMAIL_MISSING_AT);
        extentTest.log(LogStatus.INFO, "Fill in an invalid email with missing at");
        kateSpade.loginPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in a valid password");
        kateSpade.loginPage.clickSignInButton();
        extentTest.log(LogStatus.INFO, "Click the Sign In Button");
        kateSpade.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the email field");
    }

    @Test
    public void invalidDataValidationForEmailFieldWithMissingAddress() {
        extentTest = extentReports
                .startTest("invalidDataValidationForEmailFieldWithMissingAddress")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.header.openLoginForm();
        extentTest.log(LogStatus.INFO, "Open Login Form");
        kateSpade.loginPage.fillEmailField(INVALID_EMAIL_MISSING_ADDRESS);
        extentTest.log(LogStatus.INFO, "Fill in an invalid email with missing address");
        kateSpade.loginPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in a valid password");
        kateSpade.loginPage.clickSignInButton();
        extentTest.log(LogStatus.INFO, "Click the Sign In Button");
        kateSpade.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the email field");
    }

    @Test
    public void invalidDataValidationForEmailFieldWithSuperfluousText() {
        extentTest = extentReports
                .startTest("invalidDataValidationForEmailFieldWithSuperfluousText")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.header.openLoginForm();
        extentTest.log(LogStatus.INFO, "Open Login Form");
        kateSpade.loginPage.fillEmailField(INVALID_EMAIL_SUPERFLUOUS_TEXT);
        extentTest.log(LogStatus.INFO, "Fill in an invalid email with SUPERFLUOUS_TEXT");
        kateSpade.loginPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in a valid password");
        kateSpade.loginPage.clickSignInButton();
        extentTest.log(LogStatus.INFO, "Click the Sign In Button");
        kateSpade.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the email field");
    }

    @Test
    public void invalidDataValidationForEmailFieldCopyPasteFromAddressBookWithName() {
        extentTest = extentReports
                .startTest("invalidDataValidationForEmailFieldCopyPasteFromAddressBookWithName")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.header.openLoginForm();
        extentTest.log(LogStatus.INFO, "Open Login Form");
        kateSpade.loginPage.fillEmailField(INVALID_EMAIL_COPY_PASTE_FROM_ADDRESS_BOOK_WITH_NAME);
        extentTest.log(LogStatus.INFO, "Fill in an invalid email with COPY_PASTE_FROM_ADDRESS_BOOK_WITH_NAME");
        kateSpade.loginPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in a valid password");
        kateSpade.loginPage.clickSignInButton();
        extentTest.log(LogStatus.INFO, "Click the Sign In Button");
        kateSpade.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the email field");
    }

    @Test
    public void invalidDataValidationForEmailFieldWithTwoAt() {
        extentTest = extentReports
                .startTest("invalidDataValidationForEmailFieldWithTwoAt")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.header.openLoginForm();
        extentTest.log(LogStatus.INFO, "Open Login Form");
        kateSpade.loginPage.fillEmailField(INVALID_EMAIL_COPY_WITH_TWO_AT);
        extentTest.log(LogStatus.INFO, "Fill in an INVALID_EMAIL_COPY_WITH_TWO_AT");
        kateSpade.loginPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in a valid password");
        kateSpade.loginPage.clickSignInButton();
        extentTest.log(LogStatus.INFO, "Click the Sign In Button");
        kateSpade.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the email field");
    }

    @Test
    public void invalidDataValidationForEmailFieldSpecialCharacters() {
        extentTest = extentReports
                .startTest("invalidDataValidationForEmailFieldSpecialCharacters")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.header.openLoginForm();
        extentTest.log(LogStatus.INFO, "Open Login Form");
        kateSpade.loginPage.fillEmailField(INVALID_EMAIL_SPECIAL_CHARACTERS);
        extentTest.log(LogStatus.INFO, "Fill in an INVALID_EMAIL_SPECIAL_CHARACTERS");
        kateSpade.loginPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in a valid password");
        kateSpade.loginPage.clickSignInButton();
        extentTest.log(LogStatus.INFO, "Click the Sign In Button");
        kateSpade.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the email field");
    }


    @Test
    public void invalidDataValidationForPasswordField() {
        extentTest = extentReports
                .startTest("invalidDataValidationForPasswordField")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.header.openLoginForm();
        extentTest.log(LogStatus.INFO, "Open Login Form");
        kateSpade.loginPage.fillEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in a valid email");
        kateSpade.loginPage.fillPasswordField(INVALID_PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in an invalid password");
        kateSpade.loginPage.clickSignInButton();
        extentTest.log(LogStatus.INFO, "Click the Sign In Button");
        kateSpade.loginPage.checkValidationForInvalidPassword();
        extentTest.log(LogStatus.INFO, "Validation message appears under the password field");
    }

    @Test
    public void invalidDataValidationForEmailAndPasswordFields(){
        extentTest = extentReports
                .startTest("invalidDataValidationForEmailAndPasswordFields")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.header.openLoginForm();
        extentTest.log(LogStatus.INFO, "Open Login Form");
        kateSpade.loginPage.fillEmailField(INVALID_EMAIL_MISSING_AT);
        extentTest.log(LogStatus.INFO, "Fill in an INVALID_EMAIL_MISSING_AT");
        kateSpade.loginPage.fillPasswordField(INVALID_PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in an invalid password");
        kateSpade.loginPage.clickSignInButton();
        extentTest.log(LogStatus.INFO, "Click the Sign In Button");
        kateSpade.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the email field");
    }
}
