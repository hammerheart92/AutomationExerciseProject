package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage{

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@data-qa='name']")
    private WebElement nameElement;
    @FindBy(xpath = "//input[@data-qa='email']")
    private WebElement emailElement;
    @FindBy(xpath = "//input[@data-qa='subject']")
    private WebElement subjectElement;
    @FindBy(id = "message")
    private WebElement typeMessageElement;
    @FindBy(xpath = "//input[@name='upload_file']")
    private WebElement uploadFileElement;
    @FindBy(xpath = "//input[@data-qa='submit-button']")
    private WebElement submitButtonElement;
    @FindBy(xpath = "//button[@aria-label='Accept all']")
    private WebElement acceptAllButton;

    public void fillContactUsPageWithProvidedData(String nameValue, String emailValue, String subjectValue,
                                                  String typeMessageValue, String uploadFileValue){
        elementMethods.fillElementWithFallback(nameElement, nameValue);
        loggerUtility.infoLog("The User fills Name field with " + nameValue + " value");
        elementMethods.fillElementWithFallback(emailElement, emailValue);
        loggerUtility.infoLog("The User fills Email field with " + emailValue + " value");
        elementMethods.fillElementWithFallback(subjectElement, subjectValue);
        loggerUtility.infoLog("The User fills Subject field with " + subjectValue + " value");
        elementMethods.fillElementWithFallback(typeMessageElement, typeMessageValue);
        loggerUtility.infoLog("The User fills Your Message Here field with " + typeMessageValue + " value");
        elementMethods.fillElementWithFallback(uploadFileElement, uploadFileValue);
        loggerUtility.infoLog("the User uploads a file" + uploadFileValue);
    }

    public void clickSubmitButton(){
        elementMethods.clickJSElement(submitButtonElement);
        loggerUtility.infoLog("The User clicks on Submit Button");
//        elementMethods.clickJSElement(acceptAllButton);
    }

//    public void acceptConsentPopup() {
//        if (acceptAllButton.isDisplayed()) {
//            acceptAllButton.click();
//        }
//    }
}




