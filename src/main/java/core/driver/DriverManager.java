package core.driver;

import constants.Target;
import exceptions.PlatformNotSupportException;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static core.utils.CapabilitiesHelper.readAndMakeCapabilities;

public class DriverManager {
    private static AppiumDriver driver;
    // For Appium < 2.0, append /wd/hub to the APPIUM_SERVER_URL
    String APPIUM_SERVER_URL = "http://127.0.0.1:4723";

    public AppiumDriver getInstance(Target target) throws IOException, PlatformNotSupportException {
        System.out.println("Getting instance of: " + target.name());
        switch (target) {
            case ANDROID:
                return getAndroidDriver();
            case IOS:
                return getIOSDriver();
            default:
                throw new PlatformNotSupportException("Please provide supported target");
        }
    }

    private AppiumDriver getAndroidDriver() throws IOException {
        HashMap map = readAndMakeCapabilities("android-caps.json");
        return getDriver(map);
    }

    private AppiumDriver getIOSDriver() throws IOException {
        HashMap map = readAndMakeCapabilities("ios-caps.json");
        return getDriver(map);
    }

    private AppiumDriver getDriver(HashMap map) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities(map);

        try {
            driver = new AppiumDriver(
                    new URL(APPIUM_SERVER_URL), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }
}


