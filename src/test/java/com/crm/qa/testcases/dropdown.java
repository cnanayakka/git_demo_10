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

public class dropdown extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public dropdown(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	//select from static drop down
	//when there is select option
/*
	@Test(priority=1)
	//Select values from static drop down(Drop downs which are traditional/wehn there are select & option tag)
	public void Select_static_drop_down(){
		String baseUrl = "https://www.spicejet.com";
		driver.get(baseUrl);
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
		s.selectByValue("AMD");
		s.selectByIndex(6);
		s.selectByVisibleText("Dubai, All Airports (DXB)");

	}
//Click on UI and again clic on other UI drop down
	@Test(priority=2)
	public void select_dynamic_drop_down() throws InterruptedException {
		String baseUrl = "https://www.spicejet.com";
		driver.get(baseUrl);
		Thread.sleep(20000);
		driver.findElement(By.id("divpaxinfo")).click();
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		//Thread.sleep(20000);
		String Text=driver.findElement(By.id("divpaxinfo")).getText();
		System.out.print("This is" +Text);
		s.selectByIndex(4);
		String Text02=driver.findElement(By.id("divpaxinfo")).getText();
System.out.print("This is" +Text02);

	}

	@Test(priority=3)
	//Select values from static drop down(Drop downs which are traditional/wehn there are select & option tag)
	//depending on other drop downs (depending on user interaction)
	public void Select_dynamic_drop_down() throws InterruptedException {
		String baseUrl = "https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(baseUrl);

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();


	}
	@Test(priority=4)
	//Select values from static drop down(Drop downs which are traditional/wehn there are select & option tag)
	//depending on other drop downs (depending on user interaction)

	public void Select_dropdown_from_while_loop() throws InterruptedException {
		String baseUrl = "https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(baseUrl);
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("divpaxinfo")));
		element.click();
		Thread.sleep(15000);
		int i=1;
		while(i<5) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			i++;
		}
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		String updated_text=driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println("This is the updated text"+updated_text);

	}

	@Test(priority=5)
	//Select values from static drop down(Drop downs which are traditional/wehn there are select & option tag)
	//depending on other drop downs (depending on user interaction)
	public void this_check_the_parent_child_relationship() throws InterruptedException {
		String baseUrl = "https://rahulshettyacademy.com/dropdownsPractise/";
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

	}

	@Test(priority=6)
	//Select values from static drop down(Drop downs which are traditional/wehn there are select & option tag)
	//depending on other drop downs (depending on user interaction)
	public void auto_suggest_drop_down() throws InterruptedException {
		String baseUrl = "https://www.makemytrip.com/flights/";
		driver.get(baseUrl);


		driver.findElement(By.xpath("//label[@for='fromCity'] //input[@class='fsw_inputField font30 lineHeight36 latoBlack']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys("srilanka");
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//p[@class ='font14 appendBottom5 blackText'])[1]")).click();
		driver.findElement(By.xpath("//input[starts-with(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[starts-with(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[starts-with(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[starts-with(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys(Keys.ENTER);
		Thread.sleep(15000);

	}
*/
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
