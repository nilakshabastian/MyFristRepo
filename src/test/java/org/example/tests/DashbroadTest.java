package org.example.tests;

import org.example.baseTest.baseTest;
import org.example.pages.DashBroad;
import org.example.pages.Login;
import org.example.pages.StudioPage;
import org.testng.annotations.Test;

public class DashbroadTest extends baseTest {

    Login loginPage;
    DashBroad dashbPage;
    StudioPage studioPage;

    @Test
    public void verify_Admin_Portal_Dashboard(){

        loginPage =new Login(driver);
        loginPage.enterEmailAddress("Nilakshab");
        loginPage.enterPassword("1qaz2wsx@A");
        dashbPage=loginPage.clickLoginBtn();
        studioPage = dashbPage.checkStudioManagementText()
                .checkTemplateManagementText()
                .checkProductConfigurationText()
                .checkHelpResourceManagementText()
                .checkStudioUsageReportText()
                .clickOnStudioManagement();
        dashbPage = studioPage.checkStudioView()
                .clickOnDashboard();
}}
