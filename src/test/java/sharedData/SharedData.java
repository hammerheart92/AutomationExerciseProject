package sharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SharedData {

    public WebDriver driver;

    public void setUpDriver() {

        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void quitDriver() {
        driver.quit();
    }
}
