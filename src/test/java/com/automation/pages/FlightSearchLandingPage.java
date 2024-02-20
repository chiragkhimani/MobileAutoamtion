package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FlightSearchLandingPage extends BasePage {

    final String XPATH_DATE_SELECTOR = "//android.widget.TextView[@content-desc='%s, Not Selected']";

    @FindBy(xpath = "//android.widget.TextView[@text='Flying from']")
    WebElement flyingFromOption;

    @FindBy(xpath = "//android.widget.TextView[@text='Flying to']")
    WebElement flyingToOption;

    @FindBy(xpath = "//android.widget.TextView[@text='Select dates']")
    WebElement dateOption;

    @FindBy(id = "com.expedia.bookings:id/search_btn")
    WebElement searchBtn;

    @FindBy(id = "com.expedia.bookings:id/search_src_text")
    WebElement searchInput;

    @FindBy(id = "com.expedia.bookings:id/title_textview")
    List<WebElement> searchResultList;

    @FindBy(id = "com.expedia.bookings:id/confirmButton")
    WebElement doneBtn;

    public void verifyFlightSearchLandingPage() {
        Assert.assertTrue(isPresent(flyingFromOption));
        Assert.assertTrue(isPresent(flyingToOption));
        Assert.assertTrue(isPresent(dateOption));
    }

    public void enterFlightSource(String source) {
        flyingFromOption.click();
        searchInput.sendKeys(source);
        Assert.assertTrue(searchResultList.size() > 0);
        searchResultList.get(0).click();
    }

    public void enterFlightDestination(String destination) {
        searchInput.sendKeys(destination);
        Assert.assertTrue(searchResultList.size() > 0);
        searchResultList.get(0).click();
    }

    public void selectFromDate(String fromDate) {
        String fromDateLoc = String.format(XPATH_DATE_SELECTOR, fromDate);
        driver.findElement(By.xpath(fromDateLoc)).click();
    }

    public void selectToDate(String toDate) {
        String toDateLoc = String.format(XPATH_DATE_SELECTOR, toDate);
        driver.findElement(By.xpath(toDateLoc)).click();
    }

    public void clickOnDateDoneBtn() {
        doneBtn.click();
    }

    public void clickOnContinueBtn() {
        searchBtn.click();
    }

    public void clickOnDateCard() {
        dateOption.click();
    }
}
