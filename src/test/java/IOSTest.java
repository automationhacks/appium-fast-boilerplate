import constants.Platform;
import core.driver.DriverManager;
import exceptions.PlatformNotSupportException;
import org.testng.annotations.Test;

import java.io.IOException;

public class IOSTest {
    @Test
    public void testIOS() {
        try {
            new DriverManager().getInstance(Platform.IOS);
        } catch (IOException | PlatformNotSupportException e) {
            e.printStackTrace();
        }
    }
}
