package core.driver;

import constants.Platform;
import core.utils.FileReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {
    public static void main(String[] args) {
        DriverManager manager = new DriverManager();
        manager.getInstance(Platform.ANDROID);
    }

    public AppiumDriver getInstance(Platform platform) {
        switch (platform) {
            case ANDROID:
                return getAndroidDriver();
            case IOS:
                return getIOSDriver();
        }
        return null;
    }

    private AppiumDriver getIOSDriver() {
        return null;
    }

    private AndroidDriver getAndroidDriver() {
        String caps = "";
        caps = new FileReader().readFile("android-caps.json");

        // TODO: Convert JSON string to JSON Object
        // TODO: Make desired capabilities object from JSON Object
        return null;
    }
}


