package pages;

import modelObject.NewUserSignupModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
        Assert.assertEquals(nameElement.getAttribute("value"),testData.getName(),"Name field was not populated correctly!");
        elementMethods.fillElementWithFallback(emailAddressElement, testData.getEmailAddress());
        loggerUtility.infoLog("The User fills Email Address field with " + testData.getEmailAddress() + " value");
        Assert.assertEquals(emailAddressElement.getAttribute("value"),testData.getEmailAddress(),"Email Address field was not populated correctly!");
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
        Assert.assertEquals(passwordElement.getAttribute("value"),testData.getPassword(),"Password field was not populated correctly!");
    }

    public void selectDateOfBirth(NewUserSignupModel testData) {
        // Assert that the date dropdowns are displayed
        Assert.assertTrue(dateOfBirthDayElement.isDisplayed(), "Day dropdown is not displayed!");
        Assert.assertTrue(dateOfBirthMonthElement.isDisplayed(), "Month dropdown is not displayed!");
        Assert.assertTrue(dateOfBirthYearElement.isDisplayed(), "Year dropdown is not displayed!");

        // Select the dropdown elements and log the actions
        elementMethods.selectDropdownElement(dateOfBirthDayElement, testData.getDateOfBirthDay());
        String selectedDay = new org.openqa.selenium.support.ui.Select(dateOfBirthDayElement).getFirstSelectedOption().getText();
        Assert.assertEquals(selectedDay, testData.getDateOfBirthDay(), "Day value was not set correctly!");

        elementMethods.selectDropdownElement(dateOfBirthMonthElement, testData.getDateOfBirthMonth());
        String selectedMonth = new org.openqa.selenium.support.ui.Select(dateOfBirthMonthElement).getFirstSelectedOption().getText();
        Assert.assertEquals(selectedMonth, testData.getDateOfBirthMonth(), "Month value was not set correctly!");

        elementMethods.selectDropdownElement(dateOfBirthYearElement, testData.getDateOfBirthYear());
        String selectedYear = new org.openqa.selenium.support.ui.Select(dateOfBirthYearElement).getFirstSelectedOption().getText();
        Assert.assertEquals(selectedYear, testData.getDateOfBirthYear(), "Year value was not set correctly!");

        // Log the successful selection
        loggerUtility.infoLog("The User selects Date of Birth: Day " + selectedDay + ", Month " + selectedMonth + ", Year " + selectedYear);
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
