package pages;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private String emailInputLocator = "//input[@type='text' and @name='email']";
    private String passwordInputLocator = "//input[@type='password' and @name='password']";
    private String loginButtonLocator = "//button[@type='submit' and @name='login']";
    private String lostPasswordButtonLocator = "//button[@type='submit' and @name='lost_password']";

    public void attemptLogin(String username, String password) {
        $x(emailInputLocator).setValue(username);
        $x(passwordInputLocator).setValue(password);
        $x(loginButtonLocator).click();
    }

    public void enterEmail(String username) {
        $x(emailInputLocator).setValue(username);
    }

    public void enterPassword(String password) {
        $x(passwordInputLocator).setValue(password);
    }

    public void clickLoginButton() {
        $x(loginButtonLocator).click();
    }

    public void clickForgotPasswordButton() {
        $x(lostPasswordButtonLocator).click();
    }
}
