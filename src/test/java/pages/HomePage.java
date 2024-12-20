package pages;

import helpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        PageFactory.initElements(this.driver,this);
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
}
