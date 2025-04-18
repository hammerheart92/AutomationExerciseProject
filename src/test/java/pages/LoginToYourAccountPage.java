package pages;

import modelObject.LoginToYourAccountModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginToYourAccountPage extends BasePage{

    public LoginToYourAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[data-qa='login-email']")
    private WebElement emailAddressElement;
    @FindBy(css = "input[data-qa='login-password']")
    private WebElement passwordElement;
    @FindBy(css = "button[data-qa='login-button']")
    private WebElement loginButton;
    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    private WebElement deleteAccountFromLoginElement;
    @FindBy(xpath = "//a[contains(@class, 'btn-primary') and text()='Continue']")
    private WebElement continueButton2FromLoginPage;

    public void fillEmailPassword(LoginToYourAccountModel testData){
        elementMethods.fillElementWithFallback(emailAddressElement, testData.getEmailAddress());
        loggerUtility.infoLog("The User fills Email Address field with " + testData.getEmailAddress() + " value");
        Assert.assertEquals(emailAddressElement.getAttribute("value"),testData.getEmailAddress());
        elementMethods.fillElementWithFallback(passwordElement, testData.getPassword());
        loggerUtility.infoLog("The User fills Password field with " + testData.getPassword() + " value");
        Assert.assertEquals(passwordElement.getAttribute("value"),testData.getPassword());
    }

    public void clickLogin(){
        elementMethods.clickJSElement(loginButton);
        loggerUtility.infoLog("The User clicks on Login button");
    }

    public void deleteAccountFromLoginPage(){
        elementMethods.clickJSElement(deleteAccountFromLoginElement);
    }

    public void clickContinueButtonFromLoginPage(){
        elementMethods.clickJSElement(continueButton2FromLoginPage);
    }
}