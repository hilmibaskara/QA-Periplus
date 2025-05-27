package com.periplus.pages.signin;

import com.base.BasePage;
import com.periplus.pages.myaccount.MyAccountPage;
import org.openqa.selenium.By;

public class SignInPage extends BasePage {
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By signInButton = By.id("button-login");

    public void setUsername(String username) {
        set(usernameField, username);
    }

    public void setPassword(String password) {
        set(passwordField, password);
    }

    public MyAccountPage clickSignInButton() {
        click(signInButton);
        return new MyAccountPage();
    }

    public MyAccountPage signIntoApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickSignInButton();
    }

}
