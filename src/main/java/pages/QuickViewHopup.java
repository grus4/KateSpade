package pages;

import utils.WebDriverWrapper;

/**
 * Created by Rus on 28.02.2017.
 */
public class QuickViewHopup extends Page{
    public QuickViewHopup(WebDriverWrapper dr) {
        super(dr);
    }

    public void clickAddToBagButton() {
        web.clickButton("AddToBagButton");
        web.waitForElementPresent("ViewBagButton");
        web.waitForElementToBeClickable("ViewBagButton");
    }
}
