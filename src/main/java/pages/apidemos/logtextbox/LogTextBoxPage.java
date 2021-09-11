package pages.apidemos.logtextbox;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogTextBoxPage extends BasePage {
    @FindBy(id = "io.appium.android.apis:id/add")
    private WebElement addButton;

    @FindBy(id = "io.appium.android.apis:id/text")
    private WebElement logTextButtonArea;

    public LogTextBoxPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LogTextBoxPage tapOnAddButton() {
        click(addButton);
        return this;
    }

    public String getLogText() {
        return getText(logTextButtonArea).trim();
    }
}
