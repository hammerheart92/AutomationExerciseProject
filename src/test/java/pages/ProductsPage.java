package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/products']")
    private WebElement productsElement;
    @FindBy(xpath = "//div[@class='features_items']")
    private WebElement productsList;
    @FindBy(css = "a[href='/product_details/1']")
    private WebElement viewProductButton;
    @FindBy(xpath = "//a[@data-toggle='tab' and @href='#reviews']")
    private WebElement writeYourReviewTab;
    @FindBy(id = "name")
    private WebElement nameElement;
    @FindBy(id = "email")
    private WebElement emailElement;
    @FindBy (id = "review")
    private WebElement writeReview;
    @FindBy(id = "button-review")
    private WebElement submitButton;
    @FindBy(xpath = "//span[contains(text(),'Thank you for your review.')]")
    private WebElement successMessage;

    public void clickProductsMenu() {
        elementMethods.clickJSElement(productsElement);
        loggerUtility.infoLog("The User clicks on Products menu");
    }

    public boolean isProductsListDisplayed() {
        return productsList.isDisplayed();
    }

    public void clickViewProduct() {
        elementMethods.clickJSElement(viewProductButton);
        loggerUtility.infoLog("The User clicks on Products button");
    }

    public boolean isWriteYourReviewTabDisplayed() {
        return writeYourReviewTab.isDisplayed();
    }

    public void fillReviewData(String nameValue, String emailValue, String writeReviewValue) {
        elementMethods.fillElementWithFallback(nameElement, nameValue);
        loggerUtility.infoLog("The User fills Your Name field with " + nameValue + " value");
        elementMethods.fillElementWithFallback(emailElement, emailValue);
        loggerUtility.infoLog("The User fills Email Adress field with " + emailValue + " value");
        elementMethods.fillElementWithFallback(writeReview, writeReviewValue);
        loggerUtility.infoLog("The User fills Add Review Here! field with " + writeReviewValue + " value");
    }

    public void clickSubmit() {
        elementMethods.clickJSElement(submitButton);
        loggerUtility.infoLog("The User clicks on Submit button");
    }

    public boolean isSuccessMessageDisplayed() {
        return successMessage.isDisplayed();
    }

    public String getSuccessMessageText() {
        return successMessage.getText();
    }
}