package pages;

import org.testng.Assert;
import utils.WebDriverWrapper;

/**
 * Created by Rus on 24.11.2016.
 */
public class Header extends Page {
    public Header(WebDriverWrapper dr) {
        super(dr);
    }

    public void openLoginForm() {
        web.clickElement("SignInLink");
        sleep(3000);
        web.waitForElementToBeClickable("EmailAddressField");
    }

    public void logout() {
        web.doFocusToElementAndClick("CongratulationLink", "LogOutButton");
    }

    public void switchToCreateAccountHopup() {
        web.clickElement("SignInLink");
        sleep(3000);
        web.waitForElementToBeClickable("EmailAddressField");
        web.waitForElementToBeClickable("CreateAnAccountButton");
        web.clickLink("CreateAnAccountButton");

        if(web.isElementPresent("SubmitButton")
                && web.isElementAvailable("SubmitButton")) {
            log.info("Switching to Create Account page was correct");
        } else {
            log.error("Switching to Create Account page was INCORRECT!\n");
            Assert.fail("Switching to Create Account page was INCORRECT!");
        }
    }

    public void switchToCLP() {
        web.moveToElementAndClick("ClothingCategory", "DressesSubcategory");
        web.waitForElementPresent("SortingDropDown");
        web.waitForElementToBeClickable("SortingDropDown");

        if(web.isElementPresent("SortingDropDown")
                && web.isElementAvailable("SortingDropDown")){
            log.info("Switching to CLP was correct");
        } else {
            log.info("Switching to CLP was INCORRECT!");
            Assert.fail("Switching to CLP was INCORRECT!");
        }
    }

    public void switchToShoppingCart() {
        web.moveToElementAndClick("CartIcon", "ViewCart");
        web.waitForElementPresent("BottomCheckoutButton");
        web.waitForElementToBeClickable("BottomCheckoutButton");

        if(web.isElementPresent("BottomCheckoutButton")
                && web.isElementAvailable("BottomCheckoutButton")){
            log.info("Switching to the Shopping Cart was correct");
        } else {
            log.error("Switching to the Shopping Cart was INCORRECT!\n");
            Assert.fail("Switching to the Shopping Cart was INCORRECT!");
        }
    }

    public void switchToHomePage() {
        web.clickElement("Logo");
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
}
