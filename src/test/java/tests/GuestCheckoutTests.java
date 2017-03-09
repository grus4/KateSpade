package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Rus on 16.01.2017.
 */

public class GuestCheckoutTests extends Fixture {

    @Test
    public void guestCheckout_FreeGround_VISA() {
        extentTest = extentReports
                .startTest("guestCheckout_FreeGround_VISA")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.homePage.refreshPage();
        extentTest.log(LogStatus.INFO, "Refresh Home Page");
        kateSpade.header.switchToCLP();
        extentTest.log(LogStatus.INFO, "Switch to CLP");
        kateSpade.categoryLandingPage.openQuickViewHopup();
        extentTest.log(LogStatus.INFO, "Open quick view hopup of the first product in the grid");
        kateSpade.quickViewHopup.clickAddToBagButton();
        extentTest.log(LogStatus.INFO, "Add product to the mini cart");
        kateSpade.header.switchToShoppingCart();
        extentTest.log(LogStatus.INFO, "Switching to the Shopping cart");
        kateSpade.shoppingCartPage.switchToShippingPage();
        extentTest.log(LogStatus.INFO, "Switching to the Shipping cart");
        kateSpade.shippingPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the  First Name field on the Shipping page");
        kateSpade.shippingPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field on the Shipping page");
        kateSpade.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        extentTest.log(LogStatus.INFO, "Fill in the address field");
        kateSpade.shippingPage.fillAddressLine_2_Field("");
        kateSpade.shippingPage.selectCountry(COUNTRY);
        extentTest.log(LogStatus.INFO, "Select Country from the drop down field");
        kateSpade.shippingPage.fillCityField(CITY);
        extentTest.log(LogStatus.INFO, "Fill in the city field");
        kateSpade.shippingPage.selectState(STATE);
        extentTest.log(LogStatus.INFO, "Select state from the drop down field");
        kateSpade.shippingPage.fillZipField(ZIP);
        extentTest.log(LogStatus.INFO, "Fill in the zip field");
        kateSpade.shippingPage.fillPhoneField(PHONE);
        extentTest.log(LogStatus.INFO, "Fill in the phone field");
        kateSpade.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        extentTest.log(LogStatus.INFO, "Check the This is also my billing address checkbox");
        kateSpade.shippingPage.switchToShippingMethodPage();
        extentTest.log(LogStatus.INFO, "Switching to Shipping Methods page");
        kateSpade.shippingMethodsPage.switchToBillingPage();
        extentTest.log(LogStatus.INFO, "Switching to Billing page");
        kateSpade.billingPage.selectCreditCardRadioButton();
        extentTest.log(LogStatus.INFO, "Select Credit Card radio button");
        kateSpade.billingPage.fillCardName(CARDNAME_VISA);
        extentTest.log(LogStatus.INFO, "Fill in the Card Name field");
        kateSpade.billingPage.fillCardNumber(CARDNUMBER_VISA);
        extentTest.log(LogStatus.INFO, "Fill in the Card Number field");
        kateSpade.billingPage.selectMonth(MONTH);
        extentTest.log(LogStatus.INFO, "Select month from the drop down field");
        kateSpade.billingPage.selectYear(YEAR);
        extentTest.log(LogStatus.INFO, "Select year from the drop down field");
        kateSpade.billingPage.fillSecurityCode(VISA_CVV);
        extentTest.log(LogStatus.INFO, "Fill in the CVV field with correct data");
        kateSpade.billingPage.fillEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the email field on Billing page");

    }

