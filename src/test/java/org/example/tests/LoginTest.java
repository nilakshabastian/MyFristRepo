package org.example.tests;

import org.example.baseTest.baseTest;
import org.example.pages.DashBroad;
import org.example.pages.Login;
import org.testng.annotations.Test;

public class LoginTest extends baseTest {

    Login loginPage;
    DashBroad dashbPage;

    @Test
    public void verifysuccesfullylogin(){

        loginPage =new Login(driver);
        loginPage.enterEmailAddress("Nilakshab");
        loginPage.enterPassword("1qaz2wsx@A");
        dashbPage=loginPage.clickLoginBtn();
        System.out.println(dashbPage.isPageLoaded());
    }


}
