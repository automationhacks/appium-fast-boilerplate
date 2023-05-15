import constants.Target;
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

    @BeforeMethod(alwaysRun = true)
    public void setup(ITestContext context) throws PlatformNotSupportException, IOException {
        context.setAttribute("target", reader.getTarget());
        Target target = (Target) context.getAttribute("target");
        this.driver = new DriverManager().getInstance(target);
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
