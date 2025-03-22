package tests;

import modelObject.NewUserSignupModel;
import org.testng.annotations.Test;
import pages.AddressInformationPage;
import pages.HomePage;
import pages.NewUserSignupPage;
import sharedData.Hooks;

public class NewUserSignupTest extends Hooks {

    @Test
    public void testMethod() {

        NewUserSignupModel testData = new NewUserSignupModel("src/test/java/tests/resources/inputData/NewUserSignupResource.json");

        HomePage homePage = new HomePage(driver);
        homePage.handleConsentPopUp();
        homePage.clickSignupLogin();

        NewUserSignupPage newUserSignupPage = new NewUserSignupPage(driver);
        newUserSignupPage.fillUserEmail(testData);
        newUserSignupPage.clickSignupButton();

        newUserSignupPage.clickSelectTitle();
        newUserSignupPage.fillPasswordField(testData);
        newUserSignupPage.selectDateOfBirth(testData);
        newUserSignupPage.selectOptionFromCheckbox();

        AddressInformationPage addressInformationPage = new AddressInformationPage(driver);
        addressInformationPage.fillAddressInformation(testData);

        addressInformationPage.clickCreateAccount();
        newUserSignupPage.clickContinueButton();

        newUserSignupPage.clickDeleteAccount();

        newUserSignupPage.clickContinueButton2();
    }
}