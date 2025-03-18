package tests;

import org.testng.annotations.Test;
import pages.AddressInformationPage;
import pages.HomePage;
import pages.NewUserSignupPage;
import sharedData.SharedData;

public class NewUserSignupTest extends SharedData {

    @Test
    public void testMethod() {

        String name = "Apaczai";
        String emailAddress = "death_kinght@test.com";
        String password = "nothinng";
        String dateOfBirthDay = "2";
        String dateOfBirthMonth = "January";
        String dateOfBirthYear = "1992";

        String firstName = "Apaczai";
        String lastName = "Laszlo";
        String company = "Vodafone";
        String address = "Str. Ciucas, Nr. 9";
        String address2 = "Str. Sg. Hategan, Bl. A6";
        String country = "New Zealand";
        String state = "Cluj";
        String city = "Cluj - Napoca";
        String zipCode = "323234";
        String mobileNumber = "0754954959";

        HomePage homePage = new HomePage(driver);
        homePage.clickSignupLogin();

        NewUserSignupPage newUserSignupPage = new NewUserSignupPage(driver);
        newUserSignupPage.fillUserEmail(name, emailAddress);
        newUserSignupPage.clickSignupButton();

        newUserSignupPage.clickSelectTitle();
        newUserSignupPage.fillPasswordField(password);
        newUserSignupPage.selectDateOfBirth(dateOfBirthDay, dateOfBirthMonth, dateOfBirthYear);
        newUserSignupPage.selectOptionFromCheckbox();
        AddressInformationPage addressInformationPage = new AddressInformationPage(driver);
        addressInformationPage.fillAddressInformation(firstName, lastName, company, address, address2, country,
                state, city, zipCode, mobileNumber);

        addressInformationPage.clickCreateAccount();
        newUserSignupPage.clickContinueButton();

        newUserSignupPage.clickDeleteAccount();
        System.out.println("Contul a fost șters cu succes.");

        newUserSignupPage.clickContinueButton2();
    }
}