    @Test
    public void guestCheckout_2DayExpress_MasterCard() {
        extentTest = extentReports
                .startTest("guestCheckout_2DayExpress_MasterCard")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.homePage.refreshPage();
        extentTest.log(LogStatus.INFO, "Refresh Home Page");
        kateSpade.header.switchToCLP();
        extentTest.log(LogStatus.INFO, "Switch to CLP");
        kateSpade.categoryLandingPage.openQuickViewHopup();
        extentTest.log(LogStatus.INFO, "Open quick view hopup of the first product in the grid");
        kateSpade.quickViewHopup.clickAddToBagButton();
        extentTest.log(LogStatus.INFO, "Add product to the mini cart");
        kateSpade.header.switchToShoppingCart();
        extentTest.log(LogStatus.INFO, "Switching to the Shopping cart");
        kateSpade.shoppingCartPage.switchToShippingPage();
        extentTest.log(LogStatus.INFO, "Switching to the Shipping cart");
        kateSpade.shippingPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the  First Name field on the Shipping page");
        kateSpade.shippingPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field on the Shipping page");
        kateSpade.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        extentTest.log(LogStatus.INFO, "Fill in the address field");
        kateSpade.shippingPage.fillAddressLine_2_Field("");
        kateSpade.shippingPage.selectCountry(COUNTRY);
        extentTest.log(LogStatus.INFO, "Select Country from the drop down field");
        kateSpade.shippingPage.fillCityField(CITY);
        extentTest.log(LogStatus.INFO, "Fill in the city field");
        kateSpade.shippingPage.selectState(STATE);
        extentTest.log(LogStatus.INFO, "Select state from the drop down field");
        kateSpade.shippingPage.fillZipField(ZIP);
        extentTest.log(LogStatus.INFO, "Fill in the zip field");
        kateSpade.shippingPage.fillPhoneField(PHONE);
        extentTest.log(LogStatus.INFO, "Fill in the phone field");
        kateSpade.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        extentTest.log(LogStatus.INFO, "Check the This is also my billing address checkbox");
        kateSpade.shippingPage.switchToShippingMethodPage();
        extentTest.log(LogStatus.INFO, "Switching to Shipping Methods page");
        kateSpade.shippingMethodsPage.select2DayShippingMethod();
        extentTest.log(LogStatus.INFO, "Select the 2Day Shipping method from the drop down menu");
        kateSpade.shippingMethodsPage.switchToBillingPage();
        extentTest.log(LogStatus.INFO, "Switching to Billing page");
        kateSpade.billingPage.selectCreditCardRadioButton();
        extentTest.log(LogStatus.INFO, "Select Credit Card radio button");
        kateSpade.billingPage.selectCardType(CARD_TYPE_2);
        extentTest.log(LogStatus.INFO, "Select Master Card from the drop down menu");
        kateSpade.billingPage.fillCardName(CARDNAME_MASTERCARD);
        extentTest.log(LogStatus.INFO, "Fill in the Card Name field");
        kateSpade.billingPage.fillCardNumber(CARDNUMBER_MASTERCARD);
        extentTest.log(LogStatus.INFO, "Fill in the Card Number field");
        kateSpade.billingPage.selectMonth(MONTH);
        extentTest.log(LogStatus.INFO, "Select month from the drop down field");
        kateSpade.billingPage.selectYear(YEAR);
        extentTest.log(LogStatus.INFO, "Select year from the drop down field");
        kateSpade.billingPage.fillSecurityCode(MASTERCARD_CVV);
        extentTest.log(LogStatus.INFO, "Fill in the CVV field with correct data");
        kateSpade.billingPage.fillEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the email field on Billing page");
        kateSpade.billingPage.deleteAllCookies();
        kateSpade.billingPage.web.refreshPage2();
    }

    @Test
    public void guestCheckout_NextDay_AmericanExpress() {
        extentTest = extentReports
                .startTest("guestCheckout_Overnight_AmericanExpress")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.homePage.refreshPage();
        extentTest.log(LogStatus.INFO, "Refresh Home Page");
        kateSpade.header.switchToCLP();
        extentTest.log(LogStatus.INFO, "Switch to CLP");
        kateSpade.categoryLandingPage.openQuickViewHopup();
        extentTest.log(LogStatus.INFO, "Open quick view hopup of the first product in the grid");
        kateSpade.quickViewHopup.clickAddToBagButton();
        extentTest.log(LogStatus.INFO, "Add product to the mini cart");
        kateSpade.header.switchToShoppingCart();
        extentTest.log(LogStatus.INFO, "Switching to the Shopping cart");
        kateSpade.shoppingCartPage.switchToShippingPage();
        extentTest.log(LogStatus.INFO, "Switching to the Shipping cart");
        kateSpade.shippingPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the  First Name field on the Shipping page");
        kateSpade.shippingPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field on the Shipping page");
        kateSpade.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        extentTest.log(LogStatus.INFO, "Fill in the address field");
        kateSpade.shippingPage.fillAddressLine_2_Field("");
        kateSpade.shippingPage.selectCountry(COUNTRY);
        extentTest.log(LogStatus.INFO, "Select Country from the drop down field");
        kateSpade.shippingPage.fillCityField(CITY);
        extentTest.log(LogStatus.INFO, "Fill in the city field");
        kateSpade.shippingPage.selectState(STATE);
        extentTest.log(LogStatus.INFO, "Select state from the drop down field");
        kateSpade.shippingPage.fillZipField(ZIP);
        extentTest.log(LogStatus.INFO, "Fill in the zip field");
        kateSpade.shippingPage.fillPhoneField(PHONE);
        extentTest.log(LogStatus.INFO, "Fill in the phone field");
        kateSpade.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        extentTest.log(LogStatus.INFO, "Check the This is also my billing address checkbox");
        kateSpade.shippingPage.switchToShippingMethodPage();
        extentTest.log(LogStatus.INFO, "Switching to Shipping Methods page");
        kateSpade.shippingMethodsPage.selectNextDayShippingMethod();
        extentTest.log(LogStatus.INFO, "Select the Next Day Shipping method from the drop down menu");
        kateSpade.shippingMethodsPage.switchToBillingPage();
        extentTest.log(LogStatus.INFO, "Switching to Billing page");
        kateSpade.billingPage.selectCreditCardRadioButton();
        extentTest.log(LogStatus.INFO, "Select Credit Card radio button");
        kateSpade.billingPage.selectCardType(CARD_TYPE_3);
        extentTest.log(LogStatus.INFO, "Select American Express Card from the drop down menu");
        kateSpade.billingPage.fillCardName(CARDNAME_AMEX);
        extentTest.log(LogStatus.INFO, "Fill in the Card Name field");
        kateSpade.billingPage.fillCardNumber(CARDNUMBER_AMEX);
        extentTest.log(LogStatus.INFO, "Fill in the Card Number field");
        kateSpade.billingPage.selectMonth(MONTH);
        extentTest.log(LogStatus.INFO, "Select month from the drop down field");
        kateSpade.billingPage.selectYear(YEAR);
        extentTest.log(LogStatus.INFO, "Select year from the drop down field");
        kateSpade.billingPage.fillSecurityCode(AMEX_CVV);
        extentTest.log(LogStatus.INFO, "Fill in the CVV field with correct data");
        kateSpade.billingPage.fillEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the email field on Billing page");
        kateSpade.billingPage.deleteAllCookies();
        kateSpade.billingPage.web.refreshPage2();
    }

