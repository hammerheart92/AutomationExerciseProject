package helpMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sharedData.Hooks;

import java.time.Duration;
import java.util.List;

public class ElementMethods extends Hooks {

    public WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(WebElement element) {
        waitVisibleElement(element);
        element.click();
    }

    public void clickJSElement(WebElement element) {
        waitVisibleElement(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public void fillElement(WebElement element, String text) {
        waitVisibleElement(element);
        element.sendKeys(text);
    }

    public void fillPressElement(WebElement element, String text, Keys value) {
        waitVisibleElement(element);
        element.sendKeys(text);
        element.sendKeys(value);
    }

    public void waitVisibleElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void selectDropdownElement(WebElement element, String text) {
        waitVisibleElement(element);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void clearEditElement(WebElement element, String text) {
        waitVisibleElement(element);
        element.clear();
        element.sendKeys(text);
    }


    public void clearElement(WebElement element) {
        waitVisibleElement(element);
        element.clear();
    }


    public void fillElementWithFallback(WebElement element, String value) {
        try {
            // Așteaptă ca elementul să fie vizibil și interactiv
            waitVisibleElement(element);
            if (element.isDisplayed() && element.isEnabled()) {
                element.clear();
                element.sendKeys(value);
//
            } else {
                throw new ElementNotInteractableException("Elementul nu este interactiv.");
            }
        } catch (ElementNotInteractableException e) {
            // Fallback: JavaScriptExecutor
//
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='" + value + "';", element);
        } catch (Exception ex) {
            System.out.println("Eroare la completare: " + ex.getMessage());
        }
    }

    public void hoverOverElement(WebElement element) {
        waitVisibleElement(element); // Ensure the element is visible
        Actions actions = new Actions(driver); // Initialize the Actions class
        actions.moveToElement(element).perform(); // Move to the element
    }

    public void handleConsentPopup() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            // Updated locator: Finds the button with exact text "Consent"
            By consentButtonLocator = By.xpath("//button[normalize-space()='Consent']");

            WebElement consentButton = wait.until(ExpectedConditions.elementToBeClickable(consentButtonLocator));

            if (consentButton.isDisplayed()) {
                loggerUtility.infoLog("Consent pop-up detected. Attempting to close...");

                try {
                    consentButton.click();
                    loggerUtility.infoLog("Consent pop-up successfully accepted.");
                } catch (Exception e) {
                    loggerUtility.infoLog("Normal click failed, trying JavaScript...");
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].click();", consentButton);
                    loggerUtility.infoLog("JavaScript click executed successfully.");
                }
            }
        } catch (TimeoutException | NoSuchElementException e) {
            loggerUtility.infoLog("No consent pop-up found, continuing test.");
        }
    }

}