package pages;

import modelObject.ContactUsModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.File;

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
        Assert.assertEquals(nameElement.getAttribute("value"), testData.getName(), "Name field was not populated correctly!");

        elementMethods.fillElementWithFallback(emailElement, testData.getEmail());
        loggerUtility.infoLog("The User fills Email field with " + testData.getEmail() + " value");
        Assert.assertEquals(emailElement.getAttribute("value"), testData.getEmail(), "Email field was not populated correctly!");

        elementMethods.fillElementWithFallback(subjectElement, testData.getSubject());
        loggerUtility.infoLog("The User fills Subject field with " + testData.getSubject() + " value");
        Assert.assertEquals(subjectElement.getAttribute("value"), testData.getSubject(), "Subject field was not populated correctly!");

        elementMethods.fillElementWithFallback(typeMessageElement, testData.getMessage());
        loggerUtility.infoLog("The User fills Your Message Here field with " + testData.getMessage() + " value");
        Assert.assertEquals(typeMessageElement.getAttribute("value"), testData.getMessage(), "Message field was not populated correctly!");

        String absoluteFilePath = new File(testData.getUploadFilePath()).getAbsolutePath();
        elementMethods.fillElementWithFallback(uploadFileElement, absoluteFilePath);
        loggerUtility.infoLog("The User uploads a file: " + absoluteFilePath);

        // Assert that the file element has been populated (cannot check the actual path due to security restrictions)
        Assert.assertFalse(uploadFileElement.getAttribute("value").isEmpty(), "File upload field is empty!");
    }

    public void clickSubmitButton(){
        elementMethods.clickJSElement(submitButtonElement);
        loggerUtility.infoLog("The User clicks on Submit Button");
    }
}




