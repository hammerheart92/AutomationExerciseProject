package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenCategoryPage;
import sharedData.Hooks;

public class AddProductsToCartTest extends Hooks {

    @Test
    public void testMethod() {

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(driver.getTitle().contains("Automation Exercise"), "Home page not loaded successfully");
        homePage.clickProductsButton();
        homePage.clickMenOption();

        MenCategoryPage menCategoryPage = new MenCategoryPage(driver);
        menCategoryPage.clickTShirtsOption();
        menCategoryPage.addProductToCart();
        menCategoryPage.clickContinueShopping();
        homePage.clickCart();
        Assert.assertTrue(driver.getCurrentUrl().contains("view_cart"), "Cart page not loaded successfully");

        Assert.assertTrue(menCategoryPage.verifyProductInCart("GRAPHIC DESIGN MEN T SHIRT - BLUE"),
                "First product not in cart");
        Assert.assertTrue(menCategoryPage.verifyProductInCart("Green Side Placket Detail T-Shirt"),
                "Second product not in cart");
        Assert.assertTrue(menCategoryPage.verifyProductInCart("Premium Polo T-Shirts"),
                "Third product not in cart");

//        Assert.assertTrue(menCategoryPage.verifyProductDetails("GRAPHIC DESIGN MEN T SHIRT - BLUE", "Rs. 1389", "1", "Rs. 1389"), "First product details incorrect");
//        Assert.assertTrue(menCategoryPage.verifyProductDetails("Premium Polo T-Shirts", "Rs. 1500", "1", "Rs. 1500"), "Second product details incorrect");
    }
}