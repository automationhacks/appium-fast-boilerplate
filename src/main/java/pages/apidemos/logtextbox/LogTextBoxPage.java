package pages.apidemos.logtextbox;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogTextBoxPage extends BasePage {
    private final By addButton = By.id("io.appium.android.apis:id/add");
    private final By logTextButtonArea = By.id("io.appium.android.apis:id/text");

    public LogTextBoxPage(AppiumDriver driver) {
        super(driver);
    }

    public LogTextBoxPage tapOnAddButton() {
        click(getElement(addButton));
        return this;
    }

    public String getLogText() {
        return getText(getElement(logTextButtonArea)).trim();
    }
}
