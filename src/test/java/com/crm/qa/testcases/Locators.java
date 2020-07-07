

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

public class Locators  extends TestBase {



    LoginPage loginPage;
    HomePage homePage;

    public Locators (){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
    }
/*
    @Test(priority=1)
    public void alerts() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
//counting i frames in the application
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        //driver.findElement(By.id("email")).sendKeys("charitha@media.com");

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.cssSelector("#email")).sendKeys("charithaaaaaaaaaaaa@media.com");
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("ch9285325");
        driver.findElement(By.linkText("Forgotten account?")).click();
driver.navigate().back();
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("Forgotten")).click();

    }
*/
    /*
    @Test(priority=1)
    public void get_text() throws InterruptedException {
        driver.get("https://login.salesforce.com/?locale=ap");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("#username")).sendKeys("cariya@e25.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("ch9285325");
        driver.findElement(By.cssSelector("#Login")).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".loginError"))).getText();
        System.out.println("this is x path"+driver.findElement(By.xpath("//*[@id='error']")).getText());
        System.out.println("this is css ."+driver.findElement(By.cssSelector(".loginError")).getText());
        System.out.println("this is css with "+driver.findElement(By.cssSelector("div[id='error']")).getText());
        System.out.println("this is css type01 "+driver.findElement(By.cssSelector("#error")).getText());
        System.out.println("this is css type02 "+driver.findElement(By.cssSelector("div#chooser>div.loginError")).getText());
        System.out.println("this is css regular expression"+driver.findElement(By.cssSelector("div[class*='loginErr']")).getText());
        System.out.println("this is xpath regular expression"+driver.findElement(By.xpath("//div[contains(@class,'loginE')]")).getText());

        WebElement textDemo = driver.findElement(By.xpath("//*[@id='error']"));
        String textdemo=driver.findElement(By.xpath("//*[@id='error']")).getText();
        String correct_validation = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        Assert.assertEquals(textdemo,correct_validation);

        if (textDemo.isDisplayed()) {
            System.out.println("Element found using texttttttttttttttttttttttt");
        } else
            System.out.println("Element not foundddddddddddddddddddddddddddddddddddddd");
        driver.quit();

        //driver.findElement(By.cssSelector(".loginError")).getText();




    }
*/


    @Test(priority=1)
    public void get_text_from_zybook() throws InterruptedException {
        driver.get("http://localhost:4200/signin");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        Thread.sleep(5000);

        driver.findElement(By.cssSelector(".user-email>.zb-input")).sendKeys("cariya@e25.com");
        driver.findElement(By.cssSelector(".user-password>.zb-input")).sendKeys("ch9285325");
        driver.findElement(By.cssSelector(".signin-button")).click();
        Thread.sleep(5000);
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".loginError"))).getText();
        System.out.println("this is x path:-"+driver.findElement(By.xpath("//div[@class='error']")).getText());
       System.out.println("this is multiple attribute css-: "+driver.findElement(By.cssSelector("div[class='error'][role='alert']")).getText());
       // System.out.println("this is css with "+driver.findElement(By.cssSelector("div[id='error']")).getText());
        System.out.println("this is css start with "+driver.findElement(By.cssSelector("div[class^='err']")).getText());
       System.out.println("this is css ends with "+driver.findElement(By.cssSelector("div[class$='rror']")).getText());
        System.out.println("this is css regular expression"+driver.findElement(By.cssSelector("div[class*='err']")).getText());
        //System.out.println("this is xpath regular expression"+driver.findElement(By.xpath("//div[contains(@class,'loginE')]")).getText());

        WebElement textDemo = driver.findElement(By.cssSelector("div[class='error']"));
        String textdemo=driver.findElement(By.cssSelector("div[class='error']")).getText();
        String correct_validation = "Invalid email or password";
        Assert.assertEquals(textdemo,correct_validation);

        if (textDemo.isDisplayed()) {
            System.out.println("Element found using texttttttttttttttttttttttt");
        } else
            System.out.println("Element not foundddddddddddddddddddddddddddddddddddddd");
        driver.quit();

        //driver.findElement(By.cssSelector(".loginError")).getText();




    }

    @Test(priority=2)
    public void css_Seelctors() throws InterruptedException {
        driver.get("http://localhost:4200/signin");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        Thread.sleep(5000);

        driver.findElement(By.cssSelector(".user-email>.zb-input")).sendKeys("cariya@e25.com");
        driver.findElement(By.cssSelector(".user-password>.zb-input")).sendKeys("ch9285325");
        driver.findElement(By.cssSelector(".signin-button")).click();
        Thread.sleep(5000);
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".loginError"))).getText();
        System.out.println("this is x path:-"+driver.findElement(By.xpath("//div[@class='error']")).getText());
        System.out.println("this is multiple attribute css-: "+driver.findElement(By.cssSelector("div[class='error'][role='alert']")).getText());
        System.out.println("this is css with  nth child"+driver.findElement(By.cssSelector("div>.error:nth-child(2)")).getText());
        System.out.println("this is css with div>child[]"+driver.findElement(By.cssSelector("div>.error[role='alert']")).getText());
        System.out.println("this is css start with "+driver.findElement(By.cssSelector("div[class^='err']")).getText());
        System.out.println("this is css ends with "+driver.findElement(By.cssSelector("div[class$='rror']")).getText());
        System.out.println("this is css regular expression"+driver.findElement(By.cssSelector("div[class*='err']")).getText());
        System.out.println("this is xpth expressionnnnnnnnn"+driver.findElement(By.xpath("//a[text()='Help/FAQ']")).getText());
        //System.out.println("this is xpath regular expression"+driver.findElement(By.xpath("//div[contains(@class,'loginE')]")).getText());

        WebElement textDemo = driver.findElement(By.cssSelector("div[class='error']"));
        //String textdemo=driver.findElement(By.cssSelector("div[class='error']")).getText();
        String textdemo=driver.findElement(By.cssSelector("div>.error[role='alert']")).getText();
        String correct_validation = "Invalid email or password";
        Assert.assertEquals(textdemo,correct_validation);

        if (textDemo.isDisplayed()) {
            System.out.println("Element found using texttttttttttttttttttttttt");
        } else
            System.out.println("Element not foundddddddddddddddddddddddddddddddddddddd");
        driver.quit();

        //driver.findElement(By.cssSelector(".loginError")).getText();

/*

direct child
div[zybookcode='WILKESCCCIS110NanayakkaAcademicYear2020'] >div >div>h3

//sub child-more re commended way
div[zybookcode='WILKESCCCIS110NanayakkaAcademicYear2020'] div >h3

//when there are so many links under one div or li
.deaultFunc >li:nth-child(2)






 */


    }






    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

