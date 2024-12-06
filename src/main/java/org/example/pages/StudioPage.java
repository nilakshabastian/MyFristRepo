package org.example.pages;

import org.example.basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudioPage extends BasePage {



    public StudioPage(WebDriver uiDriver) {
        super(uiDriver);
        this.uiDriver=uiDriver;
    }

    private By txtStudioView = By.xpath("//*[text()=' Studio View']");
    private By lnkDashboard = By.xpath("//*[text()='DASHBOARD']");

    public StudioPage checkStudioView(){
        isDisplayed(txtStudioView);
        return this;
    }

    public DashBroad clickOnDashboard(){
        click(lnkDashboard);
        return new DashBroad(uiDriver);
    }


}
