package pages;

import org.testng.Assert;
import utils.WebDriverWrapper;

/**
 * Created by Rus on 27.11.2016.
 */
public class CreateAccountPage extends Page{

    public CreateAccountPage(WebDriverWrapper dr) {
        super(dr);
    }


    public void fillFirstNameField(String firstName) {
        web.input("FirstName", firstName);
    }

    public void fillLastNameField(String lastName) {
        web.input("LastName", lastName);
    }

    public void fillEmailAndConfirmEmailFields(String email) {
        String newEmail = web.generateRandomEmail(email);
        web.input("EmailField", newEmail);
        web.input("ConfirmEmailField", newEmail);
    }

    public void fillPasswordField(String password) {
        web.input("Password", password);
    }

    public void fillConfirmPasswordField(String password) {
        web.input("ConfirmPassword", password);
    }

    public void clickSubmitButton() {
        web.clickButton("SubmitButton");
    }

    public void checkValidationForAllEmptyFields() {
        checkValidationForEmptyFirstNameField();
        checkValidationForEmptyLastNameField();
        checkValidationForEmptyEmailField();
        checkValidationForEmptyConfirmEmailField();
        checkValidationForEmptyPasswordField();
        checkValidationForEmptyConfirmPasswordField();
        checkValidationForEmptyZipField();
    }

    private void checkValidationForEmptyZipField() {
        if(web.isElementPresent("ErrorMessageForEmptyZipField")
                && web.getElementText("ErrorMessageForEmptyZipField").toLowerCase().equals("please enter a zip code")){
            log.info("Zip Field Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("Zip Field Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is ErrorMessageForEmptyZipField present - " + web.isElementPresent("ErrorMessageForEmptyZipField") + "\n"
                    + "ErrorMessageForEmptyZipField - " + web.getElementText("ErrorMessageForEmptyZipField"));
            Assert.fail("Zip Field Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is ErrorMessageForEmptyZipField present - " + web.isElementPresent("ErrorMessageForEmptyZipField") + "\n"
                    + "ErrorMessageForEmptyZipField - " + web.getElementText("ErrorMessageForEmptyZipField"));
        }
    }

