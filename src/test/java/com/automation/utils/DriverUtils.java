package com.automation.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DriverUtils {

    static AppiumDriver driver;

    public static void createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", ConfigReader.getProperty("device.name"));
        capabilities.setCapability("platformName", ConfigReader.getProperty("platformName"));
        capabilities.setCapability("appium:automationName", ConfigReader.getProperty("automation.name"));
        capabilities.setCapability("appium:app", System.getProperty("user.dir") + "//" + ConfigReader.getProperty("app.name"));

        driver = new AppiumDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static AppiumDriver getDriver() {
        return driver;
    }
}
