import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.visible;
import pages.LoginPage;
import pages.HomePage;


public class TestLogin extends TestBase {
    public static final String LIGHT_PINK = "rgba(255, 204, 204, 1)";
    public static final String LIGHT_GREEN = "rgba(214, 236, 166, 1)";

    @Test
    public void checkSuccessfulLogin() {
        String expectedSuccessMessageText = "You are now logged in as Test Test.";

        HomePage homePage = page(HomePage.class);
        LoginPage loginPage = page(LoginPage.class);

        loginPage.attemptLogin("viktoriyaprokhorova7@gmail.com", "250391");

        homePage.getSuccessMessage()
                .shouldHave(text(expectedSuccessMessageText))
                .shouldHave(cssValue("background-color", LIGHT_GREEN))
                .shouldBe(visible);
    }

    @Test
    public void checkErrorMessageIfOnlyLoginEntered() {
        String expectedErrorMessageText = "You must provide both email address and password.";

        HomePage homePage = page(HomePage.class);
        LoginPage loginPage = page(LoginPage.class);

        loginPage.enterEmail("bla.bla.bla@gmail.com");
        loginPage.clickLoginButton();

        homePage.getErrorMessage()
                .shouldHave(text(expectedErrorMessageText))
                .shouldHave(cssValue("background-color", LIGHT_PINK))
                .shouldBe(visible);
    }

    @Test
    public void checkForgotPasswordIfEmailDoesntExist() {
        String expectedErrorMessageText = "The email address does not exist in our database.";

        HomePage homePage = page(HomePage.class);
        LoginPage loginPage = page(LoginPage.class);

        loginPage.enterEmail("bla.bla.bla@gmail.com");
        loginPage.clickForgotPasswordButton();

        homePage.getErrorMessage()
                .shouldHave(text(expectedErrorMessageText))
                .shouldHave(cssValue("background-color", LIGHT_PINK))
                .shouldBe(visible);
    }
}
