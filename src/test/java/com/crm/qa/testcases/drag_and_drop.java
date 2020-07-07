

package com.crm.qa.testcases;
/*
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

public class drag_and_drop extends TestBase {



    LoginPage loginPage;
    HomePage homePage;

    public drag_and_drop(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
    }

    @Test(priority=1)
    public void alerts() throws InterruptedException {
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(5000);
//counting i frames in the application
       System.out.println(driver.findElements(By.tagName("iframe")).size());

        //driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
        driver.switchTo().frame(0);
        //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        driver.findElement(By.cssSelector(".ui-widget-header.ui-droppable")).click();
Actions a=new Actions(driver);
WebElement drag=  driver.findElement(By.cssSelector(".ui-draggable-handle"));
        WebElement Drop=driver.findElement(By.cssSelector(".ui-widget-header.ui-droppable"));
a.dragAndDrop(drag,Drop).build().perform();
driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("a[href='https://jqueryui.com/resizable/']")).click();



        Set<String> ids = driver.getWindowHandles();
        Thread.sleep(5000);
        Iterator<String> it=ids.iterator();
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












    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}

*/