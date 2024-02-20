package com.automation.steps;

import com.automation.pages.TravellersLandingPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;

public class TravellersLandingSteps {

    TravellersLandingPage travellersLandingPage = new TravellersLandingPage();

    @Then("verify user is on travellers selection landing")
    public void verify_user_is_on_travellers_selection_landing() {
        travellersLandingPage.verifyTravellersSelectionPage();
    }

    @Then("verify default value of Adults is {string}")
    public void verify_default_value_of_adults_is(String noOfAdults) {
        travellersLandingPage.verifyAdultsDefaultValue(ConfigReader.getProperty(noOfAdults));
    }

    @Then("verify default value of Youths is {string}")
    public void verify_default_value_of_youths_is(String noOfYouths) {
        travellersLandingPage.verifyYouthsDefaultValue(ConfigReader.getProperty(noOfYouths));
    }

    @Then("verify default value of Children is {string}")
    public void verify_default_value_of_children_is(String noOfChildren) {
        travellersLandingPage.verifyChildrenDefaultValue(ConfigReader.getProperty(noOfChildren));
    }

    @Then("verify default value of Infants is {string}")
    public void verify_default_value_of_infants_is(String noOfInfants) {
        travellersLandingPage.verifyInfantsDefaultValue(ConfigReader.getProperty(noOfInfants));
    }
}
