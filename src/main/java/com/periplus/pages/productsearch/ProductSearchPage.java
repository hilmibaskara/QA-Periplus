package com.periplus.pages.productsearch;

import com.base.BasePage;
import com.periplus.pages.productdetails.ProductDetailsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;

public class ProductSearchPage extends BasePage {

    private By firstProduct = By.xpath("//div[contains(@class, 'single-product')][1]//a[contains(@href, '/p/')]");

    public ProductDetailsPage clickProductDetail() {
        clickJS(firstProduct);
        return new ProductDetailsPage();
    }

}
