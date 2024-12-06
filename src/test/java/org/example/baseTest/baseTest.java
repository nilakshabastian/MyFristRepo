package org.example.baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class baseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ezp-qa-admin.ezpassport.online/dashboard");




    }

    @Test


    @AfterTest

    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }

}
