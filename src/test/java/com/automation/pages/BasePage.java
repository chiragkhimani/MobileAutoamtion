package com.automation.pages;

import com.automation.utils.DriverUtils;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public abstract class BasePage {

    AppiumDriver driver = DriverUtils.getDriver();
    WebDriverWait wait;

    public BasePage() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public boolean isPresent(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickOnElementIfPresent(WebElement element) {
        if (isPresent(element)) {
            element.click();
        }
    }

}
