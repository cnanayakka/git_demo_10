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
public class checkboxes extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    public checkboxesss(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
    }
/*
    @Test(priority=1)
    //Select values from static drop down(Drop downs which are traditional/wehn there are select & option tag)
    //depending on other drop downs (depending on user interaction)
    public void this_check_the_parent_child_relationship() throws InterruptedException {
        //String baseUrl = "https://rahulshettyacademy.com/dropdownsPractise/";
        String baseUrl = "https://www.spicejet.com/";

        driver.get(baseUrl);

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
        Thread.sleep(2000);
        //driver.findElement(By.id("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        driver.findElement(By.xpath("//div[@class='right1'] //a[@value='MAA']")).click();
        Thread.sleep(2000);
        String updated_text4=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getAttribute("selectedtext");
        System.out.println(updated_text4+"This is the updated text for detination"+updated_text4);

        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();

        //clicking on the check box
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        //check whether check box is selected
        Boolean x=driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //count of the checkboxes in the page
        int count=driver.findElements(By.cssSelector("input[type*='checkbox']")).size();
        System.out.println("There are"+count+"check boxes");

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        Thread.sleep(4000);
        //boolean result=driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
        String disable =driver.findElement(By.id("Div1")).getAttribute("style");
        System.out.println("drop down is ="+disable);
        
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
            System.out.println("depature is disabled");
            Assert.assertTrue(true);
        }
        else{
            Assert.assertFalse(false);
        }

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        Thread.sleep(4000);
        //checking drop down is enabled
        String enable =driver.findElement(By.id("Div1")).getAttribute("style").toString();
        System.out.println("drop down is = "+enable);



    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

 */
}
