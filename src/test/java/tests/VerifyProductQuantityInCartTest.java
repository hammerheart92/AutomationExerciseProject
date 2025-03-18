package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import sharedData.SharedData;

public class VerifyProductQuantityInCartTest extends SharedData {

    @Test
    public void testMethod() {

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(driver.getTitle().contains("Automation Exercise"), "Home page not loaded successfully");
        homePage.clickViewProduct2();
        Assert.assertTrue(driver.getTitle().contains("Automation Exercise"), "Product detail is not opened successfully");

        homePage.setQuantity(4);
        homePage.clickAddToCart();
        homePage.clickViewCart();
    }
}