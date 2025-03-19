package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressInformationPage extends BasePage {

    public AddressInformationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first_name")
    private WebElement firstNameElement;
    @FindBy(id = "last_name")
    private WebElement lastNameElement;
    @FindBy(id = "company")
    private WebElement companyElement;
    @FindBy(id = "address1")
    private WebElement addressElement;
    @FindBy(id = "address2")
    private WebElement address2Element;
    @FindBy(id = "country")
    private WebElement countryElement;
    @FindBy(id = "state")
    private WebElement stateElement;
    @FindBy(id = "city")
    private WebElement cityElement;
    @FindBy(id = "zipcode")
    private WebElement zipCodeElement;
    @FindBy(id = "mobile_number")
    private WebElement mobileNumberElement;
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    private WebElement createAccountButton;

    public void handleConsentPopUp(){
        elementMethods.handleConsentPopup();
    }

    public void fillAddressInformation(String firstNameValue, String lastNameValue, String companyValue, String addressValue,
                                       String address2Value, String countryValue, String stateValue,
                                       String cityValue, String zipCodeValue, String mobileNumberValue) {
        elementMethods.fillElementWithFallback(firstNameElement, firstNameValue);
        loggerUtility.infoLog("The User fills First Name field with " + firstNameValue + " value");
        elementMethods.fillElementWithFallback(lastNameElement, lastNameValue);
        loggerUtility.infoLog("The User fills Last Name field with " + lastNameValue + " value");
        elementMethods.fillElementWithFallback(companyElement, companyValue);
        loggerUtility.infoLog("The User fills Company field with " + companyValue + " value");
        elementMethods.fillElementWithFallback(addressElement, addressValue);
        loggerUtility.infoLog("The User fills Address field with " + addressValue + " value");
        elementMethods.fillElementWithFallback(address2Element, address2Value);
        loggerUtility.infoLog("The User fills Address2 field with " + address2Value + " value");
        elementMethods.selectDropdownElement(countryElement, countryValue);
        loggerUtility.infoLog("The User selects Country from the dropdown list with " + countryValue + " value");
        elementMethods.fillElementWithFallback(stateElement, stateValue);
        loggerUtility.infoLog("The User fills State field with " + stateValue + " value");
        elementMethods.fillElementWithFallback(cityElement, cityValue);
        loggerUtility.infoLog("The User fills City field with " + cityValue + " value");
        elementMethods.fillElementWithFallback(zipCodeElement, zipCodeValue);
        loggerUtility.infoLog("The User fills Zip Code field with " + zipCodeValue + " value");
        elementMethods.fillElementWithFallback(mobileNumberElement, mobileNumberValue);
        loggerUtility.infoLog("The User fills Mobile Number field with " + mobileNumberValue + " value");
    }

    public void clickCreateAccount() {
        elementMethods.waitVisibleElement(createAccountButton);
        loggerUtility.infoLog("Waiting for Create Account Button to be visible");
        elementMethods.clickJSElement(createAccountButton);
        loggerUtility.infoLog("The User clicks on Create Account button");
    }
}
