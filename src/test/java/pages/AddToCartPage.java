package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage {

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "2")
    private WebElement addProduct2;

    public void clickAddToCart(){
        elementMethods.clickJSElement(addProduct2);
    }
}


