package pages;

import modelObject.NewUserSignupModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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

    public void fillAddressInformation(NewUserSignupModel testData) {
        elementMethods.fillElementWithFallback(firstNameElement, testData.getFirstName());
        loggerUtility.infoLog("The User fills First Name field with " + testData.getFirstName() + " value");
        Assert.assertEquals(firstNameElement.getAttribute("value"), testData.getFirstName(), "First Name field was not populated correctly!");
        elementMethods.fillElementWithFallback(lastNameElement, testData.getLastName());
        loggerUtility.infoLog("The User fills Last Name field with " + testData.getLastName() + " value");
        Assert.assertEquals(lastNameElement.getAttribute("value"), testData.getLastName(), "Last Name field was not populated correctly!");
        elementMethods.fillElementWithFallback(companyElement, testData.getCompany());
        loggerUtility.infoLog("The User fills Company field with " + testData.getCompany() + " value");
        Assert.assertEquals(companyElement.getAttribute("value"), testData.getCompany(), "Company field was not populated correctly!");
        elementMethods.fillElementWithFallback(addressElement, testData.getAddress());
        loggerUtility.infoLog("The User fills Address field with " + testData.getAddress() + " value");
        Assert.assertEquals(addressElement.getAttribute("value"), testData.getAddress(), "Address field was not populated correctly!");
        elementMethods.fillElementWithFallback(address2Element, testData.getAddress2());
        loggerUtility.infoLog("The User fills Address2 field with " + testData.getAddress2() + " value");
        Assert.assertEquals(address2Element.getAttribute("value"), testData.getAddress2(), "Address2 field was not populated correctly!");
        elementMethods.selectDropdownElement(countryElement, testData.getCountry());
        loggerUtility.infoLog("The User selects Country from the dropdown list with " + testData.getCountry() + " value");
        Assert.assertEquals(new Select(countryElement).getFirstSelectedOption().getText(), testData.getCountry(), "Country was not selected correctly!");
        elementMethods.fillElementWithFallback(stateElement, testData.getState());
        loggerUtility.infoLog("The User fills State field with " + testData.getState() + " value");
        Assert.assertEquals(stateElement.getAttribute("value"), testData.getState(), "State field was not populated correctly!");
        elementMethods.fillElementWithFallback(cityElement, testData.getCity());
        loggerUtility.infoLog("The User fills City field with " + testData.getCity() + " value");
        Assert.assertEquals(cityElement.getAttribute("value"), testData.getCity(), "City field was not populated correctly!");
        elementMethods.fillElementWithFallback(zipCodeElement, testData.getZipCode());
        loggerUtility.infoLog("The User fills Zip Code field with " + testData.getZipCode() + " value");
        Assert.assertEquals(zipCodeElement.getAttribute("value"), testData.getZipCode(), "Zip Code field was not populated correctly!");
        elementMethods.fillElementWithFallback(mobileNumberElement, testData.getMobileNumber());
        loggerUtility.infoLog("The User fills Mobile Number field with " + testData.getMobileNumber() + " value");
        Assert.assertEquals(mobileNumberElement.getAttribute("value"), testData.getMobileNumber(), "Mobile Number field was not populated correctly!");
    }

    public void clickCreateAccount() {
        elementMethods.waitVisibleElement(createAccountButton);
        loggerUtility.infoLog("Waiting for Create Account Button to be visible");
        elementMethods.clickJSElement(createAccountButton);
        loggerUtility.infoLog("The User clicks on Create Account button");
    }
}
