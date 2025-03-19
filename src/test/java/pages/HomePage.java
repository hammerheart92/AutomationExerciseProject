package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    private WebElement signupLoginMenu;
    @FindBy(xpath = "//i[@class='fa fa-envelope']")
    private WebElement contactUsMenu;
    @FindBy(xpath = "//a[@href='/products']")
    private WebElement productsButton;
    @FindBy(xpath = "//a[normalize-space()='Men']")
    private WebElement menCategoryMenu;
    @FindBy(css = "i[class='fa fa-shopping-cart']")
    private WebElement cartMenu;
    @FindBy(xpath = "//a[@href='/product_details/2']")
    private WebElement viewProduct2;
    @FindBy(id = "quantity")
    private WebElement quantityInput;
    @FindBy(css = "button[class='btn btn-default cart']")
    private WebElement addToCartButton;
    @FindBy(xpath = "//a[@href='/view_cart']")
    private WebElement viewCartButton;

    public void handleConsentPopUp(){
        elementMethods.handleConsentPopup();
    }

    public void clickSignupLogin(){
        elementMethods.clickJSElement(signupLoginMenu);
        loggerUtility.infoLog("The User clicks on Signup/Login menu ");
    }

    public void clickContactUs(){
        elementMethods.clickJSElement(contactUsMenu);
        loggerUtility.infoLog("The User clicks on Contact us menu ");
    }

    public void clickProductsButton(){
        elementMethods.clickJSElement(productsButton);
        loggerUtility.infoLog("The User clicks on Product button ");
    }

    public void clickMenOption(){
        elementMethods.clickJSElement(menCategoryMenu);
        loggerUtility.infoLog("The User clicks on Man Option ");
    }

    public void clickCart(){
        elementMethods.clickJSElement(cartMenu);
        loggerUtility.infoLog("The User clicks on Cart menu ");
    }

    public void clickViewProduct2(){
        elementMethods.clickJSElement(viewProduct2);
        loggerUtility.infoLog("The User clicks on View Product ");
    }

    public void setQuantity(int quantity){
        quantityInput.clear();
        quantityInput.sendKeys(String.valueOf(quantity));
    }

    public void clickAddToCart(){
        elementMethods.clickJSElement(addToCartButton);
        loggerUtility.infoLog("The User clicks on Add to cart button ");
    }

    public void clickViewCart(){
        elementMethods.clickJSElement(viewCartButton);
        loggerUtility.infoLog("The User clicks on View Cart Option ");
    }

}
