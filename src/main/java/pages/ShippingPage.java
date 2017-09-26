package pages;

import org.testng.Assert;
import utils.WebDriverWrapper;

/**
 * Created by Rus on 18.01.2017.
 */
public class ShippingPage extends Page {
    public ShippingPage(WebDriverWrapper dr) {
        super(dr);
    }

    public void fillFirstNameField(String firstName) {
        web.input("FirstNameField", firstName);

    }


    public void fillLastNameField(String lastName) {
        web.input("LastNameField", lastName);

    }

    public void fillAddressLine_1_Field(String address) {
        web.input("Address_1_Field", address);

    }

    public void fillAddressLine_2_Field(String address) {
        web.input("Address_2_Field", address);

    }

    public void fillCityField(String city) {
        web.input("CityField", city);

    }

    public void selectState(String state) {
        web.selectFromListByVisibleText("StateDropDown", state);

    }


    public void fillZipField(String zip) {
        web.input("ZipCodeField", zip);

    }

    public void fillPhoneField(String phone) {
        web.input("PhoneNumberField", phone);
    }

    public void selectUseTheSameAddressForBillingCheckbox() {
        web.selectCheckbox("UseTheSameAddressForBillingCheckbox", "Y");
    }

    public void switchToShippingMethodPage() {
        web.clickButton("ContinueToShippingMethodsButton");
        web.waitForElementPresent("ContinueToBillingButton");
        web.waitForElementToBeClickable("ContinueToBillingButton");

        if(web.isElementPresent("ContinueToBillingButton")
                && web.isElementAvailable("ContinueToBillingButton")) {
            log.info("Switching to Shipping Method page was correct");
        } else {
            log.error("Switching to Shipping Method page was INCORRECT!\n");
            Assert.fail("Switching to Shipping Method page was INCORRECT!");
        }
        //web.refreshPage();
        sleep(3000);
    }


    public void selectCountry(String country) {
        web.selectFromListByVisibleText("CountryDropDown", country);
    }

    public void fillEmailField(String email) {
        web.input("EmailFieldOfShippingPage", email);
    }

    public void switchToBillingPage() {
        web.clickButton("ContinueToPaymentButton");
        web.waitForElementPresent("CardNameField");
        web.waitForElementToBeClickable("CardNameField");

        if(web.isElementPresent("CardNameField")
                && web.isElementAvailable("CardNameField")) {
            log.info("Switching to Billing page was correct");
        } else {
            log.error("Switching to Billing page was INCORRECT!\n");
            Assert.fail("Switching to Billing page was INCORRECT!");
        }
    }

    public void select2DayShippingMethod() {
        web.clickElement("2DayShipping");
    }

    public void selectNextDayShippingMethod() {
        web.clickElement("NextDay");
    }
}
