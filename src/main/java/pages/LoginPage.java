package pages;

import org.testng.Assert;
import utils.WebDriverWrapper;

/**
 * Created by Rus on 25.11.2016.
 */
public class LoginPage extends Page {
    public LoginPage(WebDriverWrapper dr) {
        super(dr);
    }

    public void fillEmailField(String email) {
        web.input("EmailAddressField", email);
    }

    public void fillPasswordField(String password) {
        web.input("PasswordField", password);
    }

    public void switchToMyAccount() {
        web.clickButton("SigInButton");
    }

    public void clickSignInButton() {
        web.clickButton("SigInButton");
        sleep(3000);

    }

    public void checkValidationForEmailAddressEmptyField() {
        if(web.isElementPresent("ErrorMessageForEmptyEmailField")
                && web.getElementText("ErrorMessageForEmptyEmailField").equals("required")){
            log.info("Email Address Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("Email Address Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is EmailAddressErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyEmailField") + "\n"
                    + "EmailAddressErrorMessage - " + web.getElementText("ErrorMessageForEmptyEmailField"));
            Assert.fail("Email Address Error Message is displayed INCORRECTLY" + "\n"
                    + "is EmailAddressErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyEmailField") + "\n"
                    + "EmailAddressErrorMessage - " + web.getElementText("ErrorMessageForEmptyEmailField"));

        }
    }

    public void checkValidationForPasswordEmptyField() {
        if(web.isElementPresent("ErrorMessageForPasswordField")
                && web.getElementText("ErrorMessageForPasswordField").equals("required")){
            log.info("Password Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("Password Error Message for empty field is displayed INCORRECTLY!" + "\n"
            + "is PasswordErrorMessage present - " + web.isElementPresent("ErrorMessageForPasswordField") + "\n"
            + "PasswordErrorMessage - " + web.getElementText("ErrorMessageForPasswordField"));
            Assert.fail("Password Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is PasswordErrorMessage present - " + web.isElementPresent("ErrorMessageForPasswordField") + "\n"
                    + "PasswordErrorMessage - " + web.getElementText("ErrorMessageForPasswordField"));
        }
    }

    public void checkValidationForAllEptyFields() {
        checkValidationForEmailAddressEmptyField();
        checkValidationForPasswordEmptyField();
    }

    public void checkValidationForInvalidData() {
        if(web.isElementPresent("ErrorMessageForInvalidDataInEmailField")
                && web.getElementText("ErrorMessageForInvalidDataInEmailField").equals("please enter a valid email address.")){
            log.info("Error message for Invalid Data in Email field is displayed correctly above the Login Form");
        } else {
            log.error("Error message for Invalid Data in Email field is displayed INCORRETLY!" + "\n"
            + "is ErrorMessageForInvalidDataInEmailField in Email Field present - " + web.isElementPresent("ErrorMessageForInvalidDataInEmailField") + "\n"
            + "ErrorMessageForInvalidDataInEmailField in Email Field - " + web.getElementText("ErrorMessageForInvalidDataInEmailField"));
            Assert.fail("Error message for Invalid Data in Email field is displayed INCORRETLY!" + "\n"
                    + "is ErrorMessageForInvalidDataInEmailField in Email Field present - " + web.isElementPresent("ErrorMessageForInvalidDataInEmailField") + "\n"
                    + "ErrorMessageForInvalidDataInEmailField in Email Field - " + web.getElementText("ErrorMessageForInvalidDataInEmailField"));
        }
    }


    public void checkCongratulationMessage() {

        if(web.isElementPresent("CongratulationLink")
                && web.getElementText("CongratulationLink").equals("hi, Max")) {
            log.info("Congratulation Message is displayed correctly");
        } else {
            log.error("Congratulation Message is displayed INCORRECTLY!!" + "\n"
            + "is Congratulation Message present - " + web.isElementPresent("CongratulationLink") + "\n"
            + "Congatulation Message - " + web.getElementText("CongratulationLink"));
            Assert.fail("Congratulation Message is displayed INCORRECTLY!!" + "\n"
                    + "is Congratulation Message present - " + web.isElementPresent("CongratulationLink") + "\n"
                    + "Congatulation Message - " + web.getElementText("CongratulationLink"));
        }
    }

    public void checkValidationForInvalidPassword() {
        if(web.isElementPresent("ErrorMessageForInvalidDataInPasswordField")
                && web.getElementText("ErrorMessageForInvalidDataInPasswordField").toLowerCase().equals("sorry, this does not match our records. check your spelling and try again.")){
            log.info("Error message for Invalid Data in Password field is displayed correctly");
        } else {
            log.error("Error message for Invalid Data in Password field is displayed INCORRETLY!" + "\n"
                    + "is ErrorMessageForInvalidDataInPasswordField in Email Field present - " + web.isElementPresent("ErrorMessageForInvalidDataInPasswordField") + "\n"
                    + "ErrorMessageForInvalidDataInPasswordField in Email Field - " + web.getElementText("ErrorMessageForInvalidDataInPasswordField"));





            Assert.fail("Error message for Invalid Data in Password field is displayed INCORRETLY!" + "\n"
                    + "is ErrorMessageForInvalidDataInPasswordField in Email Field present - " + web.isElementPresent("ErrorMessageForInvalidDataInPasswordField") + "\n"
                    + "ErrorMessageForInvalidDataInPasswordField in Email Field - " + web.getElementText("ErrorMessageForInvalidDataInPasswordField"));
        }
    }
}
