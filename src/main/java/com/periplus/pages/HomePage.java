package com.periplus.pages;

import com.base.BasePage;
import com.periplus.pages.signin.SignInPage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By signIn = By.id("nav-signin-text");

    public SignInPage goToSignIn() {
        click(signIn);
        return new SignInPage();
    }
}
