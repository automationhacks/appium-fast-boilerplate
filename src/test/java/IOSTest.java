import org.testng.Assert;
import org.testng.annotations.Test;
import pages.testapp.home.HomePage;

public class IOSTest extends BaseTest {
    @Test
    public void addNumbers() {
        String actualSum = new HomePage(this.driver)
                .enterTwoNumbersAndCompute("5", "5")
                .getSum();

        Assert.assertEquals(actualSum, "10");
    }
}
