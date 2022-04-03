package pages.testapp.home;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private final By firstNumber = By.name("IntegerA");
    private final By secondNumber = By.name("IntegerB");
    private final By computeSumButton = By.name("ComputeSumButton");
    private final By answer = By.name("Answer");

    public HomePage(AppiumDriver driver) {
        super(driver);
    }

    public HomePage enterTwoNumbersAndCompute(String first, String second) {
        typeFirstNumber(first);
        typeSecondNumber(second);
        compute();
        return this;
    }

    public HomePage typeFirstNumber(String number) {
        WebElement firstNoElement = getElement(firstNumber);
        type(firstNoElement, number);
        return this;
    }

    public HomePage typeSecondNumber(String number) {
        WebElement secondNoElement = getElement(secondNumber);
        type(secondNoElement, number);
        return this;
    }

    public HomePage compute() {
        WebElement computeBtn = getElement(computeSumButton);
        click(computeBtn);
        return this;
    }

    public String getSum() {
        waitForElementToBePresent(answer);
        return getText(getElement(answer));
    }
}

