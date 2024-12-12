package pages;

import helpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressInformationPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public AddressInformationPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "first_name")
    public WebElement firstNameElement;
    @FindBy(id = "last_name")
    public WebElement lastNameElement;
    @FindBy(id = "company")
    public WebElement companyElement;
    @FindBy(id = "address1")
    public WebElement addressElement;
    @FindBy(id = "address2")
    public WebElement address2Element;
    @FindBy(id = "country")
    public WebElement countryElement;
    @FindBy(id = "state")
    public WebElement stateElement;
    @FindBy(id = "city")
    public WebElement cityElement;
    @FindBy(id = "zipcode")
    public WebElement zipCodeElement;
    @FindBy(id = "mobile_number")
    public WebElement mobileNumberElement;
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    public WebElement createAccountButton;

    public void fillAddressInformation(String firstNameValue, String lastNameValue, String companyValue, String addressValue,
                                       String address2Value, String countryValue, String stateValue, String cityValue, String zipCodeValue, String mobileNumberValue) {
        System.out.println("Completez informațiile de adresă.");
        elementMethods.fillElementWithFallback(firstNameElement, firstNameValue);
        elementMethods.fillElementWithFallback(lastNameElement, lastNameValue);
        elementMethods.fillElementWithFallback(companyElement, companyValue);
        elementMethods.fillElementWithFallback(addressElement, addressValue);
        elementMethods.fillElementWithFallback(address2Element, address2Value);
        elementMethods.selectDropdownElement(countryElement, countryValue);
        elementMethods.fillElementWithFallback(stateElement, stateValue);
        elementMethods.fillElementWithFallback(cityElement, cityValue);
        elementMethods.fillElementWithFallback(zipCodeElement, zipCodeValue);
        elementMethods.fillElementWithFallback(mobileNumberElement, mobileNumberValue);
    }

    public void clickCreateAccount() {
        System.out.println("Apăs pe butonul Create Account.");
        elementMethods.waitVisibleElement(createAccountButton);
        elementMethods.clickJSElement(createAccountButton);
    }
}
