package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AddressInformationPage;
import pages.HomePage;
import pages.NewUserSignupPage;

import java.time.Duration;

public class NewUserSignupTest {

    public WebDriver driver;

    @Test
    public void testMethod() {

        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String name = "Laszlo";
        String emailAddress = "laszlo" + System.currentTimeMillis() + "@test.com";
        String password = "gothicChichi";
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
        System.out.println("Am completat numele și email-ul.");

        newUserSignupPage.clickSignupButton();
        System.out.println("Am apăsat pe butonul Signup.");

        newUserSignupPage.clickSelectTitle();
        System.out.println("Titlul selectat.");

        newUserSignupPage.fillPasswordField(password);
        System.out.println("Parola completată.");

        newUserSignupPage.selectDateOfBirth(dateOfBirthDay, dateOfBirthMonth, dateOfBirthYear);
        System.out.println("Data nașterii selectată.");

        newUserSignupPage.selectOptionFromCheckbox();
        System.out.println("Checkbox-urile selectate.");

        AddressInformationPage addressInformationPage = new AddressInformationPage(driver);
        addressInformationPage.fillAddressInformation(firstName, lastName, company, address, address2, country,
                state, city, zipCode, mobileNumber);
        System.out.println("Informațiile de adresă completate.");

        addressInformationPage.clickCreateAccount();
        System.out.println("Contul a fost creat.");

        newUserSignupPage.clickContinueButton();
        System.out.println("Am apăsat pe butonul Continue.");

        newUserSignupPage.clickDeleteAccount();
        System.out.println("Contul a fost șters cu succes.");

        newUserSignupPage.clickContinueButton2();
    }
}