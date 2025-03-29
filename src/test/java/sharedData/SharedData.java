package sharedData;

import browserService.ChromeService;
import browserService.EdgeService;
import org.openqa.selenium.WebDriver;

public class SharedData {

    public WebDriver driver;

    public void setUpDriver() {

        String browser = "edge";

        switch (browser){
            case "edge":
                EdgeService edgeService = new EdgeService();
                edgeService.openBrowser();
                driver = edgeService.getDriver();
                break;
            case "chrome":
                ChromeService chromeService = new ChromeService();
                chromeService.openBrowser();
                driver = chromeService.getDriver();
                break;
        }
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void quitDriver() {
        driver.quit();
    }
}
