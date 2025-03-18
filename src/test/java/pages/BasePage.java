package pages;

import helpMethods.AlertMethods;
import helpMethods.ElementMethods;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public LoggerUtility loggerUtility;
    public AlertMethods alertMethods;
    public ElementMethods elementMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        loggerUtility = new LoggerUtility();
        alertMethods = new AlertMethods(this.driver);
        elementMethods = new ElementMethods(this.driver);
        PageFactory.initElements(this.driver, this);
    }
}
