package tests;

import modelObject.LoginToYourAccountModel;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginToYourAccountPage;
import sharedData.Hooks;

public class LoginToYourAccountTest extends Hooks {

    @Test
    public void testMethod() {

        LoginToYourAccountModel testData = new LoginToYourAccountModel("src/test/java/tests/resources/inputData/LoginToYourAccountResource.json");

        HomePage homePage = new HomePage(driver);
        homePage.handleConsentPopUp();
        homePage.clickSignupLogin();

        LoginToYourAccountPage loginToYourAccountPage = new LoginToYourAccountPage(driver);
        loginToYourAccountPage.fillEmailPassword(testData);
        loginToYourAccountPage.clickLogin();
    }
}