package com.periplus.tests.shoppingcart;

import com.periplus.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.base.BasePage.delay;


public class ShoppingCartTest extends BaseTest {
    @Test
    public void testShoppingCart() {
        // Click sign in
        var signInPage = homePage.goToSignIn();

        // Input username, password
        signInPage.setUsername("mibassogaming@gmail.com");
        signInPage.setPassword("vueJH!R!rQ3q79g");

        // Click login
        var myAccountPage = signInPage.clickSignInButton();

        // Input search
        myAccountPage.setSearch("Atomic Habits");

        // Click icon search
        var productSearch = myAccountPage.clickSearchButton();

        // Click the first product on the product list
        var productDetailsPage = productSearch.clickProductDetail();
        String isbnNumber = productDetailsPage.getIsbnNumber();

        // Click add to cart
        productDetailsPage.addToCart();

        // Click x on the success pop up
        delay(3000);

        // Click shopping cart icon
        var shoppingCartPage = productDetailsPage.goToShoppingCart();

        // Check the ISBN
        boolean isProductAdded = shoppingCartPage.verifyProductAdded(isbnNumber);
        Assert.assertTrue(isProductAdded, "Product with ISBN " + isbnNumber + " was not found in the cart.");
    }
}
