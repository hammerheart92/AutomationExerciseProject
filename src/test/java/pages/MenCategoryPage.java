package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenCategoryPage extends BasePage {

    public MenCategoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[normalize-space()='Tshirts']")
    private WebElement tShirtsOptionElement;
    @FindBy(css = "a[data-product-id='43']")
    private WebElement addProductNr6;
    @FindBy(css = "a[data-product-id='29']")
    private WebElement addProductNr3;
    @FindBy(css = "a[data-product-id='30']")
    private WebElement AddProductNr4;
    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private WebElement continueShoppingButton;

    public void clickTShirtsOption(){
        elementMethods.clickJSElement(tShirtsOptionElement);
        loggerUtility.infoLog("The User clicks on Men Category TShirt option");
    }

    public void addProductToCart(){
        elementMethods.hoverOverElement(addProductNr6);
        loggerUtility.infoLog("The User hovers over product Rs. 1389");
        elementMethods.clickJSElement(addProductNr6);
        loggerUtility.infoLog("The User clicks on product Rs. 1389");
        elementMethods.clickJSElement(continueShoppingButton);
        loggerUtility.infoLog("The User click on ContinueShopping button");
        elementMethods.hoverOverElement(addProductNr3);
        loggerUtility.infoLog("The User hovers over product Rs. 1000");
        elementMethods.clickJSElement(addProductNr3);
        loggerUtility.infoLog("The User clicks on product Rs. 1000");
        elementMethods.clickJSElement(continueShoppingButton);
        loggerUtility.infoLog("The User click on ContinueShopping button");
        elementMethods.hoverOverElement(AddProductNr4);
        loggerUtility.infoLog("The User hovers over product Rs. 1500");
        elementMethods.clickJSElement(AddProductNr4);
        loggerUtility.infoLog("The User clicks on product Rs. 1500");
        elementMethods.clickJSElement(continueShoppingButton);
        loggerUtility.infoLog("The User click on ContinueShopping button");
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
