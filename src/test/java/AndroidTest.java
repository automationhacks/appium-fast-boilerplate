import constants.Platform;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.apidemos.home.APIDemosHomePage;

public class AndroidTest extends BaseTest {

    public AndroidTest() {
        super(Platform.ANDROID);
    }

    @Test
    public void testLogText() {
        String logText = new APIDemosHomePage(this.driver)
                .openText()
                .tapOnLogTextBox()
                .tapOnAddButton()
                .getLogText();

        Assert.assertEquals(logText, "This is a test");
    }
}
