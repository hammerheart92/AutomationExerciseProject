package pages;

import helpMethods.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenCategoryPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public MenCategoryPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Tshirts']")
    public WebElement tShirtsOptionElement;
    @FindBy(css = "a[data-product-id='43']")
    public WebElement addProductNr6;
    @FindBy(css = "a[data-product-id='29']")
    public WebElement addProductNr3;
    @FindBy(css = "a[data-product-id='30']")
    public WebElement AddProductNr4;
    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueShoppingButton;


    public void clickTShirtsOption(){
        elementMethods.clickJSElement(tShirtsOptionElement);
    }

    public void addProductToCart(){
        elementMethods.hoverOverElement(addProductNr6);
        elementMethods.clickJSElement(addProductNr6);
        elementMethods.clickJSElement(continueShoppingButton);
        elementMethods.hoverOverElement(addProductNr3);
        elementMethods.clickJSElement(addProductNr3);
        elementMethods.clickJSElement(continueShoppingButton);
        elementMethods.hoverOverElement(AddProductNr4);
        elementMethods.clickJSElement(AddProductNr4);
        elementMethods.clickJSElement(continueShoppingButton);
    }

    public void clickContinueShopping() {
    }

    public boolean verifyProductInCart(String productName) {
        WebElement productElement = driver.findElement(By.xpath("//td[@class='cart_description']//a[contains(text(), '" + productName + "')]"));
        return productElement.isDisplayed();
    }

//    public boolean verifyProductDetails(String productName, String price, String quantity, String total) {
//        WebElement priceElement = driver.findElement(By.xpath("//td[contains(text(), '" + productName + "')]/following-sibling::td[contains(@class, 'price')]"));
//        WebElement quantityElement = driver.findElement(By.xpath("//td[contains(text(), '" + productName + "')]/following-sibling::td[contains(@class, 'quantity')]"));
//        WebElement totalElement = driver.findElement(By.xpath("//td[contains(text(), '" + productName + "')]/following-sibling::td[contains(@class, 'total')]"));
//
//        return priceElement.getText().equals(price) &&
//                quantityElement.getText().equals(quantity) &&
//                totalElement.getText().equals(total);
//    }

}