    @Test
    public void guestCheckout_2DayExpress_Discover() {
        extentTest = extentReports
                .startTest("guestCheckout_Overnight_AmericanExpress")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
        kateSpade.homePage.refreshPage();
        extentTest.log(LogStatus.INFO, "Refresh Home Page");
        kateSpade.header.switchToCLP();
        extentTest.log(LogStatus.INFO, "Switch to CLP");
        kateSpade.categoryLandingPage.openQuickViewHopup();
        extentTest.log(LogStatus.INFO, "Open quick view hopup of the first product in the grid");
        kateSpade.quickViewHopup.clickAddToBagButton();
        extentTest.log(LogStatus.INFO, "Add product to the mini cart");
        kateSpade.header.switchToShoppingCart();
        extentTest.log(LogStatus.INFO, "Switching to the Shopping cart");
        kateSpade.shoppingCartPage.switchToShippingPage();
        extentTest.log(LogStatus.INFO, "Switching to the Shipping cart");
        kateSpade.shippingPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the  First Name field on the Shipping page");
        kateSpade.shippingPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field on the Shipping page");
        kateSpade.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        extentTest.log(LogStatus.INFO, "Fill in the address field");
        kateSpade.shippingPage.fillAddressLine_2_Field("");
        kateSpade.shippingPage.selectCountry(COUNTRY);
        extentTest.log(LogStatus.INFO, "Select Country from the drop down field");
        kateSpade.shippingPage.fillCityField(CITY);
        extentTest.log(LogStatus.INFO, "Fill in the city field");
        kateSpade.shippingPage.selectState(STATE);
        extentTest.log(LogStatus.INFO, "Select state from the drop down field");
        kateSpade.shippingPage.fillZipField(ZIP);
        extentTest.log(LogStatus.INFO, "Fill in the zip field");
        kateSpade.shippingPage.fillPhoneField(PHONE);
        extentTest.log(LogStatus.INFO, "Fill in the phone field");
        kateSpade.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        extentTest.log(LogStatus.INFO, "Check the This is also my billing address checkbox");
        kateSpade.shippingPage.switchToShippingMethodPage();
        extentTest.log(LogStatus.INFO, "Switching to Shipping Methods page");
        kateSpade.shippingMethodsPage.select2DayShippingMethod();
        extentTest.log(LogStatus.INFO, "Select the 2Day Shipping method from the drop down menu");
        kateSpade.shippingMethodsPage.switchToBillingPage();
        extentTest.log(LogStatus.INFO, "Switching to Billing page");
        kateSpade.billingPage.selectCreditCardRadioButton();
        extentTest.log(LogStatus.INFO, "Select Credit Card radio button");
        kateSpade.billingPage.selectCardType(CARD_TYPE_4);
        extentTest.log(LogStatus.INFO, "Select Master Card from the drop down menu");
        kateSpade.billingPage.fillCardName(CARDNAME_DISCOVER);
        extentTest.log(LogStatus.INFO, "Fill in the Card Name field");
        kateSpade.billingPage.fillCardNumber(CARDNUMBER_DISCOVER);
        extentTest.log(LogStatus.INFO, "Fill in the Card Number field");
        kateSpade.billingPage.selectMonth(MONTH);
        extentTest.log(LogStatus.INFO, "Select month from the drop down field");
        kateSpade.billingPage.selectYear(YEAR);
        extentTest.log(LogStatus.INFO, "Select year from the drop down field");
        kateSpade.billingPage.fillSecurityCode(DISCOVER_CVV);
        extentTest.log(LogStatus.INFO, "Fill in the CVV field with correct data");
        kateSpade.billingPage.fillEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the email field on Billing page");
        kateSpade.billingPage.deleteAllCookies();
        kateSpade.billingPage.web.refreshPage2();
    }
}
