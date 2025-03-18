package pages;

import helpMethods.AlertMethods;
import helpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public AlertMethods alertMethods;
    public ElementMethods elementMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        alertMethods = new AlertMethods(this.driver);
        elementMethods = new ElementMethods(this.driver);
        PageFactory.initElements(this.driver, this);
    }
}
