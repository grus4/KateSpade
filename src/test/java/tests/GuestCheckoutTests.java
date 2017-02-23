package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Rus on 16.01.2017.
 */
public class GuestCheckoutTests extends Fixture {

    @Test
    public void guestCheckout_GroundShipping_VISA() {
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
        kateSpade.shippingPage.switchToBillingPage();
        kateSpade.billingPage.fillEmailField(EMAIL);
        kateSpade.billingPage.fillCardName(CARDNAME_VISA);
        kateSpade.billingPage.fillCardNumber(CARDNUMBER_VISA);
        kateSpade.billingPage.selectMonth(MONTH);
        kateSpade.billingPage.selectYear(YEAR);
        kateSpade.billingPage.fillSecurityCode(VISA_CVV);
        kateSpade.billingPage.switchToReviewPage();
        kateSpade.reviewPage.switchToOrderReceiptPage();
        Assert.assertTrue(kateSpade.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
        kateSpade.header.switchToHomePage();
    }

    @Test
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

    @Test
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

    @Test
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