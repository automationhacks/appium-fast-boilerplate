import constants.Platform;
import core.driver.DriverManager;
import core.utils.PropertiesReader;
import exceptions.PlatformNotSupportException;
import io.appium.java_client.AppiumDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {
    protected AppiumDriver driver;
    protected PropertiesReader reader = new PropertiesReader();

    @BeforeMethod
    public void setup(ITestContext context) {
        context.setAttribute("platform", reader.getPlatform());

        try {
            Platform platform = (Platform) context.getAttribute("platform");
            this.driver = new DriverManager().getInstance(platform);
        } catch (IOException | PlatformNotSupportException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
