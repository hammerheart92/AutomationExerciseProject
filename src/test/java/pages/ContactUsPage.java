package pages;

import helpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//input[@data-qa='name']")
    public WebElement nameElement;
    @FindBy(xpath = "//input[@data-qa='email']")
    public WebElement emailElement;
    @FindBy(xpath = "//input[@data-qa='subject']")
    public WebElement subjectElement;
    @FindBy(id = "message")
    public WebElement typeMessageElement;
    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFileElement;
    @FindBy(xpath = "//input[@data-qa='submit-button']")
    public WebElement submitButtonElement;
    @FindBy(xpath = "//button[@aria-label='Accept all']")
    public WebElement acceptAllButton;


    public void fillContactUsPageWithProvidedData(String nameValue, String emailValue, String subjectValue,
                                                  String typeMessageValue, String uploadFileValue){
        elementMethods.fillElementWithFallback(nameElement, nameValue);
        elementMethods.fillElementWithFallback(emailElement, emailValue);
        elementMethods.fillElementWithFallback(subjectElement, subjectValue);
        elementMethods.fillElementWithFallback(typeMessageElement, typeMessageValue);
        elementMethods.fillElementWithFallback(uploadFileElement, uploadFileValue);
    }

    public void clickSubmitButton(){
        elementMethods.clickJSElement(submitButtonElement);
//        elementMethods.clickJSElement(acceptAllButton);
    }

//    public void acceptConsentPopup() {
//        if (acceptAllButton.isDisplayed()) {
//            acceptAllButton.click();
//        }
//    }
}




