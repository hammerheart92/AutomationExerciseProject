package pages;

import modelObject.ContactUsModel;
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

    public void fillContactUsPageWithProvidedData(ContactUsModel testData){
        elementMethods.fillElementWithFallback(nameElement, testData.getName());
        loggerUtility.infoLog("The User fills Name field with " + testData.getName() + " value");
        elementMethods.fillElementWithFallback(emailElement, testData.getEmail());
        loggerUtility.infoLog("The User fills Email field with " + testData.getEmail() + " value");
        elementMethods.fillElementWithFallback(subjectElement, testData.getSubject());
        loggerUtility.infoLog("The User fills Subject field with " + testData.getSubject() + " value");
        elementMethods.fillElementWithFallback(typeMessageElement, testData.getMessage());
        loggerUtility.infoLog("The User fills Your Message Here field with " + testData.getMessage() + " value");
        elementMethods.fillElementWithFallback(uploadFileElement, testData.getUploadFilePath());
        loggerUtility.infoLog("the User uploads a file" + testData.getUploadFilePath());
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




