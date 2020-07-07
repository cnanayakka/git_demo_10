
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


public class composite extends TestBase {

/*

    LoginPage loginPage;
    HomePage homePage;

    public composite(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
    }
//move to search ad send capitL LETTERS
    @Test(priority=1)
    public void composite01() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        //input[@id='name']
        Thread.sleep(5000);
        Actions mouse=new Actions(driver);
        mouse.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("charitha").doubleClick().build().perform();
        mouse.moveToElement(driver.findElement(By.cssSelector(".nav-swm-text-widget"))).contextClick().build().perform();





        Thread.sleep(4000);




    }


*/









    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

