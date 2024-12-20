package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginToYourAccountPage;

import java.time.Duration;

public class LoginToYourAccountTest {

    public WebDriver driver;

    @Test
    public void testMethod() {

        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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