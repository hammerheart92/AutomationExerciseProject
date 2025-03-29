package tests;

import helpMethods.AlertMethods;
import modelObject.ContactUsModel;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;
import sharedData.Hooks;

public class ContactUsTest extends Hooks {

    @Test
    public void testMethod() {

        ContactUsModel testData = new ContactUsModel("src/test/java/tests/resources/inputData/ContactUsResource.json");

        HomePage homePage = new HomePage(driver);
        homePage.handleConsentPopUp();
        homePage.clickContactUs();

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.fillContactUsPageWithProvidedData(testData);
        contactUsPage.clickSubmitButton();

        AlertMethods alertMethods = new AlertMethods(driver);
        alertMethods.acceptAlert();

    }
}