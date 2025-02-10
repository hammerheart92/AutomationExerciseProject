package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;

public class VerifyProductQuantityInCartTest {

    public WebDriver driver;

    @Test
    public void testMethod() {

        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(driver.getTitle().contains("Automation Exercise"), "Home page not loaded successfully");
        homePage.clickViewProduct2();
        Assert.assertTrue(driver.getTitle().contains("Automation Exercise"), "Product detail is not opened successfully");

        homePage.setQuantity(4);
        homePage.clickAddToCart();
        homePage.clickViewCart();
    }
}