package com.periplus.pages.shoppingcart;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.ListIterator;

public class ShoppingCartPage extends BasePage  {

    private By productIsbnDesc = By.xpath("//div[contains(@class, 'row row-cart-product')]");

    public boolean verifyProductAdded(String expectedIsbn) {
        System.out.println("Expected ISBN: " + expectedIsbn);
        List<WebElement> cartItems = driver.findElements(productIsbnDesc);

        for (WebElement row : cartItems) {

            String actualIsbn = row.findElement(By.xpath(".//div[contains(@style, 'font-size: 12px')]")).getText();

            System.out.println(actualIsbn);
            if (actualIsbn.equals(expectedIsbn)) {
                System.out.println("Matching ISBN found: " + actualIsbn);
                return true;
            }
        }

        return false;

    }

}