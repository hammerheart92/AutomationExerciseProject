package sharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SharedData {

    public WebDriver driver;

    public void setUpDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run without GUI
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
        options.addArguments("--window-size=1920x1080"); // Set the window size to full HD
        options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration (useful for CI environments)
        options.addArguments("--remote-allow-origins=*"); // Allow all origins for remote connections


        driver = new ChromeDriver(options);
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("Browser setup completed and opened the URL: " + driver.getCurrentUrl());
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void quitDriver() {
        driver.quit();
    }
}
