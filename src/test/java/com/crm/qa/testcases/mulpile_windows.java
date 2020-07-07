package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

import java.util.Iterator;
import java.util.Set;

public class mulpile_windows  extends TestBase {



    LoginPage loginPage;
    HomePage homePage;

    public mulpile_windows(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
    }
/*
    @Test(priority=1)
    public void alerts() throws InterruptedException {
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=en']")).click();
        System.out.println(driver.getTitle());
        Set<String> ids = driver.getWindowHandles();
        Thread.sleep(5000);
        Iterator <String> it=ids.iterator();
        String parentid=it.next();
        String child_window=it.next();
        driver.switchTo().window(child_window);
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentid);
        System.out.println(driver.getTitle());
        //input[@id='name']



        //composite action
        //driver.findElement(By.cssSelector(".icp-nav-flag.icp-nav-flag-us")));

    }






*/





    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
