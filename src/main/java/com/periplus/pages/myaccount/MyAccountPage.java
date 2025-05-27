package com.periplus.pages.myaccount;

import com.base.BasePage;
import com.periplus.pages.productsearch.ProductSearchPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;

public class MyAccountPage extends BasePage {
    private By searchField = By.id("filter_name");
    private By searchButton = By.xpath("//div[@class='search-bar-top']//button[@class='btnn']");

    public void setSearch(String search) {
        set(searchField, search);
    }

    public ProductSearchPage clickSearchButton() {
        clickJS(searchButton);
        return new ProductSearchPage();
    }

    public ProductSearchPage signIntoApplication(String search) {
        setSearch(search);
        return clickSearchButton();
    }
}
