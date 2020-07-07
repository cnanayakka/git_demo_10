package com.crm.qa.testcases;
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
public class Alert  extends TestBase{



    LoginPage loginPage;
    HomePage homePage;

    public Alert(){
        super();
    }
/*
    @BeforeMethod
    public void setUp(){
        initialization();
    }

    @Test(priority=1)
    public void alerts() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //input[@id='name']
        Thread.sleep(8000);
        driver.findElement(By.cssSelector("[id='name']")).sendKeys("charitha");

        driver.findElement(By.cssSelector("[id='alertbtn']")).click();
        Thread.sleep(4000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("[id='name']")).sendKeys("sapumal");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
        Thread.sleep(4000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

    }








*/



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
