package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StaySearchResultPage extends BasePage {

    @FindBy(xpath = "//android.widget.TextView[@resource-id='propertyName']")
    List<WebElement> searchFlightAirlineNamesList;

    public void verifyStaySearchResult() {
        Assert.assertTrue(searchFlightAirlineNamesList.size() > 0);
    }
}
