package org.example.pages;

import org.example.basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBroad extends BasePage {

    public DashBroad(WebDriver uiDriver) {
        super(uiDriver);
        this.uiDriver=uiDriver;
    }

    private WebDriver driver;
    private By lnkStudioManagement = By.xpath("//*[text()='Studio Management']");
    private By lnkTemplateManagement = By.xpath("//*[text()='Template Management']");
    private By lnkProductConfiguration = By.xpath("(//*[text()='Product Configuration'])[2]");
    private By lnkHelpResourceManagement = By.xpath("//*[text()='Help Resource Management']");
    private By lnkStudioUsageReport = By.xpath("(//*[text()='Studio Usage Report'])[2]");

    public DashBroad checkStudioManagementText (){
        isDisplayed(lnkStudioManagement);
        return this;
    }

    public DashBroad checkTemplateManagementText (){
        isDisplayed(lnkTemplateManagement);
        return this;
    }

    public DashBroad checkProductConfigurationText (){
        isDisplayed(lnkProductConfiguration);
        return this;
    }

    public DashBroad checkHelpResourceManagementText (){
        isDisplayed(lnkHelpResourceManagement);
        return this;
    }

    public DashBroad checkStudioUsageReportText (){
        isDisplayed(lnkStudioUsageReport);
        return this;
    }

    public StudioPage clickOnStudioManagement (){
        click(lnkStudioManagement);
        return new StudioPage(uiDriver);
    }

    public boolean isPageLoaded(){

        return true;
    }
}

