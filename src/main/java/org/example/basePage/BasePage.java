package org.example.basePage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class BasePage {

    protected WebDriver uiDriver;
    protected FluentWait<WebDriver> wait;
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);


    public BasePage(WebDriver driver){

        this.uiDriver = driver;
        this.wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchFieldException.class);


    }

    public boolean isDisplayed(By by){
        WebElement webElement = waitForVisibilityElement(by,Duration.ofSeconds(30));
        return webElement.isDisplayed();
    }

    public BasePage click(By by){
        WebElement webElement = waitElementToBeClickable(by,Duration.ofSeconds(30));
        webElement.click();
        return this;
    }

    public WebElement waitForVisibilityElement(By by, Duration durationInSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(uiDriver, durationInSeconds);
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (NoSuchElementException | TimeoutException e) {
            LOG.info(e.getMessage());
            return null;
        }
    }

    public WebElement waitElementToBeClickable(By by, Duration durationInSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(uiDriver, durationInSeconds);
            return wait.until(ExpectedConditions.elementToBeClickable(by));
        } catch (NoSuchElementException | ElementClickInterceptedException | TimeoutException e) {
            LOG.info(e.getMessage());
            return null;
        }
    }
}


