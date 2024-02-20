package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravellersLandingPage extends BasePage {

    @FindBy(css = "#adult_step_input #step_value")
    WebElement noOfAdultsElement;

    @FindBy(css = "#youth_step_input #step_value")
    WebElement noOfYouthElement;

    @FindBy(css = "#child_step_input #step_value")
    WebElement noOfChildElement;

    @FindBy(css = "#infant_step_input #step_value")
    WebElement noOfInfantElement;

    public void verifyTravellersSelectionPage() {
        Assert.assertTrue(isPresent(noOfAdultsElement));
        Assert.assertTrue(isPresent(noOfYouthElement));
        Assert.assertTrue(isPresent(noOfChildElement));
        Assert.assertTrue(isPresent(noOfInfantElement));
    }

    public void verifyAdultsDefaultValue(String noOfAdults) {
        Assert.assertEquals(noOfAdultsElement.getAttribute("text"), noOfAdults);
    }

    public void verifyYouthsDefaultValue(String noOfYouths) {
        Assert.assertEquals(noOfYouthElement.getAttribute("text"), noOfYouths);
    }

    public void verifyChildrenDefaultValue(String noOfChildren) {
        Assert.assertEquals(noOfChildElement.getAttribute("text"), noOfChildren);
    }

    public void verifyInfantsDefaultValue(String noOfInfants) {
        Assert.assertEquals(noOfInfantElement.getAttribute("text"), noOfInfants);
    }
}
