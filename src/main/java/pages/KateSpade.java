package pages;

import utils.ScreenShotMaker;
import utils.WebDriverWrapper;
import utils.WebElementsActions;

/**
 * Created by Rus on 22.02.2017.
 */
public class KateSpade {
    public WebElementsActions web;
    public ScreenShotMaker screenShotMaker;
    public HomePage homePage;
    public Header header;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    public CreateAccountPage createAccountPage;
    public CategoryLandingPage categoryLandingPage;
    public StandardPDP standardPDP;
    public ShoppingCartPage shoppingCartPage;
    public CheckoutLoginPage checkoutLoginPage;
    public ShippingPage shippingPage;
    public BillingPage billingPage;
    public ReviewPage reviewPage;
    public OrderReceiptPage orderReceiptPage;
    public VariationPDP variationPDP;
    public QuickViewHopup quickViewHopup;
    public ShippingMethodsPage shippingMethodsPage;

    public KateSpade(WebDriverWrapper webDriverWrapper) {
        web = new WebElementsActions(webDriverWrapper);
        screenShotMaker = new ScreenShotMaker(webDriverWrapper);
        homePage = new HomePage(webDriverWrapper);
        header = new Header(webDriverWrapper);
        loginPage = new LoginPage(webDriverWrapper);
        myAccountPage = new MyAccountPage(webDriverWrapper);
        createAccountPage = new CreateAccountPage(webDriverWrapper);
        categoryLandingPage = new CategoryLandingPage(webDriverWrapper);
        standardPDP = new StandardPDP(webDriverWrapper);
        shoppingCartPage = new ShoppingCartPage(webDriverWrapper);
        checkoutLoginPage = new CheckoutLoginPage(webDriverWrapper);
        shippingPage = new ShippingPage(webDriverWrapper);
        billingPage = new BillingPage(webDriverWrapper);
        reviewPage = new ReviewPage(webDriverWrapper);
        orderReceiptPage = new OrderReceiptPage(webDriverWrapper);
        variationPDP = new VariationPDP(webDriverWrapper);
        quickViewHopup = new QuickViewHopup(webDriverWrapper);
        shippingMethodsPage = new ShippingMethodsPage(webDriverWrapper);
    }
}
