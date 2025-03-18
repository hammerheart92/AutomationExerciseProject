package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signupLoginMenu;
    @FindBy(xpath = "//i[@class='fa fa-envelope']")
    public WebElement contactUsMenu;
    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsButton;
    @FindBy(xpath = "//a[normalize-space()='Men']")
    public WebElement menCategoryMenu;
    @FindBy(css = "i[class='fa fa-shopping-cart']")
    public WebElement cartMenu;
    @FindBy(xpath = "//a[@href='/product_details/2']")
    public WebElement viewProduct2;
    @FindBy(id = "quantity")
    public WebElement quantityInput;
    @FindBy(css = "button[class='btn btn-default cart']")
    public WebElement addToCartButton;
    @FindBy(xpath = "//a[@href='/view_cart']")
    public WebElement viewCartButton;

    public void clickSignupLogin(){
        elementMethods.clickJSElement(signupLoginMenu);
    }

    public void clickContactUs(){
        elementMethods.clickJSElement(contactUsMenu);
    }

    public void clickProductsButton(){
        elementMethods.clickJSElement(productsButton);
    }

    public void clickMenOption(){
        elementMethods.clickJSElement(menCategoryMenu);
    }

    public void clickCart(){
        elementMethods.clickJSElement(cartMenu);
    }

    public void clickViewProduct2(){
        elementMethods.clickJSElement(viewProduct2);
    }

    public void setQuantity(int quantity){
        quantityInput.clear();
        quantityInput.sendKeys(String.valueOf(quantity));
    }

    public void clickAddToCart(){
        elementMethods.clickJSElement(addToCartButton);
    }

    public void clickViewCart(){
        elementMethods.clickJSElement(viewCartButton);
    }
}
