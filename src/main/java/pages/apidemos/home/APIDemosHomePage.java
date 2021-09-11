package pages.apidemos.home;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.apidemos.logtextbox.LogTextBoxPage;

public class APIDemosHomePage extends BasePage {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Text\"]")
    private WebElement textButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"LogTextBox\"]")
    private WebElement logTextBoxButton;

    public APIDemosHomePage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public APIDemosHomePage openText() {
        click(textButton);
        return this;
    }

    public LogTextBoxPage tapOnLogTextBox() {
        waitForElementToBeVisible(logTextBoxButton);
        click(logTextBoxButton);

        return new LogTextBoxPage(driver);
    }

}
