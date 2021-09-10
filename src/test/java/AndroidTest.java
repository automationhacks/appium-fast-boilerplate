import constants.Platform;
import core.driver.DriverManager;
import exceptions.PlatformNotSupportException;
import org.testng.annotations.Test;

import java.io.IOException;

public class AndroidTest {
    @Test
    public void testAndroid() {
        try {
            new DriverManager().getInstance(Platform.ANDROID);
        } catch (IOException | PlatformNotSupportException e) {
            e.printStackTrace();
        }
    }
}
