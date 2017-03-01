package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Rus on 16.01.2017.
 */
public class GuestCheckoutTests extends Fixture {

    //@Test
    public void guestCheckout_FreeGround_VISA() {
        extentTest = extentReports
                .startTest("guestCheckout_FreeGround_VISA")
                .assignCategory("Smoke Testing");
        kateSpade.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Kate Spade Home Page");
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
        kateSpade.shoppingCartPage.switchToIframe();
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
        /*kateSpade.shippingPage.switchToBillingPage();
        kateSpade.billingPage.fillEmailField(EMAIL);
        kateSpade.billingPage.fillCardName(CARDNAME_VISA);
        kateSpade.billingPage.fillCardNumber(CARDNUMBER_VISA);
        kateSpade.billingPage.selectMonth(MONTH);
        kateSpade.billingPage.selectYear(YEAR);
        kateSpade.billingPage.fillSecurityCode(VISA_CVV);
        kateSpade.billingPage.switchToReviewPage();
        kateSpade.reviewPage.switchToOrderReceiptPage();
        Assert.assertTrue(kateSpade.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
        kateSpade.header.switchToHomePage();*/
    }

    //@Test
    public void guestCheckout_2DayExpress_MasterCard() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCLP();
        kateSpade.categoryLandingPage.switchToStandardPDP();
        kateSpade.standardPDP.addProductToCart();
        kateSpade.header.switchToShoppingCart();
        kateSpade.shoppingCartPage.switchToLoginCheckoutPage();
        kateSpade.checkoutLoginPage.switchToGuestShippingPage();
        kateSpade.shippingPage.fillFirstNameField(FIRSTNAME);
        kateSpade.shippingPage.fillLastNameField(LASTNAME);
        kateSpade.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        kateSpade.shippingPage.fillAddressLine_2_Field("");
        kateSpade.shippingPage.fillCityField(CITY);
        kateSpade.shippingPage.fillZipField(ZIP);
        kateSpade.shippingPage.selectState(STATE);
        kateSpade.shippingPage.fillPhoneField(PHONE);
        kateSpade.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        kateSpade.shippingPage.select2DayExpressShipping();
        kateSpade.shippingPage.switchToBillingPage();
        kateSpade.billingPage.fillEmailField(EMAIL);
        kateSpade.billingPage.fillCardName(CARDNAME_MASTERCARD);
        kateSpade.billingPage.selectCardType(CARD_TYPE_2);
        kateSpade.billingPage.fillCardNumber(CARDNUMBER_MASTERCARD);
        kateSpade.billingPage.selectMonth(MONTH);
        kateSpade.billingPage.selectYear(YEAR);
        kateSpade.billingPage.fillSecurityCode(MASTERCARD_CVV);
        kateSpade.billingPage.switchToReviewPage();
        kateSpade.reviewPage.switchToOrderReceiptPage();
        Assert.assertTrue(kateSpade.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
        kateSpade.header.switchToHomePage();
    }

    //@Test
    public void guestCheckout_Overnight_AmericanExpress() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCLP();
        kateSpade.categoryLandingPage.switchToStandardPDP();
        kateSpade.standardPDP.addProductToCart();
        kateSpade.header.switchToShoppingCart();
        kateSpade.shoppingCartPage.switchToLoginCheckoutPage();
        kateSpade.checkoutLoginPage.switchToGuestShippingPage();
        kateSpade.shippingPage.fillFirstNameField(FIRSTNAME);
        kateSpade.shippingPage.fillLastNameField(LASTNAME);
        kateSpade.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        kateSpade.shippingPage.fillAddressLine_2_Field("");
        kateSpade.shippingPage.fillCityField(CITY);
        kateSpade.shippingPage.fillZipField(ZIP);
        kateSpade.shippingPage.selectState(STATE);
        kateSpade.shippingPage.fillPhoneField(PHONE);
        kateSpade.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        kateSpade.shippingPage.selectOvernightShipping();
        kateSpade.shippingPage.switchToBillingPage();
        kateSpade.billingPage.fillEmailField(EMAIL);
        kateSpade.billingPage.fillCardName(CARDNAME_AMEX);
        kateSpade.billingPage.selectCardType(CARD_TYPE_3);
        kateSpade.billingPage.fillCardNumber(CARDNUMBER_AMEX);
        kateSpade.billingPage.selectMonth(MONTH);
        kateSpade.billingPage.selectYear(YEAR);
        kateSpade.billingPage.fillSecurityCode(AMEX_CVV);
        kateSpade.billingPage.switchToReviewPage();
        kateSpade.reviewPage.switchToOrderReceiptPage();
        Assert.assertTrue(kateSpade.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
         kateSpade.header.switchToHomePage();
    }

    //@Test
    public void guestCheckout_2DayExpress_Discover() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCLP();
        kateSpade.categoryLandingPage.switchToStandardPDP();
        kateSpade.standardPDP.addProductToCart();
        kateSpade.header.switchToShoppingCart();
        kateSpade.shoppingCartPage.switchToLoginCheckoutPage();
        kateSpade.checkoutLoginPage.switchToGuestShippingPage();
        kateSpade.shippingPage.fillFirstNameField(FIRSTNAME);
        kateSpade.shippingPage.fillLastNameField(LASTNAME);
        kateSpade.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        kateSpade.shippingPage.fillAddressLine_2_Field("");
        kateSpade.shippingPage.fillCityField(CITY);
        kateSpade.shippingPage.fillZipField(ZIP);
        kateSpade.shippingPage.selectState(STATE);
        kateSpade.shippingPage.fillPhoneField(PHONE);
        kateSpade.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        kateSpade.shippingPage.select2DayExpressShipping();
        kateSpade.shippingPage.switchToBillingPage();
        kateSpade.billingPage.fillEmailField(EMAIL);
        kateSpade.billingPage.fillCardName(CARDNAME_DISCOVER);
        kateSpade.billingPage.selectCardType(CARD_TYPE_4);
        kateSpade.billingPage.fillCardNumber(CARDNUMBER_DISCOVER);
        kateSpade.billingPage.selectMonth(MONTH);
        kateSpade.billingPage.selectYear(YEAR);
        kateSpade.billingPage.fillSecurityCode(DISCOVER_CVV);
        kateSpade.billingPage.switchToReviewPage();
        kateSpade.reviewPage.switchToOrderReceiptPage();
        Assert.assertTrue(kateSpade.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
        kateSpade.header.switchToHomePage();
    }
}
