package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginToYourAccountPage;
import sharedData.SharedData;

public class LoginToYourAccountTest extends SharedData {

    @Test
    public void testMethod() {

        String emailAddress = "laszlo@test.com";
        String password = "gothicChichi";

        HomePage homePage = new HomePage(driver);
        homePage.clickSignupLogin();

        LoginToYourAccountPage loginToYourAccountPage = new LoginToYourAccountPage(driver);
        loginToYourAccountPage.fillEmailPassword(emailAddress, password);
        loginToYourAccountPage.clickLogin();

//        loginToYourAccountPage.deleteAccountFromLoginPage();
//        loginToYourAccountPage.clickContinueButtonFromLoginPage();

    }
}