package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewUserSignupPage extends BasePage {

    public NewUserSignupPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[data-qa='signup-name']")
    public WebElement nameElement;
    @FindBy(css = "input[data-qa='signup-email']")
    public WebElement emailAddressElement;
    @FindBy(css = "button[data-qa='signup-button']")
    public WebElement signupElement;
    @FindBy(xpath = "//input[@id='id_gender1']") // Locator reparat
    public WebElement selectTitleElement;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordElement;
    @FindBy(id = "days")
    public WebElement dateOfBirthDayElement;
    @FindBy(id = "months")
    public WebElement dateOfBirthMonthElement;
    @FindBy(id = "years")
    public WebElement dateOfBirthYearElement;
    @FindBy(id = "newsletter")
    public WebElement signUpForOurNewsLetterCheckbox;
    @FindBy(id = "optin")
    public WebElement receiveSpecialOffersFromOurPartnersCheckbox;
    @FindBy(linkText = "Continue")
    public WebElement continueButton;
    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    public WebElement deleteAccountElement;
    @FindBy(xpath = "//a[contains(@class, 'btn-primary') and text()='Continue']")
    public WebElement continueButton2;

    public void fillUserEmail(String nameValue, String emailAddressValue) {
        System.out.println("Completez câmpurile Name și Email.");
        elementMethods.waitVisibleElement(nameElement);
        elementMethods.fillElementWithFallback(nameElement, nameValue);
        elementMethods.fillElementWithFallback(emailAddressElement, emailAddressValue);
    }

    public void clickSignupButton() {
        System.out.println("Apăs pe butonul Signup.");
        elementMethods.clickJSElement(signupElement);
    }

    public void clickSelectTitle() {
        System.out.println("Selectez titlul.");
        elementMethods.clickJSElement(selectTitleElement);
    }

    public void fillPasswordField(String passwordValue) {
        System.out.println("Completez câmpul Password.");
        elementMethods.fillElementWithFallback(passwordElement, passwordValue);
    }

    public void selectDateOfBirth(String dateOfBirthDayValue, String dateOfBirthMonthValue, String dateOfBirthYearValue) {
        System.out.println("Selectez data de naștere: ziua " + dateOfBirthDayValue + ", luna " + dateOfBirthMonthValue + ", anul " + dateOfBirthYearValue);
        elementMethods.selectDropdownElement(dateOfBirthDayElement, dateOfBirthDayValue);
        elementMethods.selectDropdownElement(dateOfBirthMonthElement, dateOfBirthMonthValue);
        elementMethods.selectDropdownElement(dateOfBirthYearElement, dateOfBirthYearValue);
    }

    public void selectOptionFromCheckbox() {
        System.out.println("Selectez checkbox-urile.");
        elementMethods.clickJSElement(signUpForOurNewsLetterCheckbox);
        elementMethods.clickJSElement(receiveSpecialOffersFromOurPartnersCheckbox);
    }

    public void clickContinueButton() {
        System.out.println("Apăs pe butonul Continue.");
        elementMethods.waitVisibleElement(continueButton);
        elementMethods.clickJSElement(continueButton);
    }

    public void clickDeleteAccount(){
        System.out.println("Apăs pe butonul Delete Account.");
        elementMethods.waitVisibleElement(deleteAccountElement);
        elementMethods.clickJSElement(deleteAccountElement);
    }

    public void clickContinueButton2(){
        elementMethods.clickJSElement(continueButton2);
    }
}
