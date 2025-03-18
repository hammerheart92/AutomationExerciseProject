package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsElement;
    @FindBy(xpath = "//div[@class='features_items']")
    public WebElement productsList;
    @FindBy(css = "a[href='/product_details/1']")
    public WebElement viewProductButton;
    @FindBy(xpath = "//a[@data-toggle='tab' and @href='#reviews']")
    public WebElement writeYourReviewTab;
    @FindBy(id = "name")
    public WebElement nameElement;
    @FindBy(id = "email")
    public WebElement emailElement;
    @FindBy (id = "review")
    public WebElement writeReview;
    @FindBy(id = "button-review")
    public WebElement submitButton;
    @FindBy(xpath = "//span[contains(text(),'Thank you for your review.')]")
    public WebElement successMessage;

    public void clickProductsMenu() {
        elementMethods.clickJSElement(productsElement);
    }

    public boolean isProductsListDisplayed() {
        return productsList.isDisplayed();
    }

    public void clickViewProduct() {
        elementMethods.clickJSElement(viewProductButton);
    }

    public boolean isWriteYourReviewTabDisplayed() {
        return writeYourReviewTab.isDisplayed();
    }

    public void fillReviewData(String nameValue, String emailValue, String writeReviewValue) {
        elementMethods.fillElementWithFallback(nameElement, nameValue);
        elementMethods.fillElementWithFallback(emailElement, emailValue);
        elementMethods.fillElementWithFallback(writeReview, writeReviewValue);
    }

    public void clickSubmit() {
        elementMethods.clickJSElement(submitButton);
    }

    public boolean isSuccessMessageDisplayed() {
        return successMessage.isDisplayed();
    }

    public String getSuccessMessageText() {
        return successMessage.getText();
    }
}