package com.periplus.base;

import com.base.BasePage;
import com.periplus.pages.HomePage;
import com.periplus.pages.myaccount.MyAccountPage;
import com.periplus.pages.productdetails.ProductDetailsPage;
import com.periplus.pages.productsearch.ProductSearchPage;
import com.periplus.pages.shoppingcart.ShoppingCartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.base.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected MyAccountPage myAccountPage;
    protected ProductSearchPage productSearchPage;
    protected ProductDetailsPage productDetailsPage;
    protected ShoppingCartPage shoppingCartPage;

    private String PERIPLUS_URL = "https://www.periplus.com/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(PERIPLUS_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterClass
    public void tearDown() {
        delay(3000);
        driver.quit();
    }
}
