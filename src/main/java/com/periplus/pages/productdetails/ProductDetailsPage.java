package com.periplus.pages.productdetails;

import com.base.BasePage;
import com.periplus.pages.shoppingcart.ShoppingCartPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;

public class ProductDetailsPage extends BasePage {

    private By isbnNumber = By.xpath("//p[contains(text(),'ISBN-13')]/following-sibling::p");
    private By addToCartButton = By.xpath("//button[contains(@class, \"btn btn-add-to-cart\")]");
    private By goToCartButton = By.xpath("//div[starts-with(@id, \"show-your-cart\")]//a[contains(@href, \"/checkout/cart\")]");

    public String getIsbnNumber() {
        return find(isbnNumber).getText();
    }

    public void addToCart() {
        clickJS(addToCartButton);
    }

    public ShoppingCartPage goToShoppingCart() {
        clickJS(goToCartButton);
        return new ShoppingCartPage();
    }
}
