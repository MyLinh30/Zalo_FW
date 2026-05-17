package hooks;

import driver.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.URL;

public class Hooks {
    public static AppiumDriver driver;

    @Before
    public void setUp() {
        System.out.println("Starting test...");
        driver = DriverFactory.initDriver();
//        System.out.println("Driver is: " + driver);

    }
    @After
    public void tearDown() {
        DriverFactory.quitDriver();
        System.out.println("Test finished");
    }
}
