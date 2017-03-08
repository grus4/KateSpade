package pages;

import org.testng.Assert;
import utils.WebDriverWrapper;

/**
 * Created by Rus on 07.03.2017.
 */
public class ShippingMethodsPage extends Page {

    public ShippingMethodsPage(WebDriverWrapper dr) {
        super(dr);
    }

    public void switchToBillingPage() {
        web.clickButton("ContinueToBillingButton");

        if(web.isElementPresent("SubmitOrderButton")
                && web.isElementAvailable("SubmitOrderButton")){
            log.info("Switching to Billing page was correct");
        } else {
            log.info("Switching to Billing page was INCORRECT!\n");
            Assert.fail("Switching to Billing page was INCORRECT!");
        }
    }
}
