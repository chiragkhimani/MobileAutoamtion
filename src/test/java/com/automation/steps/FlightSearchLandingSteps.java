package com.automation.steps;

import com.automation.pages.FlightSearchLandingPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightSearchLandingSteps {

    FlightSearchLandingPage flightSearchLandingPage = new FlightSearchLandingPage();

    @Then("verify flights search landing page is displayed")
    public void verify_flights_search_landing_page_is_displayed() {
        flightSearchLandingPage.verifyFlightSearchLandingPage();
    }

    @When("user enters the flight source to {string}")
    public void user_enters_the_flight_source_to(String source) {
        flightSearchLandingPage.enterFlightSource(ConfigReader.getProperty(source));
    }

    @When("flight destination to {string}")
    public void flight_destination_to(String destination) {
        flightSearchLandingPage.enterFlightDestination(ConfigReader.getProperty(destination));
    }

    @When("select date from {string} to {string}")
    public void select_date_to(String fromDate, String toDate) {
        flightSearchLandingPage.selectFromDate(ConfigReader.getProperty(fromDate));
        flightSearchLandingPage.selectToDate(ConfigReader.getProperty(toDate));
        flightSearchLandingPage.clickOnDateDoneBtn();
    }

    @And("select date from {string}")
    public void flightDateFrom(String fromDate) {
        flightSearchLandingPage.selectFromDate(ConfigReader.getProperty(fromDate));
        flightSearchLandingPage.clickOnDateDoneBtn();
    }

    @When("click on Continue button")
    public void click_on_continue_button() {
        flightSearchLandingPage.clickOnContinueBtn();
    }

    @And("click on search button")
    public void clickOnSearchButton() {
        flightSearchLandingPage.clickOnContinueBtn();
    }

    @And("click on date selection card")
    public void clickOnDateSelectionCard() {
        flightSearchLandingPage.clickOnDateCard();
    }
}
