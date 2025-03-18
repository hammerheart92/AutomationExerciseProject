package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginToYourAccountPage extends BasePage{

    public LoginToYourAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[data-qa='login-email']")
    public WebElement emailAddressElement;
    @FindBy(css = "input[data-qa='login-password']")
    public WebElement passwordElement;
    @FindBy(css = "button[data-qa='login-button']")
    public WebElement loginButton;
    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    public WebElement deleteAccountFromLoginElement;
    @FindBy(xpath = "//a[contains(@class, 'btn-primary') and text()='Continue']")
    public WebElement continueButton2FromLoginPage;

    public void fillEmailPassword(String emailAddressValue, String passwordValue){
        elementMethods.fillElementWithFallback(emailAddressElement, emailAddressValue);
        elementMethods.fillElementWithFallback(passwordElement, passwordValue);
    }

    public void clickLogin(){
        elementMethods.clickJSElement(loginButton);
    }

    public void deleteAccountFromLoginPage(){
        elementMethods.clickJSElement(deleteAccountFromLoginElement);
    }

    public void clickContinueButtonFromLoginPage(){
        elementMethods.clickJSElement(continueButton2FromLoginPage);
    }
}