    public void checkValidationForEmptyFirstNameField(){
        if(web.isElementPresent("ErrorMessageForEmptyFirstNameField")
                && web.getElementText("ErrorMessageForEmptyFirstNameField").toLowerCase().equals("please enter a first name")){
            log.info("First Name Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("First Name Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is FirstNameErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyFirstNameField") + "\n"
                    + "FirstNameErrorMessage - " + web.getElementText("ErrorMessageForEmptyFirstNameField"));
            Assert.fail("First Name Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is FirstNameErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyFirstNameField") + "\n"
                    + "FirstNameErrorMessage - " + web.getElementText("ErrorMessageForEmptyFirstNameField"));
        }
    }

    public void checkValidationForEmptyLastNameField(){
        if(web.isElementPresent("ErrorMessageForEmptyLastNameField")
                && web.getElementText("ErrorMessageForEmptyLastNameField").toLowerCase().equals("please enter a last name")){
            log.info("Last Name Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("Last Name Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is LastNameErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyLastNameField") + "\n"
                    + "LastNameErrorMessage - " + web.getElementText("ErrorMessageForEmptyLastNameField"));
            Assert.fail("Last Name Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is LastNameErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyLastNameField") + "\n"
                    + "LastNameErrorMessage - " + web.getElementText("ErrorMessageForEmptyLastNameField"));

        }
    }

    public void checkValidationForEmptyEmailField(){
        if(web.isElementPresent("ErrorMessageForEmptyEmail")
                && web.getElementText("ErrorMessageForEmptyEmail").toLowerCase().equals("please enter an email.")){
            log.info("Email Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("Email Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is EmailNameErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyEmail") + "\n"
                    + "EmailNameErrorMessage - " + web.getElementText("ErrorMessageForEmptyEmail"));
            Assert.fail("Email Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is EmailNameErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyEmail") + "\n"
                    + "EmailNameErrorMessage - " + web.getElementText("ErrorMessageForEmptyEmail"));

        }
    }

    public void checkValidationForEmptyConfirmEmailField(){
        if(web.isElementPresent("ErrorMessageForEmptyConfirmEmail")
                && web.getElementText("ErrorMessageForEmptyConfirmEmail").toLowerCase().equals("please enter an email confirmation")){
            log.info("Confirm Email Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("Confirm Email Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is ConfirmEmailErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyConfirmEmail") + "\n"
                    + "ConfirmEmailErrorMessage - " + web.getElementText("ErrorMessageForEmptyConfirmEmail"));
            Assert.fail("Confirm Email Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is ConfirmEmailErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyConfirmEmail") + "\n"
                    + "ConfirmEmailErrorMessage - " + web.getElementText("ErrorMessageForEmptyConfirmEmail"));

        }
    }

    public void checkValidationForEmptyPasswordField(){
        if(web.isElementPresent("ErrorMessageForEmptyPassword")
                && web.getElementText("ErrorMessageForEmptyPassword").toLowerCase().equals("please enter a password")){
            log.info("Password Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("Password Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is PasswordErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyPassword") + "\n"
                    + "PasswordErrorMessage - " + web.getElementText("ErrorMessageForEmptyPassword"));
            Assert.fail("Password Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is PasswordErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyPassword") + "\n"
                    + "PasswordErrorMessage - " + web.getElementText("ErrorMessageForEmptyPassword"));

        }
    }

    public void checkValidationForEmptyConfirmPasswordField(){
        if(web.isElementPresent("ErrorMessageForEmptyConfirmPassword")
                && web.getElementText("ErrorMessageForEmptyConfirmPassword").toLowerCase().equals("please enter a password confirmation")){
            log.info("Confirm Password Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("Confirm Password Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is ConfirmPasswordErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyConfirmPassword") + "\n"
                    + "ConfirmPasswordErrorMessage - " + web.getElementText("ErrorMessageForEmptyConfirmPassword"));
            Assert.fail("Confirm Password Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is ConfirmPasswordErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyConfirmPassword") + "\n"
                    + "ConfirmPasswordErrorMessage - " + web.getElementText("ErrorMessageForEmptyConfirmPassword"));

        }
    }


    public void fillEmailField(String email) {
        web.input("EmailField", email);
    }

    public void fillConfirmEmailField(String confirmEmail) {
        web.input("ConfirmEmailField", confirmEmail);
    }

    public void checkFormValidation_Re_registerTheSameUser() {
        if(web.isElementPresent("ErrorMessageForTakenUserName")
                && web.getElementText("ErrorMessageForTakenUserName").toLowerCase().equals("email address already registered")) {
            log.info("Email address already registered message is displayed correctly");
        } else  {
            log.error("Email address already registered message is displayed INCORRECTLY!" + "\n"
            + "is ErrorMessageForTakenUserName present - " + web.isElementPresent("ErrorMessageForTakenUserName") + "\n"
            + "ErrorMessageForTakenUserName - " + web.getElementText("ErrorMessageForTakenUserName"));
            Assert.fail("Email address already registered message is displayed INCORRECTLY!" + "\n"
                    + "is ErrorMessageForTakenUserName present - " + web.isElementPresent("ErrorMessageForTakenUserName") + "\n"
                    + "ErrorMessageForTakenUserName - " + web.getElementText("ErrorMessageForTakenUserName"));
        }
    }

    public void checkFormValidation_with_DifferentEmail_in_Email__and_ConfirmEmail_Fields() {
        if(web.isElementPresent("ErrorMessageMismatchingEmails")
                && web.getElementText("ErrorMessageMismatchingEmails").toLowerCase().equals("the provided emails do not match.")){
            log.info("Error Message for Mismatching emails is displayed correctly");
        } else {
            log.error("Error Message for Mismatching emails is displayed INCORRECTLY!" + "\n"
            + "is Error Message for Mismatching emails present - " + web.isElementPresent("ErrorMessageMismatchingEmails") + "\n"
            + "Error Message for Mismatching emails - " + web.getElementText("ErrorMessageMismatchingEmails"));
            Assert.fail("Error Message for Mismatching emails is displayed INCORRECTLY!" + "\n"
                    + "is Error Message for Mismatching emails present - " + web.isElementPresent("ErrorMessageMismatchingEmails") + "\n"
                    + "Error Message for Mismatching emails - " + web.getElementText("ErrorMessageMismatchingEmails"));
        }

    }

    public void checkFormValidation_with_DifferentPassword_And_ConfirmPassword() {
        if(web.isElementPresent("ErrorMessageMismatchingPasswordAndConfirmPassword")
                && web.getElementText("ErrorMessageMismatchingPasswordAndConfirmPassword").toLowerCase().equals("the provided passwords do not match.")){
            log.info("Error message for mismatching passwords in the Password and Confirm Password fields is displayed");
        } else {
            log.error("Error message for mismatching passwords in the Password and Confirm Password fields is displayed INCORRECTLY!" + "\n"
            + "is Error message for mismatching passwords present - " + web.isElementPresent("ErrorMessageMismatchingPasswordAndConfirmPassword") + "\n"
            + "Error message for mismatching passwords - " + web.getElementText("ErrorMessageMismatchingPasswordAndConfirmPassword"));
            Assert.fail("Error message for mismatching passwords in the Password and Confirm Password fields is displayed INCORRECTLY!" + "\n"
                    + "is Error message for mismatching passwords present - " + web.isElementPresent("ErrorMessageMismatchingPasswordAndConfirmPassword") + "\n"
                    + "Error message for mismatching passwords - " + web.getElementText("ErrorMessageMismatchingPasswordAndConfirmPassword"));
        }
    }

    public void checkFormValidation_with_IncorrectPasswordLength() {
        if(web.isElementPresent("ErrorMessageForIncorrectPasswordLength")
                && web.getElementText("ErrorMessageForIncorrectPasswordLength").equals("7 - 20 characters")){
            log.info("Error message for incorrect Password length is displayed");
        } else {
            log.error("Error message for incorrect Password length is displayed INCORRECTLY!" + "\n"
            + "is Error message for incorrect Password length present - " + web.isElementPresent("ErrorMessageForIncorrectPasswordLength") + "\n"
            + "Error message for incorrect Password length - " + web.getElementText("ErrorMessageForIncorrectPasswordLength"));
            Assert.fail("Error message for incorrect Password length is displayed INCORRECTLY!" + "\n"
                    + "is Error message for incorrect Password length present - " + web.isElementPresent("ErrorMessageForIncorrectPasswordLength") + "\n"
                    + "Error message for incorrect Password length - " + web.getElementText("ErrorMessageForIncorrectPasswordLength"));
        }
    }

    public void fillZipCodeField(String zip) {
        web.input("ZipCode", zip);
    }

    public void switchToNewAccount() {
        web.clickButton("SubmitButton");
        web.waitForElementPresent("CongratulationLink");
        web.waitForElementToBeClickable("CongratulationLink");

    }
}
