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
    public void setup(ITestContext context) {
        context.setAttribute("target", reader.getTarget());

        try {
            Target target = (Target) context.getAttribute("target");
            this.driver = new DriverManager().getInstance(target);
        } catch (IOException | PlatformNotSupportException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
        driver.quit();
    }
}
