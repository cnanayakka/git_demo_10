package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.Select;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.Assert;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;

        import com.crm.qa.base.TestBase;
        import com.crm.qa.pages.HomePage;
        import com.crm.qa.pages.LoginPage;
public class mouse_interactions  extends TestBase {


/*
    LoginPage loginPage;
    HomePage homePage;

    public mouse_interactions(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
    }

    @Test(priority=1)
    public void alerts() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        //input[@id='name']
        Thread.sleep(5000);
        Actions mouse=new Actions(driver);
        mouse.moveToElement(driver.findElement(By.cssSelector(".icp-nav-flag.icp-nav-flag-us"))).build().perform();
        Thread.sleep(4000);
        mouse.moveToElement(driver.findElement(By.cssSelector(".nav-line-1-container"))).build().perform();
        Thread.sleep(8000);

        //composite action
        //driver.findElement(By.cssSelector(".icp-nav-flag.icp-nav-flag-us")));

    }









*/


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
