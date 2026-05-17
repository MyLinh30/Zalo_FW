package driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.android.AndroidDriver;
import utils.ConfigReader;

import java.net.URL;


public class DriverFactory {
    public static AppiumDriver driver;
    public static AppiumDriver initDriver() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName(ConfigReader.get("deviceName"));
        options.setPlatformName(ConfigReader.get("platformName"));
        options.setUdid(ConfigReader.get("udid"));
        options.setAppPackage(ConfigReader.get("appPackage"));
        options.setAppActivity(ConfigReader.get("appActivity"));
        options.setAutomationName(ConfigReader.get("automationName"));
        options.setNoReset(false);
        try {
            driver = new AndroidDriver(
                    new URL("http://127.0.0.1:4723"),
                    options
            );
            return driver;
        } catch (Exception e) {
            System.out.println("Driver initialization failed!");
            e.printStackTrace();
            throw new RuntimeException("Cannot initialize driver", e);
        }
    }
    public static void quitDriver() {
        if (driver != null) driver.quit();
    }
}
