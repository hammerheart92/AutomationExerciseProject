package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;
import sharedData.Hooks;

public class AddReviewOnProduct extends Hooks {

    @Test
    public void testMethod() {

        String yourName = "Apaczai Laszlo";
        String emailAddress = "laszlo@test.com";
        String addReviewHere = "Chi Chi is a cat";

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.clickProductsMenu();
        String expectedUrl = "https://www.automationexercise.com/products";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "ERROR: The URL does not match the expected ALL PRODUCTS page!");
        Assert.assertTrue(productsPage.isProductsListDisplayed(), "ERROR: Products list is not displayed on the ALL PRODUCTS page!");

        productsPage.clickViewProduct();
        String productDetailsUrl = "https://www.automationexercise.com/product_details/1";
        Assert.assertEquals(driver.getCurrentUrl(), productDetailsUrl, "ERROR: The URL does not match the expected Product Details page!");
        Assert.assertTrue(productsPage.isWriteYourReviewTabDisplayed(), "ERROR: 'Write Your Review' section is not displayed!");

        productsPage.fillReviewData(yourName, emailAddress, addReviewHere);
        productsPage.clickSubmit();
        String expectedSuccessMessage = "Thank you for your review.";
        Assert.assertTrue(productsPage.isSuccessMessageDisplayed(), "ERROR: Success message not displayed!");
        Assert.assertEquals(productsPage.getSuccessMessageText(), expectedSuccessMessage, "ERROR: Success message text does not match!");
    }
}
