package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("user opens application")
    public void user_opens_application() {
        homePage.handleInitialPopUps();
    }

    @Then("verify user is on home screen")
    public void verify_user_is_on_home_screen() {
        homePage.verifyHomeScreen();
    }

    @When("user tap on flights tab")
    public void user_tap_on_flights_tab() {
        homePage.tapOnFlightTab();
    }


    @Then("verify search error with error message is displayed")
    public void verifySearchErrorWithErrorMessageIsDisplayed(String message) {
        homePage.verifySearchErrorMsg(message);
    }

    @Then("verify date card error message is displayed")
    public void verifyDateCardErrorMessageIsDisplayed() {
        homePage.verifyDateCardErrorMsg();
    }

    @When("user click on travellers tab")
    public void user_click_on_travellers_tab() {
        homePage.clickOnTravellersTab();
    }


    @When("user tap on stays tab")
    public void userTapOnStaysTab() {
        homePage.clicOnStayTab();
    }

}
