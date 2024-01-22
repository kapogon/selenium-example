import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.SuccessfulLoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTest extends BaseTest {

    LoginPage loginPage;
    SuccessfulLoginPage successfulLoginPage;
    static final String LOGIN_PAGE_URL = "https://example.com";

    @BeforeEach
    public void setup() {
        driver.get(LOGIN_PAGE_URL);
        loginPage = new LoginPage(driver);
        successfulLoginPage = new SuccessfulLoginPage(driver);
    }

    @Test
    public void successfullLogin() {
        loginPage.enterEmailAddress("test01@example.com");
        loginPage.enterPassword("pass123");
        loginPage.submitLogin();

        assertThat(successfulLoginPage.getMessage()).isEqualTo("Login successful");
    }
}
