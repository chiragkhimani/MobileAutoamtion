package com.automation.steps;

import com.automation.pages.StaySearchResultPage;
import io.cucumber.java.en.Then;

public class StaySearchResultSteps {

    StaySearchResultPage staySearchResultPage = new StaySearchResultPage();

    @Then("verify stays search result is displayed")
    public void verifyStaysSearchResultIsDisplayed() {
        staySearchResultPage.verifyStaySearchResult();
    }
}
