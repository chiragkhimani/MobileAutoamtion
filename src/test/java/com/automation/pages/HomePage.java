package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    static int a;
    static Integer ab;

    @FindBy(id = "com.expedia.bookings:id/uds_button_label")
    WebElement acceptBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Get started']")
    WebElement getStartedBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Let’s go']")
    WebElement letsGoBtn;

    @FindBy(xpath = "//android.view.View[@content-desc='Close']")
    WebElement closeBtn;

    @FindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
    WebElement locationPermissionBox;

    @FindBy(xpath = "//android.widget.TextView[@text='Flights']")
    WebElement flightsTab;

    @FindBy(xpath = "//android.widget.TextView[@text='Stays']")
    WebElement staysTab;

    @FindBy(xpath = "//android.widget.TextView[@text='Travellers']")
    WebElement travellerOption;

    @FindBy(id = "com.expedia.bookings:id/alertTitle")
    WebElement flightSearchErrorPopup;

    @FindBy(id = "android:id/message")
    WebElement flightSearchErrorMsg;

    @FindBy(id = "android:id/button1")
    WebElement flightSearchErrorMsgDoneBtn;

    @FindBy(id = "com.expedia.bookings:id/calendar_card")
    WebElement dateCard;

    public static void main(String[] args) {
        System.out.println(1 + 4 + a);
        System.out.println(1 + 4 + ab);
    }

    public void handleInitialPopUps() {
        clickOnElementIfPresent(acceptBtn);
        clickOnElementIfPresent(getStartedBtn);
        clickOnElementIfPresent(closeBtn);
        clickOnElementIfPresent(letsGoBtn);
        clickOnElementIfPresent(locationPermissionBox);
    }

    public void verifyHomeScreen() {
        Assert.assertTrue(isPresent(flightsTab));
    }

    public void tapOnFlightTab() {
        flightsTab.click();
    }

    public void verifySearchErrorMsg(String message) {
        Assert.assertTrue(isPresent(flightSearchErrorPopup));
        Assert.assertEquals(flightSearchErrorMsg.getText(), message);
        flightSearchErrorMsgDoneBtn.click();
    }

    public void verifyDateCardErrorMsg() {
        Assert.assertTrue(dateCard.getAttribute("content-desc").contains("Select return date"));
    }

    public void clickOnTravellersTab() {
        travellerOption.click();
    }

    public void clicOnStayTab() {
        staysTab.click();


    }
}
