package com.automation.steps;

import com.automation.pages.StaysSearchLandingPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;

public class StaysSearchLandingSteps {

    StaysSearchLandingPage staysLandingPage = new StaysSearchLandingPage();

    @And("user enters the stay location {string}")
    public void userEntersTheStayLocation(String stayLocation) {
        staysLandingPage.enterStayLocation(ConfigReader.getProperty(stayLocation));
    }

}
