package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessfulLoginPage extends BasePage {

    @FindBy(id = "message")
    WebElement alertMessage;

    public SuccessfulLoginPage(WebDriver driver) {
        super(driver);
    }

    public String getMessage() {
        return alertMessage.getText();
    }
}
