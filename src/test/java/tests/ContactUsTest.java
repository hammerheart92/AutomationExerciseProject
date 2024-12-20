package tests;

import helpMethods.AlertMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

import java.nio.file.Paths;
import java.time.Duration;

public class ContactUsTest {

    public WebDriver driver;

    @Test
    public void testMethod() {

        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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