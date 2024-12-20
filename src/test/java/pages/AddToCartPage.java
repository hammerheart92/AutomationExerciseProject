package pages;

import helpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "2")
    public WebElement addProduct2;

    public void clickAddToCart(){
        elementMethods.clickJSElement(addProduct2);
    }
}


