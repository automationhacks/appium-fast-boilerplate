import constants.Platform;
import core.driver.DriverManager;
import exceptions.PlatformNotSupportException;
import io.appium.java_client.AppiumDriver;

import java.io.IOException;

public class BaseTest {
    protected AppiumDriver driver;

    public BaseTest(Platform platform) {
        try {
            this.driver = new DriverManager().getInstance(platform);
        } catch (IOException | PlatformNotSupportException e) {
            e.printStackTrace();
        }
    }
}
