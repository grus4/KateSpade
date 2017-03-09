package tests;

import org.testng.Assert;

/**
 * Created by Rus on 18.01.2017.
 */
public class CheckoutRegisteredUser extends Fixture {

    //@Test
    public void checkoutAsRegisteredUser_OvernightShipping_Visa() {
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCLP();
        kateSpade.categoryLandingPage.switchToVariationPDP();
        kateSpade.variationPDP.addVariationProductToCart();
        kateSpade.header.switchToShoppingCart();
        kateSpade.shoppingCartPage.switchToLoginCheckoutPage();
        kateSpade.checkoutLoginPage.fillEmailField(EMAILFORREGISTEREDUSER);
        kateSpade.checkoutLoginPage.fillPasswordField(PASSWORDFORREGISTEREDUSER);
        kateSpade.checkoutLoginPage.logInAsRegisteredUser();
        kateSpade.shippingPage.fillFirstNameField(FIRSTNAME);
        kateSpade.shippingPage.fillLastNameField(LASTNAME);
        kateSpade.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        kateSpade.shippingPage.fillAddressLine_2_Field("");
        kateSpade.shippingPage.fillCityField(CITY);
        kateSpade.shippingPage.fillZipField(ZIP);
        kateSpade.shippingPage.selectState(STATE);
        kateSpade.shippingPage.fillPhoneField(PHONE);
        kateSpade.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        kateSpade.shippingPage.switchToShippingMethodPage();
        kateSpade.billingPage.fillCardName(CARDNAME_VISA);
        kateSpade.billingPage.fillCardNumberRegisteredUser(CARDNUMBER_VISA);
        kateSpade.billingPage.selectMonth(MONTH);
        kateSpade.billingPage.selectYear(YEAR);
        kateSpade.billingPage.fillSecurityCodeRegisteredUser(VISA_CVV);
        kateSpade.billingPage.switchToReviewPage();
        kateSpade.reviewPage.switchToOrderReceiptPage();
        Assert.assertTrue(kateSpade.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
        kateSpade.header.switchToHomePage();
    }

    //@Test
    public void checkoutAsRegisteredUser_GroundShipping_MasterCard(){
        kateSpade.homePage.openPage(SITE_URL);
        kateSpade.header.switchToCLP();
        kateSpade.categoryLandingPage.switchToVariationPDP();
        kateSpade.variationPDP.addVariationProductToCart();
        kateSpade.header.switchToShoppingCart();
        kateSpade.shoppingCartPage.switchToLoginCheckoutPage();
        kateSpade.checkoutLoginPage.fillEmailField(EMAILFORREGISTEREDUSER);
        kateSpade.checkoutLoginPage.fillPasswordField(PASSWORDFORREGISTEREDUSER);
        kateSpade.checkoutLoginPage.logInAsRegisteredUser();
        kateSpade.shippingPage.fillFirstNameField(FIRSTNAME);
        kateSpade.shippingPage.fillLastNameField(LASTNAME);
        kateSpade.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        kateSpade.shippingPage.fillAddressLine_2_Field("");
        kateSpade.shippingPage.fillCityField(CITY);
        kateSpade.shippingPage.fillZipField(ZIP);
        kateSpade.shippingPage.selectState(STATE);
        kateSpade.shippingPage.fillPhoneField(PHONE);
        kateSpade.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        kateSpade.shippingPage.switchToShippingMethodPage();
        kateSpade.billingPage.fillCardName(CARDNAME_MASTERCARD);
        kateSpade.billingPage.selectCardType(CARD_TYPE_2);
        kateSpade.billingPage.fillCardNumberRegisteredUser(CARDNUMBER_MASTERCARD);
        kateSpade.billingPage.selectMonth(MONTH);
        kateSpade.billingPage.selectYear(YEAR);
        kateSpade.billingPage.fillSecurityCodeRegisteredUser(MASTERCARD_CVV);
        kateSpade.billingPage.switchToReviewPage();
        kateSpade.reviewPage.switchToOrderReceiptPage();
        Assert.assertTrue(kateSpade.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
        kateSpade.header.switchToHomePage();
    }
}
