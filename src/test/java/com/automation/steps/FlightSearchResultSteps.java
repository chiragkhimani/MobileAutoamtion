package com.automation.steps;

import com.automation.pages.FlightSearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FlightSearchResultSteps {

    FlightSearchResultPage flightSearchResultPage = new FlightSearchResultPage();

    @Then("verify flight search result is displayed")
    public void verify_flight_search_result_is_displayed() {
        flightSearchResultPage.verifyFlightSearchResult();
    }

}
