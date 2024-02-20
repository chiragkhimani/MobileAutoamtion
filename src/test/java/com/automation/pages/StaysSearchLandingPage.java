package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StaysSearchLandingPage extends BasePage {

    @FindBy(id = "com.expedia.bookings:id/search_src_text")
    WebElement staySearchInput;

    @FindBy(id = "com.expedia.bookings:id/title_textview")
    List<WebElement> searchResultList;


    public void enterStayLocation(String stayLocation) {
        staySearchInput.sendKeys(stayLocation);
        Assert.assertTrue(searchResultList.size() > 0);
        searchResultList.get(0).click();
    }
}
