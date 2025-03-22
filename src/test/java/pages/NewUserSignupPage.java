package pages;

import modelObject.NewUserSignupModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewUserSignupPage extends BasePage {

    public NewUserSignupPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[data-qa='signup-name']")
    private WebElement nameElement;
    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement emailAddressElement;
    @FindBy(css = "button[data-qa='signup-button']")
    private WebElement signupElement;
    @FindBy(xpath = "//input[@id='id_gender1']") // Locator reparat
    private WebElement selectTitleElement;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordElement;
    @FindBy(id = "days")
    private WebElement dateOfBirthDayElement;
    @FindBy(id = "months")
    private WebElement dateOfBirthMonthElement;
    @FindBy(id = "years")
    private WebElement dateOfBirthYearElement;
    @FindBy(id = "newsletter")
    private WebElement signUpForOurNewsLetterCheckbox;
    @FindBy(id = "optin")
    private WebElement receiveSpecialOffersFromOurPartnersCheckbox;
    @FindBy(linkText = "Continue")
    private WebElement continueButton;
    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    private WebElement deleteAccountElement;
    @FindBy(xpath = "//a[contains(@class, 'btn-primary') and text()='Continue']")
    private WebElement continueButton2;

    public void fillUserEmail(NewUserSignupModel testData) {
        elementMethods.waitVisibleElement(nameElement);
        loggerUtility.infoLog("Wait until the page is loaded");
        elementMethods.fillElementWithFallback(nameElement, testData.getName());
        loggerUtility.infoLog("The User fills Name field with " + testData.getName() + " value");
        elementMethods.fillElementWithFallback(emailAddressElement, testData.getEmailAddress());
        loggerUtility.infoLog("The User fills Email Address field with " + testData.getEmailAddress() + " value");
    }

    public void clickSignupButton() {
        elementMethods.clickJSElement(signupElement);
        loggerUtility.infoLog("The User clicks on Sign Up button");
    }

    public void clickSelectTitle() {
        elementMethods.clickJSElement(selectTitleElement);
        loggerUtility.infoLog("The User selects the title");
    }

    public void fillPasswordField(NewUserSignupModel testData) {
        elementMethods.fillElementWithFallback(passwordElement, testData.getPassword());
        loggerUtility.infoLog("The User fills Password field with " + testData.getPassword() + " value");
    }

    public void selectDateOfBirth(NewUserSignupModel testData) {
        elementMethods.selectDropdownElement(dateOfBirthDayElement, testData.getDateOfBirthDay());
        elementMethods.selectDropdownElement(dateOfBirthMonthElement, testData.getDateOfBirthMonth());
        elementMethods.selectDropdownElement(dateOfBirthYearElement, testData.getDateOfBirthYear());
        loggerUtility.infoLog("The User selects Date of Birth: Day " + testData.getDateOfBirthDay() + ", Month " + testData.getDateOfBirthMonth() + ", Year " + testData.getDateOfBirthYear());
    }

    public void selectOptionFromCheckbox() {
        elementMethods.clickJSElement(signUpForOurNewsLetterCheckbox);
        loggerUtility.infoLog("The User selects Sign up for our newsletter! from the checkbox");
        elementMethods.clickJSElement(receiveSpecialOffersFromOurPartnersCheckbox);
        loggerUtility.infoLog("The User selects Receive special offers from our partners! from the checkbox");
    }

    public void clickContinueButton() {
        elementMethods.waitVisibleElement(continueButton);
        loggerUtility.infoLog("Wait until next page is loaded");
        elementMethods.clickJSElement(continueButton);
        loggerUtility.infoLog("The User clicks on continue button");
    }

    public void clickDeleteAccount(){
        elementMethods.waitVisibleElement(deleteAccountElement);
        loggerUtility.infoLog("Wait until Delete Account option is visible");
        elementMethods.clickJSElement(deleteAccountElement);
        loggerUtility.infoLog("The User clicks on Delete Account");
    }

    public void clickContinueButton2(){
        elementMethods.clickJSElement(continueButton2);
        loggerUtility.infoLog("The User clicks on Continue Button");
    }
}
