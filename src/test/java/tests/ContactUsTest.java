package tests;

import helpMethods.AlertMethods;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;
import sharedData.Hooks;

import java.nio.file.Paths;

public class ContactUsTest extends Hooks {

    @Test
    public void testMethod() {

        String name = "Laszlo";
        String email = "testautomation@test.com";
        String subject = "Automation test";
        String message = "This is an automation test";
        String uploadFilePath = Paths.get("src/test/java/tests/resources/Test_file.txt").toAbsolutePath().toString();

        HomePage homePage = new HomePage(driver);
        homePage.clickContactUs();

        ContactUsPage contactUsPage = new ContactUsPage(driver);
//        contactUsPage.acceptConsentPopup();
        contactUsPage.fillContactUsPageWithProvidedData(name, email, subject, message, uploadFilePath);
        contactUsPage.clickSubmitButton();

        AlertMethods alertMethods = new AlertMethods(driver);
        alertMethods.acceptAlert();

    }
}