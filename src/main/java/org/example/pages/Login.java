package org.example.pages;

import org.example.basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage {

    private final By email_txtBox = By.xpath("//INPUT[@name='userName']");
    private final By password_txtBox = By.xpath("//INPUT[@name='password']");
    private final By btn = By.xpath("//button[@type='submit']");


    public Login(WebDriver uiDriver) {
        super(uiDriver);
        this.uiDriver = uiDriver;
    }

    public void enterEmailAddress(String Email){

        uiDriver.findElement(email_txtBox).sendKeys(Email);

    }
    public void enterPassword(String Password){

        uiDriver.findElement(password_txtBox).sendKeys(Password);
    }
    public DashBroad clickLoginBtn(){

        uiDriver.findElement(btn).click();
        return new DashBroad(uiDriver);


    }
}
