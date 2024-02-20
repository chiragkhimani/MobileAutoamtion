package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FlightSearchResultPage extends BasePage {

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Price Tracking']")
    WebElement priceTrackingTitle;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.expedia.bookings:id/flight_time']")
    List<WebElement> searchFlightTimeList;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.expedia.bookings:id/price']")
    List<WebElement> searchFlightPriceList;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.expedia.bookings:id/location']")
    List<WebElement> searchFlightLocationList;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.expedia.bookings:id/duration_and_stops']")
    List<WebElement> searchFlightDurationList;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.expedia.bookings:id/airline_name']")
    List<WebElement> searchFlightAirlineNamesList;

    public void verifyFlightSearchResult() {
        Assert.assertTrue(isPresent(priceTrackingTitle));
        Assert.assertTrue(searchFlightTimeList.size() > 0);
        Assert.assertTrue(searchFlightPriceList.size() > 0);
        Assert.assertTrue(searchFlightLocationList.size() > 0);
        Assert.assertTrue(searchFlightDurationList.size() > 0);
        Assert.assertTrue(searchFlightAirlineNamesList.size() > 0);
    }
}
